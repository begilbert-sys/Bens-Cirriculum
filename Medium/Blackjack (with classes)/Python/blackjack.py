import random
class Card:
    values = ["Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"]
    suits = ["Diamonds", "Hearts", "Clubs", "Spades"]
    def __init__(self, value, suit):
        if value not in self.values: 
            raise ValueError(value + " is not a valid value")
        if suit not in self.suits:
            raise ValueError(suit + " is not a valid suit")
        self.value = value
        self.suit = suit

    def __repr__(self):
        return self.value + " of " + self.suit
    
    def int_value(self):
        if self.value == "Ace":
            return 11
        elif self.value in ["Jack", "Queen", "King"]:
            return 10
        else:
            return int(self.value)
    
# build the deck
deck = []
for value in Card.values:
    for suit in Card.suits:
        new_card = Card(value, suit)
        deck.append(new_card)

random.shuffle(deck)

def hand_total(hand):
    total = 0
    hasAce = False
    for card in hand:
        if card.value == "Ace":
            hasAce = True
        total += card.int_value()
    if hasAce and total > 21:
        total -= 10
    return total 

player_hand = []
dealer_hand = []

for i in range(2):
    player_hand.append(deck.pop())
    dealer_hand.append(deck.pop())

print("Welcome to blackjack!")
print("The value of an ACE automatically changes to whatever benefits you the most")
print("The dealer's first card is a", dealer_hand[0])

# iterate through the player's turn 
while True:
    print("---")
    print("Your current hand is", player_hand)
    player_hand_total = hand_total(player_hand) 
    if player_hand_total >= 21:
        break
    print("Your hand's total is", player_hand_total)
    answer = input("Would you like to hit or stand?: ").lower()
    if answer == "hit":
        new_card = deck.pop()
        print("You drew a", new_card)
        player_hand.append(new_card)
    elif answer == "stand":
        print("You chose to stand")
        break
    else:
        print("Invalid option")
print("-----")
player_hand_total = hand_total(player_hand)
print("Your final total is:", hand_total(player_hand))

# the := operator (walrus operator) is used to reassign the value of dealer_hand_total AND compare it to 16, in the same line 
# if you don't like it, you're not alone. the creator of python got so much criticism for adding it that he stepped down!
while (dealer_hand_total := hand_total(dealer_hand)) <= 16:
    dealer_hand.append(deck.pop())
print("-----")
print("The dealer's final hand is", dealer_hand)
print("The dealer's final total is", dealer_hand_total)
if player_hand_total == dealer_hand_total or ((player_hand_total > 21) and (dealer_hand_total > 21)):
    print("It was a tie")
elif player_hand_total <= 21 and (player_hand_total > dealer_hand_total or dealer_hand_total > 21):
    print("You won!")
else:
    print("You lost. . .")