-- Lua only has one data structure, the Table.
-- It can be used to represent arrays, dictionaries, graphs, trees, and more.

-- Table as a list
local list = {"apple", "banana", "peach"}
local first = list[1] -- Lua uses 1-Based indexing!

-- Table as a map
local map = {
    my_key = "my value",
    ["special key"] = "my value" -- if your key has spaces or special characters you can define it like so. 
}
local my_key_value = map.my_key
local special_key_value = map["special key"]