-- Lua only has one data structure, the Table.
-- It can be used to represent arrays, dictionaries, graphs, trees, and more.

-- Table as a list
local list = { "apple", "banana", "peach", 10, false } -- tables can have mixed types
local first = list[1]                                  -- Lua uses 1-Based indexing!
local length = #
    list                                               -- # is the length operator in lua, only works for tables as arrays.

-- Table as a map
local map = {
    my_key = "my value",
    ["special key"] = "my value" -- if your key has spaces or special characters you can define it like so.
}
local my_key_value = map.my_key
local special_key_value = map["special key"]

-- You can also define properties on a table on the fly like so:
map.test = "hello"

-- Table as an Object
-- You can use tables with functions to construct objects.

-- This new_dog function returns a new instance of a Dog object (a table).
local function new_dog(name, age, bark_sound)
    return {
        name = name,
        age = age,
        bark = function()
            print(bark_sound)
        end
    }
end

local rocket = new_dog("Rocket", 12, "Arf!")
local cooper = new_dog("Cooper", 11, "Woof!")

print(rocket.name, "is", rocket.age, "years old.")
print(cooper.name, "is", cooper.age, "years old.")
print("Rocket says: ")
rocket.bark()
print("Cooper says: ")
cooper.bark()
