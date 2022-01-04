package Minje;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BOJ_1000{
    public static void main(String args[]) throws Exception {
        int a = 0, b = 0, sum = 0;
        
        while(true) {
           try {
                Scanner scan = new Scanner(System.in);

                a = scan.nextInt();
                b = scan.nextInt();
                sum = a + b;

                System.out.println(sum);

                scan.close();
                return;
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력해주세요.");
            }
        }
    }
}