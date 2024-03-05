import random
positives = [
    "It is certain", 
    "It is decidedly so", 
    "Without a doubt",
    "Yes definitely", 
    "You may rely on it",
    "As I see it, yes",
    "Most likely",
    "Outlook good",
    "Yes",
    "Signs point to yes"
]

neutrals = [
    "Reply hazy, try again",
    "Ask again later",
    "Better not tell you now",
    "Cannot predict now",
    "Concentrate and ask again"
]

negatives = [
    "Don't count on it",
    "My reply is no",
    "My sources say no",
    "Outlook not so good",
    "Very doubtful"
]

# these are terminal color codes. 
# if you're running the code in a terminal it'll add color to the output
# but if you're running the code elsewhere it'll just output gibberish, so you can remove them
C_RESET = "\033[0m"
C_BOLD = "\033[1m"
C_GREEN = "\033[1;32m"
C_YELLOW = "\033[1;33m"
C_RED = "\033[1;31m"

while True:
    print(C_RESET + "---")
    text = input(C_BOLD + "What would you like to ask the 8 ball? " + C_RESET)
    if text == "quit":
        break
    selection = random.randint(0, 4)
    if selection == 1:
        print(C_RED + random.choice(negatives))
    elif selection == 2:
        print(C_YELLOW + random.choice(neutrals))
    else:
        print(C_GREEN + random.choice(positives))