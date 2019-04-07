# Weekend Homework - Ray's Music Exchange

:star: This is a PDA Homework :star:

You are being asked to model a music shop. This shop will contain items which can be sold. These items might be instruments, which someone may play e.g. guitar, saxaphone, piano, etc, or, they might be other items, e.g. guitar strings, drum sticks, sheet music  etc. Each item which can be sold will have both a price at which the shop bought the item, and a price at which the item will be sold.

You will need to:

1. Create a Interfaces.IPlay interface that could be applied to instruments. This should have a play method that returns the sound of the instrument being played as a String. :white_check_mark:

2. Create classes for different types of instruments e.g. guitars, pianos, etc. (any you can think of). Each class will have its own instance variables for attributes particular to that instrument e.g. a guitar may have a number of strings, a trumpet may have a number of valves etc. :white_check_mark:

3. Create an instruments.Instrument superclass which contains attributes you see as being common to all instruments e.g. material it is made from, colour, type (Brass, String, Woodwind, Keyboard etc). The classes created in step 2 above can then inherit from this Instruments class. :white_check_mark:

4. Create a Interfaces.ISell interface which has a calculateMarkup method, which returns an int/double, based on the buying price and the selling price. :white_check_mark:

5. Create classes for items the shop may sell, i.e. which implement the Interfaces.ISell interface. Such items should have the following:
  - a type/description e.g. guitar, drum sticks, guitar strings, sheet music etc.
  - a price at which the shop bought the item.
  - a price at which the shop plans to sell the item.

  Some Interfaces.ISell items will be musical instruments i.e. instruments can be both Interfaces.IPlay and Interfaces.ISell. :white_check_mark:

6. Create a Shop class, which has a collection of Interfaces.ISell items, called stock. In your shop you should be able to:
  -  add items to stock. :white_check_mark:
  -  remove items from stock. :white_check_mark:

# Possible Extensions

1. Using the calculateMarkup method for each item in stock, create a method which gives the total potential profit for the shop.
2. Create and use an enum for instrument types e.g. keyboard, wind, brass etc :white_check_mark:
3. Any other extensions you may wish to add.

## Remember
Use TDD, with separate test files for each class.


### PDA Reminder:

As part of this homework you are required to take screenshots of the following:

```
 - Demonstrate the use of Polymorphism in a program.
 - An Inheritance Diagram
```

Take a screenshot of the use of Inheritance in a program. Take screenshots of: 

```
 - A Class
 - A Class that inherits from the previous class
 - An Object in the inherited class
 - A Method that uses the information inherited from another class.
```


- Go to your [PDA Checklist](https://github.com/codeclan/pda/tree/master/Evidence%20Gathering%20Portfolio)

- Submit your PDA evidence (screenshots, etc.) to your own PDA repo

- PDA Reference: I.T 2, I.T 7, A.D 5
