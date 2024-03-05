currencies = {
    "USD": 1.0,
    "GBP": 0.79,
    "EUR": 0.93,
    "YEN": 150.22,
    "CNY": 7.12,
    "MXN": 17.05, 
    "INR": 82.99
}
print("Available currencies:")
for item in currencies:
    print(item)
print()
while True:
    currency = input("What currency do you want to use?")
    if currency == "quit":
        break
    if currency not in currencies:
        print("invalid currency!")
        continue
    money = float(input("How much money do you have?"))
    print("You have %.2f money in %s" % (currencies[currency] * money, currency))
    print("---")