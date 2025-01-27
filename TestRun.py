# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""
num = int(input("Enter number of customers: "))

for x in range(1, num+1):
#ask for quanitiy
quantity = float(input("Enter quatity: "))

print("Enter info for customer #",x)

#Evaluation
'''
if quantity is >= 15 -> 15%
if > 10 -> 10%
if > 5 -> 5%
'''

if quantity > 15:
    discount = .15
elif quantity > 10:
    discount = .10
elif quantity > 5:
    discount = .05
else:
    discount = 0
    
#determine pay(unit price = $4)
    
result = (quantity * 4) - discount
print("Discount: ", discount)
print("Total $", format(result, '.2f'), sep = '')
