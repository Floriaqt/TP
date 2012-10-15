class AirPlane
	def initialize
		@seats =Array.new(6){Array.new(27){0}}
	end	
	def add(rand)
		j=0
		i=0
		add=0
		for i in 0...27
		for j in 0...6				
			if (@seats[j][i] == 0)

				if(rand==1)
		        	@seats[j][i]=1
					add=1				
				elsif(rand==2)
					if(j<5)
						if(@seats[j+1][i]==0)
							if(j!=2 && j!=5)
								@seats[j][i]=1
								@seats[j+1][i]=1
								add=1								
							end							
						end						
					end
				elsif(rand==3)
					if(j<4)
						if(@seats[j+1][i]==0 && @seats[j+2][i]==0)
							if(j==0 || j==3)
								@seats[j][i]=1
								@seats[j+1][i]=1
								@seats[j+2][i]=1
								add=1								
							end							
						end						
					end
				end
			end
			if(add==1)
				break
			end				
		end
		if(add==1)
				break
		end	
	end
end
def printSeats
	for i in 0...27
		for j in 0...6
			if j==3
				print "|_|"
			end
			print @seats[j][i]			
		end
		print "\n"		
	end
end

end
p = AirPlane.new
p.printSeats
p.add(3)
p.add(1)
p.add(2)
p.add(3)
p.add(2)
p.add(1)
p.printSeats