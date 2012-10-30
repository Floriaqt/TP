 require ‘csv’

 i = 0
 s = 0.00
    CSV.open(“result_feature_scenarios_times.csv”, “wb”) do |csv|
        CSV.foreach(“feature_scenarios_times.csv”) do |row|
            if (row[1].include? "instance_create_update")
                s += row[0].to_f
                i += 1
            end
    end
    csv << [s]
    csv << [i]

end  
