package edu.ucr.cs.lxu051.solutions;

public class Q9 {

    public Q9() {

    }

    public boolean isPalindrome(int x) {
        // Idea: build the number backwards

        if (x < 0) {
            return false;
        }

        int result = 0;
        int temp = x;
        int remainder;

        while (x > 0) {
            remainder = x % 10;
            result = remainder + result * 10;
            x = x / 10;
        }

        return result == temp;
    }
}
