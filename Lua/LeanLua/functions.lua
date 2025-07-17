local function sayHi(name)
    print("Hi,", name)
end

-- Functions can also be values (i.e. assign to a variable).
local greet = function (name)
    -- .. is string concatenation.
    print("Hello, " .. name .. "!")
end

sayHi("Athanasios")
greet("Lauren")

-- Functions in lua are First-Class objects, which means they can be
-- passed into other functions as parameters.

local function doSomethingLater(callback)
    print("Doing something before...")
    callback()
    print("Do something after...")
end

local function something()
    print("yo")
end

doSomethingLater(something)