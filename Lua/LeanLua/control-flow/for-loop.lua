-- For loops
local fruit = {"apple", "banana", "peach"}

-- for start index variable, stop
-- in this case, our stop value is the length of the list.
for i = 1, #fruit do
    print(fruit[i])
end

-- iterative for loop
-- ipairs() (like integer pairs), referring to using the index. So, for arrays.
-- It returns: index, value 
for i, v in ipairs(fruit) do
    print(v .. " is at index " .. i)
end

-- Looping through a map

local map = {
    key1 = 10,
    key2 = 20
}

-- pairs() is used for tables that act as maps.
-- It returns: key, value
for key, value in pairs(map) do
    print(value, "is the value to", key)
end