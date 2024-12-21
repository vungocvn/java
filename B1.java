package ss_b1;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("hay nhap nam sinh  cua ban");
        int yearOfBirth = scanner.nextInt();
        //tinh tuoi bang cach tru nam hien tai 2024 cho nam sinh
        int age= 2024 - yearOfBirth;
        //in tuoi ra man hinh
        System.out.println("tuoi cua ban la "+age);
    }
}
