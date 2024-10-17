#CTI 110
#P2HW2
#Winkey
#10/17

#Example List
numbers = [1, 2, 3, 4]
print(numbers)

#Ask User To Input Four Numbers
print("Enter Four Numbers")
num1 = int(input())
num2 = int(input())
num3 = int(input())
num4 = int(input())
#placed numbers in brackets and seperating each number by themselves
swag_numbers = [num1, num2, num3, num4]

#Display What The User's Numbers Are
print("You Entered These Numbers:", swag_numbers)
print("There are", len(swag_numbers), "numbers")
print("Smallest: ", min(swag_numbers))
print("Largest: ", max(swag_numbers))
print("The total is: ", sum(swag_numbers))

#To Find Average Add All Numbers And Divide By How Many Numbers Are The Sequence
#LEN is The count of items
average = sum(swag_numbers / len(swag_numbers)
print("The Average of The Total is: ", average)
