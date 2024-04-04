users = {}
while True:
    print('---')
    login_or_signup = input("do you want to log in or sign up")
    if login_or_signup == "sign up":
        username = input("Create a username: ")
        password = input("Create a password: ")
        users[username] = password
    elif login_or_signup == "log in":
        username = input("Provide your username: ")
        password = input("Provde your password: ")
        if username not in users:
            print(f"Username {username} does not exist")
            continue
        correct_password = users[username]
        if correct_password != password:
            print("your password was incorrect")
            continue
        print(f"Welcome to your account, {username}")
    else:
        print("{login_or_signup} is not a valid option")
