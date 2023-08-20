package bai21;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap Do Dai Mang :");
        Integer n = scanner.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap so thu " + i + " :");
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]) == true) {
                res.add(arr[i]);
            }
        }
        System.out.println(res);
    }
}
