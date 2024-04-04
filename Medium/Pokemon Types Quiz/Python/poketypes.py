import random
import json

# this is just for importing the file, don't let it intimidate you
from pathlib import Path

# this line grabs the full filename of the "pokemon.json" file 
pokemon_file_path = str(Path(__file__).parent.parent) + "/pokemon.json"

# these two lines read the file and put all the contents into a dictionary
with open(pokemon_file_path) as file:
    poketypes = json.load(file)

streak = 0
done = False
while not done:
    print("Current streak:", streak)
    print('---')
    # poketypes.keys() gets all of the keys in our ditionary (so, all the pokemon names)
    # we then use random.choice() to choose a pokemon at random, but we have to convert the keys into a list first 
    random_pokemon = random.choice(list(poketypes.keys()))
    guessed = []
    for i in range(len(poketypes[random_pokemon])):
        guess = input(f"List {random_pokemon}'s type {i + 1}: ").lower()
        if guess == "quit":
            done = True
            break
        if guess not in poketypes[random_pokemon] or guess in guessed:
            print("Incorrect! The correct types were", poketypes[random_pokemon])
            streak = 0
            break
        else:
            print("Great job!")
            streak += 1

