import java.util.Scanner;

public class Bai13ThucHanh {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

//        //Bai 1
//        System.out.println("Nhap vao so n = : ");
//        var n = input.nextInt();
//        var sum = 0.0;
//        for (int i = 1; i <= n; i++) {
//            sum += 1.0 / i;
//        }
//        System.out.println("Sum = " + sum);

//        //Bai 2
//        System.out.println("Nhap vao so n = : ");
//        var n = input.nextInt();
//        var sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println("Sum = " + sum);

//        //Bai 3
//        System.out.println("Nhap vao so n = : ");
//        var str = input.nextLine();
//        str = str.replaceAll("\\s+", " "); //thay nhiều khoảng cách = 1 khoảng cách
//        str = str.trim(); //xóa khoảng cách ở đầu và cuối chuỗi
//
//        for (int i = 0; i <= str.length(); i++) {
//            if (str.charAt(i) == str.matches("\\s+"") ) {
//
//            }
//            System.out.println("Sum = " + sum);
//        }

//        //Bai 4
//        System.out.println("Nhap vao chuoi ki tu =  ");
//        var str = input.nextLine();
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            count++;
//        }
//        System.out.println("Chuoi co " + count + " ky tu!");

//        //Bai 5
//        System.out.println("Nhap vao chuoi ki tu =  ");
//        var str = input.nextLine();
//
//        for (int i = 0; i < str.length(); i++) {
//            str.charAt(i) =
//        }
//        System.out.println(str);

        //Bai 6
        System.out.println("Nhap vao so n = ");
        var n = input.nextInt();
        if (n <= 1) {
            System.out.println(n + " khong la so nguyen to");
        } else if (n == 2) {
            System.out.println(n + " la so nguyen to");
        } else if (n > 2) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println(n + " khong la so nguyen to");
                    break;
                } else {
                    System.out.println(n + " la so nguyen to");
                }
            }
        }
        //Bai 7
        System.out.println("Nhap vao so a, b = ");
        var a = input.nextInt();
        var b = input.nextInt();

        for (int i = a; i <= b; i++) {
            //Phuong thuc (i)
            sout

        }
    }
}

