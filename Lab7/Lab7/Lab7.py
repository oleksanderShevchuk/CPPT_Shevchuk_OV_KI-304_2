import sys

def generate_triangular_matrix():
    # Prompt the user for the size of a square matrix
    n_rows = int(input("Enter the size of a square matrix: "))
    arr = [[' ' for _ in range(i + 1)] for i in range(n_rows)]

    half_n_rows = (n_rows // 2) + 1

    # Prompt the user for the filler character
    filler = input("Enter the filling character: ")

    if not filler:
        print("\nFiller character not entered.")
        sys.exit(1)
    elif len(filler) != 1:
        print("\nToo many filler characters entered.")
        sys.exit(1)

    counter = half_n_rows - 1

    for i in range(n_rows):
        for j in range(len(arr[i])):
            if j >= counter:
                arr[i][j] = filler
            print(arr[i][j], end=" ")

            if j == counter:
                counter -= 1

        print()

if __name__ == "__main__":
    generate_triangular_matrix()
