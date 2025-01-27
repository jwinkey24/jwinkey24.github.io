days = int(input("How many days do you operate?: "))
print()

total = 0
for day in range(1,days+1):
    
    amount = float(input("Enter amount generated in Day #"+str(day)+" $" ))
        
    total += amount
  
