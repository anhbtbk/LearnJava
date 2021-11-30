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

        //Bai 3
        System.out.println("Nhap vao so n = : ");
        var str = input.nextLine();
        str = str.replaceAll("\\s+", " "); //thay nhiều khoảng cách = 1 khoảng cách
        str = str.trim(); //xóa khoảng cách ở đầu và cuối chuỗi

//        for (int i = 0; i <= str.length(); i++) {
//            if (str.charAt(i) == str.matches("\\s+"") ) {
//
//            }
//            System.out.println("Sum = " + sum);
//        }

    }
}
