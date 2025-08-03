## Course created by Dr. Charles Severance with free video series of Python basics.

```Python
# This is a comment
# There's no built-in multiline comment syntax in Python

# Different from other common languages, Python don't use a character for delimitting scopes, Python only uses indentation, and don't need semicolons to end statements.

# Python is inspired by Monty Python's Flying Circus, but it's not the same.

# Python reserved words:
# and, as, assert, break, class, continue, def, del, elif, else, except, exec, finally, for, from, global, if, import, in, is, lambda, not, or, pass, print, raise, return, try, while, with, yield, True, False, None, Nonlocal

# Different from other common languages, Python don't have words to declare variables, you just name and assign them. In Python you should initialize the variable name with a letter or an underscore, use mneumonic names for variables, and use camelCase for variable names. For exemple,
x = 2           # declare x as a variable and assign it the value 2
string = ""     # declare string as a variable and assign it the value ""
hello = "hello" # declare hello as a variable and assign it the value "hello"

# inside a .py file you can write instructions so Python can do something. You can do in sequential form, like an recipe with steps. Some of them can be conditional, with conditionals. And some can be repeated, with loops.

# Arithmetic operators: + (sum or concatenation), - (subtraction), * (multiplication), / (division), // (Floor division, the ratio of the numbers rounded down), % (modulo or remainder), ** (power)
# Like in math, the order of operations is important. The precende is parenthesis, then exponent, then multiplication and division, then addition and subtraction. From the left to the right.

# It's recommended to use try and except in dangerous part of the code, parts you think can fail. Python will try escute what's inside of try, case succeed will skip the except, otherwise will use the except. For example,

temp =  "5 degrees"
celsius = 0
fahrenheit = float(temp) # the coide fail here
celsius = (fahrenheit - 32) * 5.0 / 9.0
print(celsius)

temp =  "5 degrees"
celsius = 0
try:
    fahrenheit = float(temp)
    celsius = (fahrenheit - 32) * 5.0 / 9.0
except:
    print("Invalid temperature")
print(celsius)

# In Python to declare a function you use the reserved word def, followed by the name and parentheses and colon. For example,
def myFunction():
    # function body
# you can define the function arguments with the parentheses, and the arguments are separated by commas. For example,
def myFunction(arg1, arg2):
    # function body
# and you can call the function later using the name and parentheses. For example,
myFunction()                # call the function with no arguments
myFunction(value1, value2)  # call the function with two arguments
# you can use the return statement to return a value from a function. For example,
def add(a, b):
    return a + b
def greet(name):
    return "Hello " + name

# In Python you can define loops with while or for. For example,
while condition:
    # loop body
while True:
    if condition:
        break
    # loop body
while True:
    if condition:
        continue
    if condition:
        break
    # loop body
# it's needed caution to not create an infinite loop. For example, in the above lines without the break, the loop will never stop.

# Different from While, For loops don't receive a condition, for loops iterate over a sequence of values. For example,
for i in range(10):
    print(i) # print the values from 0 to 9
for i in [1, 2, 3, 4, 5]:
    print(i) # print the values from 1 to 5
for i in "Hello":
    print(i) # print the characters from "H" to "o"
```