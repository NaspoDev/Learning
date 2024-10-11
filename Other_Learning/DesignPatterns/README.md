# Design Patterns

Learning essential design patterns of programming.\
Following [this](https://www.youtube.com/watch?v=tAuRQs_d9F8&ab_channel=NeetCode) video.

---

### There are 8 design patterns:
#### Factory, Builder, Singleton, Observer, Iterator, Strategy, Adapter, Facade

Within these, they can be divided into **3 categories**:
1. Creational patterns
2. Behavioural patterns
3. Structural patterns

---

## Creational Patterns

### Factory
The factory pattern is a creational pattern that uses a factory class to create objects.

Example:\
You have a `BurgerFactory` class which creates different types of burgers (`Burger` class).\
You can run things like `burgerFactory.createCheeseBurger()` which will create and return a 
Burger object with the necessary ingredients for a cheeseburger.

### Builder
The builder pattern is a creational pattern that allows the construction of an object step by step.

Example:\
The `BurgerBuilder` class has methods like `addCheese()`, `addTomato()`, `addLettuce()` etc.\
We don't have to pass in all the ingredients at once.
Then you can call `burgerBuilder.build()` to return a `Burger` object with the ingredients you added.

### Singleton
A singleton is a class that can only have one instance of it instantiated.

Example:\
You want to maintain global Application state. The App class should only be instantiated once.

## Behavioural Patterns

### PubSub (aka Observer, aka Topic)
The PubSub pattern is a behavioural pattern that allows the publisher to notify
the subscribers upon some action.

Example:\
A YouTube channel has many subscribers. When the channel uploads a new video, all the subscribers
are notified.

### Iterator
A behavioural pattern that defines how the values in an object can be iterated through.

Example:\
Iterating through a binary tree or a linked list.

### Strategy
A behavioural pattern that allows you to define a family of algorithms, following the open-closed principle.
Open to extension, closed to modification.

Example:\
A Filter Strategy that can be applied to a list of items. You can have different implementations of the
filter strategy, like remove all odd numbers, remove all negative numbers, etc...

## Structural Patterns

### Adapter
A structural pattern that allows incompatible interfaces to work together.

Example:\
Usb Cable can plug into a USB port, but a microUSB cable cannot. You can use an adapter to
make them work together.

### Facade
A structural pattern that provides a simplified interface to a complex system.

Example:\
We can create an OrderFacade class that has a `createOrder()` method. When this method is called, 
it will call/run all the other necessary logic to actually create an order. Like `Waiter.writeOrder()`,
`Waiter.sendToKitchen()`, `Chef.cookOrder()`, etc...

Example #2:\
Another example could be HTTP apis that abstract away the complexity of making HTTP requests.\
Like javascript's built-in `fetch()` API.

Example #3:\
ArrayLists in Java. They are a facade for arrays. You can add, remove, get elements easily,
but under the hood it's an actual array. It's resizing the array, shifting elements, etc...