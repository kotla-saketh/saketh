1
#print("hello")

2
"""a=1
b=2
sum=a+b
print("2+3=",sum)"""

3
"""# Define two numbers
num1 = 5
num2 = 10

# Calculate the sum
sum = num1 + num2

# Print the sum
print("The sum of", num1, "and", num2, "is", sum)"""

4
# Print a simple triangle pattern
"""print("*")
print("**")
print("***")
print("****")
print("*****")"""

5
"""# Get user input for the name
name = input("Enter your name: ")

# Print a greeting
print("hello",name,"hi")"""
"""# Get user input for the name
name = input("Enter your name: ")

# Print a greeting
print("Hello, " +name+"!")"""

6
"""# Define two numbers
a = 15
b = 4

# Perform arithmetic operations
sum = a + b
difference = a - b
product = a * b
quotient = a / b
remainder = a % b

# Print the results
print("Sum:", sum)
print("Difference:", difference)
print("Product:", product)
print("Quotient:", quotient)
print("Remainder:", remainder)"""

7
"""# Number of rows
rows = 5

# Print a right-angled triangle pattern
for i in range(1, rows + 1):
    print("*" * i)"""

8
"""# Number of rows
rows = 5

# Print a pyramid pattern
for i in range(1, rows + 1):
    print(" " * (rows - i) + "*" * (2 * i - 1))
"""

9
"""# Number of rows (half of the diamond)
rows = 5

# Print the upper half of the diamond
for i in range(1, rows + 1):
    print(" " * (rows - i) + "*" * (2 * i - 1))

# Print the lower half of the diamond
for i in range(rows - 1, 0, -1):
    print(" " * (rows - i) + "*" * (2 * i - 1))
"""

10
"""# Size of the square
size = 5

# Print a hollow square pattern
for i in range(size):
    if i == 0 or i == size - 1:
        print("*" * size)
    else:
        print("*" + " " * (size - 2) + "*")
"""

11
"""# Get user input for numbers
num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))

# Get user input for operation
operation = input("Enter the operation (+, -, *, /): ")

# Perform the chosen operation
if operation == '+':
    result = num1 + num2
elif operation == '-':
    result = num1 - num2
elif operation == '*':
    result = num1 * num2
elif operation == '/':
    result = num1 / num2
else:
    result = "Invalid operation"

# Print the result
print("The result is:", result)
"""

12
# Get user input for the number
"""num = int(input("Enter a number: "))

# Check if the number is even or odd
if num % 2 == 0:
    print(num, "is even")
else:
    print(num, "is odd")"""

13
"""# Get user input for three numbers
num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))
num3 = float(input("Enter the third number: "))

# Find the largest number
if num1 >= num2 and num1 >= num3:
    largest = num1
elif num2 >= num1 and num2 >= num3:
    largest = num2
else:
    largest = num3

# Print the largest number
print("The largest number is:", largest)
"""

14
"""# Get user input for the number
num = int(input("Enter a number: "))

# Initialize the factorial variable
factorial = 1

# Calculate the factorial using a for loop
for i in range(1, num + 1):
    factorial *= i

# Print the factorial
print("The factorial of", num, "is", factorial)"""




