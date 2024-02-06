package com.codepower.striver.arrays.pascals;

/**
 * @author Justin Mathew @dev_io
 */
public class PascalTriangleValue {

    // Method to calculate the binomial coefficient, which represents
    // the value at the nth row and kth column in Pascal's Triangle
    //canceling out the common terms in the numerator and the denominator for simplification
    private static int binomialCoefficient(int n, int k) {
        int res = 1;

        // Since C(n, k) = C(n, n-k)
        if (k > n - k) {
            k = n - k;
        }

        // Calculate value of [n*(n-1)*---*(n-k+1)] / [k*(k-1)*---*1]
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }

        return res;
    }

    // Method to predict the value at the nth row and kth column in Pascal's Triangle
    public static int predictValue(int n, int k) {
        return binomialCoefficient(n, k);
    }

    // Main method to test the prediction function
    public static void main(String[] args) {
        int n = 5; // Example row number
        int k = 2; // Example column number

        // Predicting the value at the 5th row and 2nd column in Pascal's Triangle
        int value = predictValue(n, k);
        System.out.println("The value at row " + n + " and column " + k + " in Pascal's Triangle is: " + value);
    }

}
