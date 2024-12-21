package ss_b1;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap vao thang ");
        int month = scanner.nextInt();
        System.out.println("hay nhap vao nam");
        int year = scanner.nextInt();
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("thang co 30 ngay ");
        } else if (month == 2) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("thang co 29 ngay");
            } else {
                System.out.println("thang co 28 ngay");
            }

        } else {
            System.out.println("thang co 31 ngay");
        }

    }
}
