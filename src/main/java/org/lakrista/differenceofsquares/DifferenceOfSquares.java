package org.lakrista.differenceofsquares;

/**
 * Find the difference between the square of the sum and the sum of the squares of the first N natural numbers.
 * The square of the sum of the first ten natural numbers is (1 + 2 + ... + 10)² = 55² = 3025.
 * The sum of the squares of the first ten natural numbers is 1² + 2² + ... + 10² = 385.
 * Hence the difference between the square of the sum of the first ten natural numbers and the sum of the squares of the first ten natural numbers is 3025 - 385 = 2640.
 * You are not expected to discover an efficient solution to this yourself from first principles; research is allowed, indeed, encouraged. Finding the best algorithm for the problem is a key skill in software engineering.
 */
public class DifferenceOfSquares {
    int number = 0;

    public static void main(String[] args) {
        System.out.println(computeSquareOfSumTo(10));
        System.out.println(computeSumOfSquaresTo(10));
        System.out.println(computeDifferenceOfSquares(10));
    }

    static int computeSquareOfSumTo(int input) {
        int n = 0;
        int sum = 0;
        while (n <= input) {
            sum += n;
            n++;
        }
        return sum*sum;
    }

    static int computeSumOfSquaresTo(int input) {
        int n = 0;
        int sum = 0;
        while (n <= input) {
            sum += n*n;
            n++;
        }
        return sum;
    }

    static int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
