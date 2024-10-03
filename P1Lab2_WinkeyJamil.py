#Jamil Winkey
#10/1/24
#P1Lab2
#CtI110

print("P1LAB2")
#for today, i will be doing a pizza spot
#that only sells slices of pizza and garlic knots

#delcaring variable
num_slicepizza = 0
num_garlicknots = 0
slicepizza_cost = 2.75
garlicknot_cost = 1.25

#Opening Phrase
print("What will you be having today")

num_slicepizza = int(input("How many slices will you have? "))
print("You got", num_slicepizza, "slices of pizza")

num_garlicknots = int(input("How many garlic knots will you have? "))
print("You got", num_garlicknots, "garlic knots")

print("-" * 20)

numslice_total = num_slicepizza * slicepizza_cost
print(num_slicepizza, "🍕 Pizza $", format(numslice_total, ".2f"))

garlicknot_total = garlicknot_cost * num_garlicknots
print(num_garlicknots, "🥐 Garlic Knots $", format(garlicknot_total, ".2f"))

completetotal = garlicknot_total + numslice_total
print("-" * 20)

print("Total\t\t:$",completetotal)
                       
                       
