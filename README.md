# Ben's Cirriculum

# Introduction
Welcome! I tutor programming to kids in their teens. The following is a list of projects I like to complete with my students. 

Exercises are important. But if you give your average beginner nothing but leetcode problems, they're gonna get bored fast. Making simple interactive games can be a lot more engaging. 

Each project is ranked by how difficult they are for my teen students to complete, so if you're past high school they'll likely seem easier than their ranking. The source code for each project is written in both Python and Java. The projects are pretty simple, so implementations in statically typed languages like C# and C++ shouldn't be too different from the Java implementations. Regardless, I'll add support for more languages in the future. 

My favorite projects are marked with stars ⭐ .


# Easy
## Currency Conversion
**Topics Covered**: Dictionaries/Maps, Basic Loops

Create a dictionary/map of a few currencies and their conversion rates to USD. Ask the user what currency they'd like to choose, and how much they'd like to convert, and then print the result. Put the program in a loop so they can ask as much as they'd like. 

## ⭐ Random Number Guesser ⭐ 
**Topics Covered**: Basic Loops 

**Assignment**

Generate a random number. Allow the user to guess the number, and tell them if their guess was too low or too high. Let them keep guessing until they get the number correct. 

There's an optimal strategy for in this game, and it's a great introduction to the computer science algorithm <a href="https://en.wikipedia.org/wiki/Binary_search_algorithm">Binary Search</a>.

## Math Problem Generator
**Topics Covered**: Lists, Switch Statements (if not using Python)

#### Assignment
Make a list of the standard math operators (Plus, minus, times, and division. Modulo and exponents too if you want). Choose one of the operators at random, and then choose two random numbers and print the resulting equation. Ask the user to solve this equation. 




# Medium

## Pokemon Types Quiz
**Topics Covered:** Lists | Dictionaries/Maps

**Assignment:**
<a href="https://en.wikipedia.org/wiki/JSON">JSON</a> is simple way to store data in the form of lists and dictionaries. I've provided a .json file containing every single pokemon along with a list of their type(s). Your job is to use this file to create a quiz which chooses a pokemon at random and asks the user to give the pokemon's types. Add a streak that tracks how many in a row they get correct. 

I'd recommend stealing the code I wrote to read the JSON file, especially if you're using Java.

This program can be done with any set of data. So if you're not a fan of Pokemon, I've also provided json files containing US state capitals and country capitals. 

## Blackjack with Classes

**Topics Covered**: Lists | Functions | Classes | Exception Throwing

Make the card game Blackjack, with a class to represent a card and a list of those cards representing a deck. 

This is a "win" or "lose" game and doesn't contain a betting system, but feel free to try adding one on your own. 



# Very Hard
### 2048

I complete this project in 4 steps:

1. Build a 2D array to represent the board, and display it (easy)
2. Place a tile randomly on the board (easy)
3. Place a tile randomly on the board, but ONLY on blank spaces (hard)
4. Program a single tile to move in all 4 directions (hard)
5. Program a single tile to merge with another tile of the same value (medium)
6. Program the entire board to move in all 4 directions (medium)
7. Check if you won (easy)
8. (Optional) Tiles should only combine if they are adjacent, ensure that this is happening (hard)

For parts (4) and (6), I usually have the student create a 4 seperate methods for each direction. Although it's possible to absatract these steps into single methods, it's pretty torturous to figure out so I usually spare them. 