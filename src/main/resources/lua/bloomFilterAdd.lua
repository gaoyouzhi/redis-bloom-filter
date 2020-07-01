local values = KEYS
local bloomName = ARGV[1]
local result_1
for k,v in ipairs(values) do
 result_1 = redis.call('BF.ADD',bloomName,v)
end
return result_1