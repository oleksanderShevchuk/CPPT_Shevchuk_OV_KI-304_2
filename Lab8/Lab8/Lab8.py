import math
import struct

def calculate_expression(x):
    try:
        # Observe the expression: y = sin(x-9) / (x - cos(2x))
        numerator = math.sin(x - 9)  # Compute the numerator (sin(x-9))
        denominator = x - math.cos(2 * x)  # Compute the denominator (x - cos(2x))

        # Check for division by zero or very close to zero
        if abs(denominator) < 1e-10:
            raise ZeroDivisionError("Division by zero or very close to zero.")

        # Calculate and return the result
        return numerator / denominator

    except ZeroDivisionError as e:
        print(f"Error: {e}")

# Function to write the result to a text file
def write_to_text_file(result, filename):
    with open(filename, 'w') as file:
        file.write(str(result))

# Function to read the result from a text file
def read_from_text_file(filename):
    with open(filename, 'r') as file:
        result = float(file.read())
    return result

# Function to write the result to a binary file
def write_to_binary_file(result, filename):
    with open(filename, 'wb') as file:
        packed_result = struct.pack('d', result)  # Pack the result into binary format
        file.write(packed_result)

# Function to read the result from a binary file
def read_from_binary_file(filename):
    with open(filename, 'rb') as file:
        packed_result = file.read(struct.calcsize('d'))  # Read the packed binary result
        result = struct.unpack('d', packed_result)[0]  # Unpack the binary result
    return result

if __name__ == "__main__":
    # Input the value of x from the user
    x = float(input("Enter the value of x: "))

    # Calculate the expression for the given x
    result = calculate_expression(x)

    # Write the result to a text file
    write_to_text_file(result, 'result.txt')
    print("Result written to result.txt")

    # Write the result to a binary file
    write_to_binary_file(result, 'result.dat')
    print("Result written to result.dat")

    # Read the result from the text file and display it
    text_result = read_from_text_file('result.txt')
    print("Result from text file:", text_result)

    # Read the result from the binary file and display it
    binary_result = read_from_binary_file('result.dat')
    print("Result from binary file:", binary_result)
