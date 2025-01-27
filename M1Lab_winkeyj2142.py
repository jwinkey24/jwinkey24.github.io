#Have user input their total item amount
userItems = float(input("How many items do you have?: "))
if userItems > 100:
    itemPrice = 4.00
elif userItems < 99:
    itemPrice = 4.25
elif itemPrice < 49:
    itemPrice = 4.50
elif itemPrice < 19:
    itemPrice = 4.75
else:
    print("I'm sorry you entered the incorrect number of items.")

ItemCost = userItems * itemPrice

print(userItems)
print(itemPrice)
print(ItemCost)