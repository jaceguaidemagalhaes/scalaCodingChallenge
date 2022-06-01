#Python Solutions

1) **sumlists.py** : You have two numbers represented by a linked list, where each node contains a single
digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
function that adds the two numbers and returns the sum as a linked list.

EXAMPLE
Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
Output: 2 -> 1 -> 9. That is, 912.

FOLLOW UP
Suppose the digits are stored in forward order. Repeat the above problem.
Input: (6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
Output: 9 -> 1 -> 2. That is, 912.

2) **stackmin.py**: How would you design a stack which, in addition to push and pop, has a function min which returns the minimum element? Push, pop and min should all operate in 0(1) time.


## Weekly Coding Challenge 06/01/2022:
a) IsvalidHexCode Create a function that determines whether a string is a valid hex code.

A hex code must begin with a pound key # and is exactly 6 characters in length. Each character must be a digit from 0-9 or an alphabetic character from A-F. All alphabetic characters may be uppercase or lowercase.

Examples: IsValidHexCode("#CD5C5C") ➞ true

IsValidHexCode("#EAECEE") ➞ true

IsValidHexCode("#eaecee") ➞ true

IsValidHexCode("#CD5C58C") ➞ false // Length exceeds 6

IsValidHexCode("#CD5C5Z") ➞ false // Not all alphabetic characters in A-F

IsValidHexCode("#CD5C&C") ➞ false // Contains unacceptable character

IsValidHexCode("CD5C5C") ➞ false // Missing #

b) NextPrime Given an integer, create a function that returns the next prime. If the number is prime, return the number itself.

Examples: NextPrime(12) ➞ 13

NextPrime(24) ➞ 29

NextPrime(11) ➞ 11 // 11 is a prime, so we return the number itself.
