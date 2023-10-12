# Task-1
matriculation number: 7219187

# Primes:

The provided Java code is a simple program to print all prime numbers up to a limit of 50.

A prime number is a natural number greater than 1, and has no positive divisors other than 1 and itself. The program employs a nested loop structure to check each number up to the limit if it is prime or not. If a number is found to be non-prime (i.e., it has a divisor other than 1 and itself), the program skips to the next number without printing the current number. If a number is found to be prime, it is printed.

The outer loop runs from 2 (the smallest prime number) up to the limit, and the inner loop checks if the current number from the outer loop is divisible by any number up to its square root. This approach is an optimization to reduce the number of checks, as any factor of a number must be less than or equal to its square root. The 'continue' statement with a label allows the program to skip remaining steps in the current iteration of the outer loop and proceed to the next iteration when a number is found to be non-prime

# MathCalc:

The provided code is a simple Java program that calculates the volume of the Earth and the Sun, and then computes the ratio of the volume of the Sun to the Earth.

The program begins by defining the diameters of the Earth and the Sun in miles. It then calculates their respective radii by dividing the diameters by 2. Using these radii, the program calculates the volumes of the Earth and Sun using the formula for the volume of a sphere: V = 4/3 * π * r³. Here, Math.PI is used to represent the constant π, and Math.pow(r, 3) is used to calculate the cube of the radius.

Finally, the program calculates the ratio of the volume of the Sun to the Earth by dividing the volume of the Sun by the volume of the Earth. This ratio is then printed to the console along with the volumes of the Earth and Sun.

# StringCharecters:

The given Java code is a simple program that counts the number of vowels, consonants, and spaces in a given text. The text is defined as a string variable and the counts are stored in integer variables.
The program first converts the entire text to lowercase to simplify the comparison process. Then, it loops through each character in the string. If the character is a space, it increments the spaces counter. If the character is a vowel (a, e, i, o, u), it increments the vowels counter. If the character is a letter (any character from a to z), it increments the letters counter. The number of consonants is then calculated by subtracting the number of vowels from the total number of letters.
Finally, the program outputs the counts of vowels, consonants, and spaces. The count of consonants is calculated by subtracting the number of vowels from the total number of letters.

# WordSorter:

The provided Java code defines a class WordSorter that sorts a block of text alphabetically, word by word, using the Bubble Sort algorithm.
The main method first initializes a String variable text with the text to be sorted
The text is then cleaned by removing any punctuation and converting all characters to lowercase. This is done using the replaceAll method of the String class, which replaces all characters that are not letters or spaces with an empty string, effectively removing them.
The cleaned text is then split into an array of words using the split method, with spaces ("\s+") as the delimiter. This creates an array where each element is a word from the text.
The bubbleSort method is then called on the words array to sort the words alphabetically. The Bubble Sort algorithm works by repeatedly stepping through the list, comparing each pair of adjacent items and swapping them if they are in the wrong order. The pass through the list is repeated until no more swaps are needed, indicating that the list is sorted.
Finally, the sorted words are printed to the console using a for-each loop
