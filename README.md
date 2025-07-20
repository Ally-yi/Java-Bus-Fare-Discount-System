# Java Inheritance Practice: Bus Fare Discount System

A Java programming assignment for practicing inheritance. Includes abstract superclass and subclasses representing Adult, Senior, and SuperSenior fares, with proper overriding and discount calculations.

## 📘 Description

This is a **Java inheritance practice project**. The program simulates a bus fare system with different passenger types using:

- Abstract class
- Inheritance (`extends`)
- Method overriding (`@Override`)
- Access modifiers (`protected`, `final`)
- Constants to avoid magic numbers


## 🏗️ Class Structure

- `BusFare.java`: Abstract superclass that defines the base fare and ticket color.
- `Adult.java`: Subclass that uses regular fare and color.
- `Senior.java`: Subclass that applies 50% discount on the fare and overrides color.
- `SuperSenior.java`: Subclass that inherits from `Senior` and applies an additional 50% discount.
- `MyBusFare.java`: Main test program that creates and prints fare info for different passenger types.

## 📄 Output Example

```Python
Fare: 3.0, color=grey
Fare: 6.0, color=red
Fare: 1.5, color=white
```
