#Have user input their total item amount
userItems = float(input("How many items do you have?: "))
itemPrice = 0
#Create structure for while loop
i = 1
#Create a if statement concurrent to the problem
while i == 1:
    if userItems >= 100:
        itemPrice = 4.00
    elif userItems <= 99 and userItems >= 50:
        itemPrice = 4.25
    elif itemPrice <= 49 and userItems >= 20:
        itemPrice = 4.50
    elif itemPrice <= 19 and userItems >= 1:
        itemPrice = 4.75
    else:
        print("I'm sorry you entered the incorrect number of items.")
#Calculate the item cost
    ItemCost = userItems * itemPrice
#Print the final results
    print(f"The amount of items are : {userItems}")
    print(f"The price of the items are: {itemPrice}")
    print(f"The Cost of the items are: {ItemCost}")
    i = int(input("Would you like to run, 1 for yes, 0 for no. "))
