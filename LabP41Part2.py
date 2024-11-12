#drawing shapes specifically a snowflake
import turtle
t = turtle.Turtle()
win = turtle.Screen()
win.bgcolor("black")

t.pencolor("white")
for flake in range(40):
    t.forward(90)
    t.left(45)
    t.left(90)
    t.forward(20)
    t.back(20)
    t.right(180)
    t.forward(20)
    t.back(20)
    t.left(90)
    t.back(120)
    t.left(28)
    
