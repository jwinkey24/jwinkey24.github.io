keep_going ='yes'
while keep_going == 'yes':
    score = float(input("Enter score: "))
    
#check if score valid
while score < 0 or score > 100:
    print("Invalid score!!!!, Please enter a valid score. (0-100)")
    score = float(input("Enter score again: "))
#determine the letter grade

    if score >= 90:
        print('A')
    elif score >= 80:
        print('B')
    elif score >= 70:
        print('C')
    else:
        print('F')

    keep_going = input("Do you want to run the program again? (yes/no)")
