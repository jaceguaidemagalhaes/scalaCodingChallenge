# scalaCodingChallenge
 
1) **SumLinkedLists** : You have two numbers represented by a linked list, where each node contains a single
digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
function that adds the two numbers and returns the sum as a linked list.

EXAMPLE
Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
Output: 2 -> 1 -> 9. That is, 912.

FOLLOW UP
Suppose the digits are stored in forward order. Repeat the above problem.
Input: (6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
Output: 9 -> 1 -> 2. That is, 912.

2) **StackMin**: How would you design a stack which, in addition to push and pop, has a function min which returns the minimum element? Push, pop and min should all operate in 0(1) time.

## Weekly Coding Challenge 06/01/2022:


a) **IsvalidHexCode** Create a function that determines whether a string is a valid hex code.

A hex code must begin with a pound key # and is exactly 6 characters in length. Each character must be a digit from 0-9 or an alphabetic character from A-F. All alphabetic characters may be uppercase or lowercase.

Examples:
IsValidHexCode("#CD5C5C") ➞ true

IsValidHexCode("#EAECEE") ➞ true

IsValidHexCode("#eaecee") ➞ true

IsValidHexCode("#CD5C58C") ➞ false
// Length exceeds 6

IsValidHexCode("#CD5C5Z") ➞ false
// Not all alphabetic characters in A-F

IsValidHexCode("#CD5C&C") ➞ false
// Contains unacceptable character

IsValidHexCode("CD5C5C") ➞ false
// Missing #

b) **NextPrime** Given an integer, create a function that returns the next prime. If the number is prime, return the number itself.

Examples:
NextPrime(12) ➞ 13

NextPrime(24) ➞ 29

NextPrime(11) ➞ 11
// 11 is a prime, so we return the number itself.

c) **ReorderDigitsArray** Create a function that reorders the digits of each numerical element in an array based on ascending (asc) or descending (desc) order.

Examples:
reorderDigits([515, 341, 98, 44, 211], "asc") ➞ [155, 134, 89, 44, 112]

reorderDigits([515, 341, 98, 44, 211], "desc") ➞ [551, 431, 98, 44, 211]

reorderDigits([63251, 78221], "asc") ➞ [12356, 12278]

reorderDigits([63251, 78221], "desc") ➞ [65321, 87221]

reorderDigits([1, 2, 3, 4], "asc") ➞ [1, 2, 3, 4]

reorderDigits([1, 2, 3, 4], "desc") ➞ [1, 2, 3, 4]

Notes:
Single-digit numbers should be ordered the same regardless of direction.
Numbers in the array should be kept the same order.

d) **PartitionProduct** Write a function that returns true if you can partition an array into one element and the rest, such that this element is equal to the product of all other elements excluding itself.

Examples:
canPartition([2, 8, 4, 1]) ➞ true
// 8 = 2 x 4 x 1

canPartition([-1, -10, 1, -2, 20]) ➞ false

canPartition([-1, -20, 5, -1, -2, 2]) ➞ true

Notes:
The array may contain duplicates.
Multiple solutions can exist, any solution is sufficient to return true.

e) **OddishEvenish** Create a function that determines whether a number is Oddish or Evenish. A number is Oddish if the sum of all of its digits is odd, and a number is Evenish if the sum of all of its digits is even. If a number is Oddish, return "Oddish". Otherwise, return "Evenish".

For example, oddishOrEvenish(121) should return "Evenish", since 1 + 2 + 1 = 4. oddishOrEvenish(41) should return "Oddish", since 4 + 1 = 5.

Examples:
oddishOrEvenish(43) ➞ "Oddish"
// 4 + 3 = 7
// 7 % 2 = 1

oddishOrEvenish(373) ➞ "Oddish"
// 3 + 7 + 3 = 13
// 13 % 2 = 1

oddishOrEvenish(4433) ➞ "Evenish"
// 4 + 4 + 3 + 3 = 14
// 14 % 2 = 0

g) **DoubleSwap** Write a function to replace all instances of character c1 with character c2 and vice versa.

Examples:
doubleSwap( "aabbccc", "a", "b") ➞ "bbaaccc"

doubleSwap("random w#rds writt&n h&r&", "#", "&")
➞ "random w&rds writt#n h#r#"

doubleSwap("128 895 556 788 999", "8", "9")
➞ "129 985 556 799 888"

Notes:
Both characters will show up at least once in the string.

