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
//        System.out.println("Nhập vào chuỗi kí tự: ");
//        var str = input.nextLine();
//        str = str.trim(); // loại bỏ các dấu cách thừa
//        // thay thế các chỗ có 1 hoặc nhiều khoảng trắng bằng 1 dấu cách
//        str = str.replaceAll("\\s+", " ");
//        System.out.println("Chuỗi sau chuẩn hóa: " + str);
//        // tiến hành kiểm tra và in ra
//        for (int i = 0; i < str.length(); i++) {
//            if (i == 0) { // in ra chữ cái đầu từ đầu tiên
//                System.out.println(str.charAt(i));
//            }
//            if (str.charAt(i) == ' ') { // in ra chữ cái đầu từ tiếp theo
//                System.out.println(str.charAt(i + 1));
//            }
//        }

////      //Bai 4
//        System.out.println("Nhập vào chuỗi kí tự: ");
//        var str = input.nextLine();
//        str = str.trim(); // loại bỏ các dấu cách thừa
//        // thay thế các chỗ có 1 hoặc nhiều khoảng trắng bằng 1 dấu cách
//        str = str.replaceAll("\\s+", " ");
//        int count = 0;
//        if (!str.isEmpty()) { // nếu str không rỗng
//            count = 1; // ít nhất chuỗi str có 1 từ
//        }
//        // tiến hành đếm số từ
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ' ') {
//                count++; // tăng biến đếm lên
//            }
//        }
//        System.out.println("Chuỗi đã chuẩn hóa: \"" + str + "\"");
//        System.out.println("Số từ: " + count);

//        //Bai 5
//        System.out.println("Nhập vào chuỗi kí tự: ");
//        var str = input.nextLine();
//        // in ra theo thứ tự ngược lại:
//        for (int i = str.length() - 1; i >= 0; i--) {
//            System.out.print(str.charAt(i));
//        }

//        //Bai 6
//        System.out.println("Nhap vao so n = ");
//        var n = input.nextInt();
//        if (n <= 1) {
//            System.out.println(n + " khong la so nguyen to");
//        } else if (n == 2) {
//            System.out.println(n + " la so nguyen to");
//        } else if (n > 2) {
//            for (int i = 2; i < n; i++) {
//                if (n % i == 0) {
//                    System.out.println(n + " khong la so nguyen to");
//                    break;
//                } else {
//                    System.out.println(n + " la so nguyen to");
//                }
//            }
//        }

//        //Bai 6 chữa:
//        System.out.println("Nhập số nguyên n: ");
//        var n = input.nextInt(); // nhập vào số n
//        boolean isPrime = true; // giả sử rằng n là số n.tố
//        if (n < 2) { // mọi số < 2 k ng.tố
//            isPrime = false; // n k phải số nguyên tố
//        } else {
//            // kiểm tra các giá trị từ 2->căn bậc 2 của n là đủ
//            int bound = (int) Math.sqrt(n);
//            for (int i = 2; i <= bound; i++) {
//                if (n % i == 0) {
//                    isPrime = false; // n k phải số ng.tố
//                }
//            }
//        }
//        if (isPrime) {
//            System.out.println(n + " là số nguyên tố.");
//        } else {
//            System.out.println(n + " không phải số nguyên tố.");
//        }

////        //Bai 7
//        System.out.println("Nhập số nguyên a < b: ");
//        var a = input.nextInt(); // nhập a
//        var b = input.nextInt(); // nhập b
//        // tiến hành in ra số nguyên tố trong đoạn [a, b]
//        System.out.println("Các số nguyên tố trong đoạn [a, b]: ");
//        // xét lần lượt từng phần tử
//        for (int i = a; i <= b; i++) {
//            boolean isPrime = true;
//            if (i < 2) {
//                isPrime = false;
//            } else {
//                for (int j = 2; j <= Math.sqrt(i); j++) {
//                    if (i % j == 0) { // nếu i có ước là j
//                        isPrime = false;
//                    }
//                }
//            }
//            // nếu i là số nguyên tố thì in ra i và phân tách , ngược lại in ra chuỗi rỗng
//            System.out.print(isPrime ? i + ", " : ""); // in ra print để không xuống dòng - toán tử 3 ngôi
//        }

//        //Bai 8
//        System.out.println("Nhập số nguyên dương n: ");
//        var n = input.nextInt();
//        // tạo ra một biến để lưu giá trị đảo
//        var revert = 0;
//        // tiến hành lấy giá trị đảo của n
//        for (int i = n; i > 0; i /= 10) { // chừng nào n > 0
//            // đảo = đảo * 10 + phần đơn vị của i
//            revert = revert * 10 + i % 10;
//            // sau đó i phải loại bỏ phần đơn vị bằng cách chia nguyên cho 10
//        }
//        // khi có giá trị đảo, kiểm tra xem chúng có khớp nhau không
//        System.out.println(n == revert ? "n là số đẹp" : "n không phải số đẹp");

//        //Bai 9
//        System.out.println("Nhập số nguyên dương n <= 90: ");
//        var n = input.nextInt();
//        // tiến hành tạo số fibo:
//        long f0 = 0;
//        long f1 = 1;
//        long fn = (n < 2) ? n : 0; // nếu n < 2, fn = n
//        for (int i = 2; i <= n; i++) {
//            fn = f0 + f1;
//            f0 = f1;
//            f1 = fn;
//        }
//        System.out.println("F" + n + " = " + fn);
        //Bai 10
        System.out.println("Nhập 2 số a, b với 0 <= a < b <= 90: ");
        var a = input.nextInt();
        var b = input.nextInt();
        // tiến hành tìm số fibo thứ i:
        for (int i = a; i <= b; i++) {
            // nhớ fresh f0, f1, fn nếu không sẽ sai kq
            long f0 = 0;
            long f1 = 1;
            long fn = (i < 2) ? i : 0;
            for (int j = 2; j <= i; j++) {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
            }
            System.out.println("F" + i + " = " + fn);
        }
    }
}

