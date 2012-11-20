require 'open-uri'

file = open('http://en.wikipedia.org/wiki/Regular_expression')
contents = file.read
result = contents.scan(/<a\s+href=\".*?\"/)
result.each do |r|
   p r[9..-2]
   puts
end
p result.length
