# From same package:
import converters
from utils import get_name  # importing just one thing from a module. Then you can run it just like a local function

# From different package:
import ecommerce.shipping  # importing a module in a different package (NOT PREFERRED WAY) [1]
from ecommerce import shipping  # importing a module in a different package (PREFERRED WAY) [2]
from ecommerce.shipping import calculate_shipping  # import just one function from a module in a different package [3]
import ecommerce.shipping as sp  # import with alias [4]

# Checking if the __name__ of the fine is "__main__" then running a main function is not required at all,
# but is good practice when working with scripts and modules.


def main():
    print("This is the start of my program!")
    print("Name of the utils.py file: " + get_name())
    print(f"70 kgs to pounds = {converters.kg_to_lbs(70)}")
    ecommerce.shipping.calculate_shipping()  # [1]
    shipping.calculate_shipping()  # [2]
    calculate_shipping()  # [3]
    sp.calculate_shipping()  # [4]


if __name__ == "__main__":
    main()
