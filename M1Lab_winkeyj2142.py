#Have user input their total item amount
userItems = float(input("How many items do you have?: "))
itemPrice = 0
i = 1 
while i < 100
if userItems > 100:
    itemPrice = 4.00
    continue
if userItems <= 99:
    itemPrice = 4.25
    continue
if itemPrice <= 49:
    itemPrice = 4.50
    continue
if itemPrice <= 19:
    itemPrice = 4.75
    continue
else:
    print("I'm sorry you entered the incorrect number of items.")

ItemCost = userItems * itemPrice

print(userItems)
print(itemPrice)
print(ItemCost)
