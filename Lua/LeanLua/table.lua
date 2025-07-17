-- Lua only has one data structure, the Table.
-- It can be used to represent arrays, dictionaries, graphs, trees, and more.

-- Table as a list
local list = {"apple", "banana", "peach", 10, false} -- tables can have mixed types
local first = list[1] -- Lua uses 1-Based indexing!
local length = #list -- # is the length operator in lua, only works for tables as arrays.

-- Table as a map
local map = {
    my_key = "my value",
    ["special key"] = "my value" -- if your key has spaces or special characters you can define it like so. 
}
local my_key_value = map.my_key
local special_key_value = map["special key"]