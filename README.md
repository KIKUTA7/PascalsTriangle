Pascal's triangle is built up step by step starting with row 0 consisting of a single 1. The next row n is computed from the (n - 1)th row as follows:

The number of elements in row n is n + 1.
The first and last elements in each row is alwas 1.
The ith element of row n is given by the sum of the ith and (i-1)th element in row (n - 1).
Implement a Java method int[][] pascal(int n) that computes Pascal's triangle with n extra rows to compute. The return value is an arry which contains the triangle. Further, realize a main method which prints the triangle of a user-defined size. You may assume that the user inputs a number n >= 0.
