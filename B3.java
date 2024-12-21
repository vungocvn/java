package ss_b1;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double basicSalary = 650000.0;


        double salary=0;//luong
        int tnct;
        do {

            System.out.println("Nhap vao tham nien cong tac");
             tnct = scanner.nextInt();
            if (tnct>0){
                if (tnct < 12) {
                    salary=basicSalary*1.92;//luong=coban*heso
                    System.out.println("lương là: "+salary);
                } else if (tnct >= 12 && tnct < 36) {
                    salary=basicSalary*2.34;
                    System.out.println("lương là: "+salary);
                } else if (tnct >= 36 && tnct < 60) {
                    salary=basicSalary*3;
                    System.out.println("lương là: "+salary);
                } else if (tnct >= 60) {
                    salary=basicSalary*4.5;
                    System.out.println("lương là: "+salary);
                }
            }
            else {
                System.out.println("mời bạn nhập lại");
            }
        }while (tnct<=0);


    }
}
