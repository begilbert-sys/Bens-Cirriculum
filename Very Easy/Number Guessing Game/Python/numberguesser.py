import random
number = random.randint(0, 100)
while True:
    guess = int(input("Guess a number:"))
    if guess > number:
        print("too high!")
    elif guess < number:
        print("too low!")
    else:
        print("you got it!")
        break