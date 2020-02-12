# ocp-templatemethod-lab
CSC 309 Lab on the Open-Closed Principle and Template Method Design Pattern

*A software artifact (e.g., module, class, package, component) should be open for extension but closed for modification*

*Apply the template method design pattern to define an extensible skeleton (i.e., template) of an algorithm and allow subclasses to redefine certain steps of the algorithm (that's being open for extension) without changing its structure and without having to change other classes in the design (that's being closed for modification).*

## Overview of this repo

Inside you will find the beginnings of a ground-breaking coffee brewery. Unfortunately in the rush to get features completed the main CoffeeMaker class is starting to turn into a big ball of mud.

You'll start by adding one more feature to it to get it into a right mess, then we'll fix it up good.

There's also an example before and after refactoring placed in separate folders.

## Getting started

1. Fork this repo.
2. Clone your fork to make a local copy.
2. Build it.

## Making the situation worse...

### Feature: Making a new type of coffee -- Americano

* **As a** WWII veteran
* **I want** to drink an Americano coffee
* **So that** I can remind the old times during the WWII in Italy when we had to dilute espresso with hot water

Add a new type of coffee to ```CoffeMaker``` that follows this recipe: first, ```boilWater()```, then ```brewEspresso()```, then ```addIngredients()``` (which in this case it is just to add more water), and the ```finalTouch()``` is to add sugar and cream.
