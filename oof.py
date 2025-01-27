# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

#ask for quanitiy
quantity = float(input("Enter quatity: "))

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
print(f"Total ${result:.2f}")
