#Jamil Winkey
#10/1/24
#P1HW1
#CtI110

print("P1HW1")

#declare variables
base_integer = 0
base_exponent = 0
base_totalexponent = 0
base_starting = 0
base_add = 0
base_subtract = 0
base_totalmath = 0

#enter first question
print("-"*5, "Calculating Exponents", "-" * 5)

base_integer = int(input("Enter an integer as a the base value: "))

base_exponent = int(input("Enter an integer as the exponent "))

base_totalexponent = base_integer**base_exponent

print(base_integer, "raised to the power of", base_exponent, "is", base_totalexponent)

print("-"*5, "Addition and Subtraction", "-"*5)

base_starting = int(input("Enter a starting integer: "))

base_add = int(input("Enter an integer to add: "))

base_subtract = int(input("Enter an integer to subtract: "))

base_totalmath = base_starting + base_add - base_subtract

print(base_starting, "+", base_add, "-" , base_subtract, "is equal to", base_totalmath)


