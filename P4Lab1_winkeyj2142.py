#CTI 110
#P4Lab1 - Turtles
#Jamil WInkey
#11/12/24

#draw shapes and snowflakes
import turtle
t = turtle.Turtle()
win = turtle.Screen()
win.bgcolor("black")

t.pensize(4)
t.pencolor("blue")
t.shape("turtle")


#weistle looking figure
for side in range(7):
    t.forward(50)
    t.left(35)
    t.right(75)

#sun figure from placement
t.pencolor("magenta")
for side in range(25):
    t.forward(90)
    t.right(125)

#circle from placement
t.pencolor("red")
for side in range(20):
    t.left(70)
    t.forward(65)
    t.right(90)
    
#star from placement
t.pencolor("orange")
for side in range(30):
    t.forward(100)
    t.left(135)

t.left(45)
t.forward(120)
t.right(90)

t.pencolor("white")
for side in range(25):
    t.forward(90)
    t.right(45)

    


