#CtI 110
#P2Lab2_B
#Winkey
#10/17

#Using Lists And Loops To Draw
import turtle
t = turtle.Turtle()
t.pensize(8)

for length in[145, 35, 45, 100, 50, 100, 75, 180]:
    t.forward(length)
    t.right(45)

#Simple Loop
sides = 8
length = 45
angle = 360 / sides

for color in["blue", "magenta", "red", "aquamarine", "blueviolet", "beige", "brown", "chocolate"]:
        t.pensize(10)
        t.pencolor(color)
        t.forward(length)
        t.right(angle)
