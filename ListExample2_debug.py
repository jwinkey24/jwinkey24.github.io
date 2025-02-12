

import disValue
def main():
    
    #Creates empty lists
    numList = []
    wordList = []


    print("This program allows user to create a list containing either numbers or string, it then evaluates content and eliminates duplicates")

    print("\nLet us start with the number list")

    number = int(input("\nHow many numbers do you want to add to list? "))


    for x in range(number):
        x2 = x + 1
        num=float(input(f"Enter element number {x2}: "))
        numList.append(num)


    print("\nNow we move on to list of words/string")

    number = int(input("\nHow many elements do you want to add to list? "))


    for x in range(number):
        x2 = x + 1
        word=input(f"Enter element number {x2}: ")
        wordList.append(word)
        # print the two lists

    # pass list to function

    disValue.dis_results(numList, wordList)
                

main()
