import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        //VD1: Chuong trinh kiem tra so dep
//        System.out.println("Xin moi nhap tu nhien bat ki: ");
//        var n = input.nextInt();
//        var m = n; //Gan gia tri n sang bien m, roi xu ly tren m de tranh lam mat gia tri n luc dau
//        var rev = 0;
//        while (m > 0) {
//            rev = 10 * rev + m % 10;
//            m /= 10;
//        }
//        if (rev == n) {
//            System.out.println(n + " la so dep!");
//        } else {
//            System.out.println(n + " khong la so dep!");
//        }
        //VD2: Chuong trinh thuc hien phep tinh lien tuc
        System.out.println("Nhập vào hai số thực a, b: ");
        var a = input.nextDouble();
        var b = input.nextDouble();
        var choice = 0; // khởi tạo biến lựa chọn
        do {
            System.out.println("======== MENU ========");
            System.out.println("1. Cộng hai số");
            System.out.println("2. Trừ hai số");
            System.out.println("3. Nhân hai số");
            System.out.println("4. Chia hai số");
            System.out.println("0. Thoát chương trình");
            System.out.println("Xin mời chọn: ");
            choice = input.nextInt(); // nhập lựa chọn
            // tiến hành đánh giá và thực hiện chương trình
            switch (choice) {
                case 0:
                    System.out.println("Xin chào và hẹn gặp lại!");
                    break;
                case 1: // nếu giá trị của choice = 1
                    var sum = a + b; // tính tổng hai số
                    System.out.println(a + " + " + b + " = " + sum);
                    break;
                case 2: // nếu giá trị của choice = 2
                    var dif = a - b;
                    System.out.println(a + " - " + b + " = " + dif);
                    break;
                case 3: // nếu giá trị của choice = 3
                    var prod = a * b;
                    System.out.println(a + " * " + b + " = " + prod);
                    break;
                case 4: // nếu giá trị của choice = 4
                    if (b != 0) {
                        var quot = a / b;
                        System.out.println(a + " / " + b + " = " + quot);
                    } else {
                        System.out.println("Mẫu số = 0. Không thực hiện được phép chia.");
                    }
                    break;
                default:
                    System.out.println("Sai chức năng. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 0); // đk lặp là choice != 0

    }
}
