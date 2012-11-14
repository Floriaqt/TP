def main
	def check?(symbol)
		symbol.to_s.match(/\A[+-]?\d+?(\.\d+)?\Z/) == nil ? false : true
	end

	STDOUT.flush
	q = gets.chomp.split(" ")
	stack = []

	q.each do |x|
		if check?(x)
			stack.push(x.to_f)
		elsif (x == "+" && stack.size >= 2)
			second = stack.pop()
			first = stack.pop()
			stack.push(first + second)
			end
	end
	puts stack.pop()
end

main