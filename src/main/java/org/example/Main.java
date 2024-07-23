package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int num) {
        int number = Math.abs(num);
        boolean result = false;
        char[] nums = String.valueOf(number).toCharArray();
        for (int i = 0; i < nums.length; i++) {
            int p = nums.length - (i + 1);
            if (nums[i] == nums[p]) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public static boolean isPerfectNumber(int number) {
        int result = 0;
        if (number < 0) {
            return false;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result += i;
            }
        }
        return result == number;
    }

    public static String numberToWords(int numb) {
        if (numb < 0) {
            return "Invalid Value";
        }
        String[] onedigit = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        char[] numbers = String.valueOf(numb).toCharArray();
        String[] word = new String[numbers.length];
        for (int x = 0; x < numbers.length; x++) {
                word[x] = onedigit[Character.getNumericValue(numbers[x])];
        }
        return String.join(" ", word);
    }
}
