# Cirriculum

# Introduction
Hello! I tutor programming to kids in their teens. The following is a list of projects I like to complete with students to keep them engaged. 

Each project is ranked by how difficult they are for my teen students to complete, so if you're in college or older they'll likely be easier than their ranking. The source code for each project is written in both Python and Java. The projects are pretty simple, so implementations in statically typed languages like C# and C++ shouldn't be too different from the Java implementations. However I'll likely add support for more languages in the future. 


# Easy
## Currency Conversion
**Topics Covered**: Dictionaries/Maps, Basic Loops

Start by creating a dictionary/map of a few currencies and their conversion rates to USD. Ask the user what currency they'd like to choose, and how much they'd like to convert, and then print the result. Put the program in a loop to allow them to repeat. 

## Random Number Guesser
**Topics Covered**: Basic Loops 

Generate a random number. Allow the user to guess the number, and tell them if their guess was too low or too high. Let them keep guessing until they get the number correct. 

### Math Problem Generator
**Topics Covered**: Lists, Switch Statements (if not using Python)

#### Description
Make a list of all the operators (plus, minus, times, and division. Modulo and exponents too if you want). Choose one of the operators at random, and then choose two random numbers and pprint the resulting equation, which they then have to solve.

#### Teaching Notes
When teaching this in Python I don't bother with the match statements because they're rarely used and the student(s) will just wonder why we didn't use if/elif. In other languages where switch statements are used more often I will teach it that way. 

# Medium
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