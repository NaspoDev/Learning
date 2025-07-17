-- Functions

local function say_hi(name)
    print("Hi,", name)
end

-- Functions can also be values (i.e. assign to a variable).
local greet = function (name)
    -- .. is string concatenation.
    print("Hello, " .. name .. "!")
end

say_hi("Athanasios")
greet("Lauren")

-- Functions in lua are First-Class objects, which means they can be
-- passed into other functions as parameters.

local function do_something_later(callback)
    print("Doing something before...")
    callback()
    print("Do something after...")
end

local function something()
    print("yo")
end

do_something_later(something)

-- Returning Multiple Values
-- Functions can return multiple values.

local function get_values()
    return 1, 2, 3
end

local val1, val2, val3 = get_values()