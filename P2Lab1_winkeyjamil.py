#Jamil Winkey
#10/8/24
#P2Lab1
#Display the calculations for a circle finding it's Area, Circumference and Diameter

#import math for following calculations
import math

#create a variable to get a radius

radius = float(input("What is the radius of the circle?: "))
#input variable for pi

             
#input the calculations for the area, circumference and diameter with the radius given

diameter = (2*radius)
circumference = ((2)*(math.pi)*(radius))
area = ((math.pi)*(math.pow(radius, 2)))
print("-"*10, "Calculations", "-"*10)

#Display Calculations
print("The Diameter of the circle is: ", area)
print("The Circumference of the circle is: ", circumference)
print("The Area of the circle is:", area )