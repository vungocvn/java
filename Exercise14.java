package ss_b1;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chieu dai canh hinh vuong");
        int n = scanner.nextInt();
        //n là chieu dai canh hinh vuong
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
