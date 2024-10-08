# Jamil Winkey
# 10/8/24
# P2HW1
# Display the budget after someone took a trip/vacation somewhere


#Input Beginning Statement

print("📍 Budget Travel Tool 📍")

# Ask user to enter their budget for trip
budget = float(input("What is your travel budget?: $"))

#Ask user what is their travel destination

hotel_price = float(input("How much money do you think you will spend on lodging?:$"))

traveling = input("Where are you traveling to?: ")

gas_money = float(input("How much money do you think you would spend on gas?:$"))

eatery = float(input("How much money do you think you will spend on food?:$"))


print("-"*10, "Travel Expense Total", "-"*10)

print("Location:$", traveling)
print("Initial Budget:$",format(budget,".2f"))
print("Food:$",format(eatery, ".2f"))
print("Gas/Fuel:$",format(gas_money, ".2f"))
print("Lodging/Accomadations:$", format(hotel_price, ".2f"))

print("-"*20)

final_balance = (budget - (hotel_price + gas_money + eatery))

print("The Remaning Balance is:$", format(final_balance, ".2f"))