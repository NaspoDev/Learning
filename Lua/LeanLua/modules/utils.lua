local utils = {
    add_nums = function(a, b)
        return a + b
    end,
    subtract_nums = function(a, b)
        return a - b
    end
}

-- A module is the result of whatever is returned from a file.
-- Its like using return instead of export, but you can only return one thing
-- so it's good to make it a table.

return utils
