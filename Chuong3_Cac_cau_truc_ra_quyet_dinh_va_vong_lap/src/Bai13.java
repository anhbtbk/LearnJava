//Bài 13: Vòng lặp for

import java.util.Scanner;


public class Bai13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Nhap vao chuoi ki tu bat ki: ");
//        var str = input.nextLine();
//        var count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            count++;
//        }
//        System.out.println("Chuoi co " + count + " ky tu.");

        System.out.println("Nhap vao so nguyen duong: ");
        var n = input.nextInt();
        var sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0 / i;
        }
        System.out.println("sum = " + sum);
    }
}
