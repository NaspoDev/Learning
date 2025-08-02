local count = 0

while count < 10 do
    print(count)
    count = count + 1
end

-- repeat-until is like do-while, it will execute at least once

local myCondition = false

repeat
    print("I will execute at least once")
    myCondition = true
until myCondition
