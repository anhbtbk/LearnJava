//Bài 10. Cấu trúc ra quyết định switch

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao 2 so thuc a,b: ");
        var a = input.nextDouble();
        var b = input.nextDouble();
        System.out.println("Nhap lua chon can thuc hien: ");
        System.out.println("1 : phep cong");
        System.out.println("2 : phep tru");
        System.out.println("3 : phep nhan");
        System.out.println("4 : phep chia");
        System.out.println("0 : thoat chuong trinh");
        var choice = input.nextInt();
        var result = 0;
        switch (choice) {
            case 0:
                System.out.println("Thoat chuong trinh.");
                break;
            case 1:
                var sum = a + b;
                System.out.println(a + " + " + b + " = " + sum);
                break;
            case 2:
                var dif = a - b;
                System.out.println(a + " - " + b + " = " + dif);
                break;
            case 3:
                var prod = a * b;
                System.out.println(a + " * " + b + " = " + prod);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Khong thuc hien phep chia cho 0.");
                } else {
                    var quot = (double) a / b;
                    System.out.println(a + " / " + b + " = " + quot);
                }
                break;
            default:
                System.out.println("Gia tri nhap khong hop le, xin moi nhap lai.");
                break;

        }
    }
}
