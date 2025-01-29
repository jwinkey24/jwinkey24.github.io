def main():
    
    #call the welcome function
    welcome()
    #call the get_grade function
    get_grade

def welcome():
    '''
    function doesn't require arguments
    ask user to enter their name and says hi to them
    '''
    
    name = input("Enter your name: ")
    print("Hello", name)
    print()

def get_grade():
    '''
    ask user to enter score and determines grade
    '''
    score = float(input("Enter score or -1 to terminate: "))
    while score != 1:
        
        while score <= 0 or score > 100:
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

        score = float(input("Enter score or -1 to terminate: "))
    
main()
get_grade()
    
