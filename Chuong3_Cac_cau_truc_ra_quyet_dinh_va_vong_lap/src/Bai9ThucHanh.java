import java.util.Scanner;

public class Bai9ThucHanh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        //Bai 1
//        System.out.println("Nhap vao so nguyen bat ki: ");
//        int n = input.nextInt();
//        if (n % 2 == 0) {
//            System.out.println(n + " la so chan");
//        } else {
//            System.out.println(n + " la so le");
//        }

//        //Bai 2
//        System.out.println("Nhap vao so thu nhat: ");
//        var num1 = input.nextInt();
//        System.out.println("Nhap vao so thu hai: ");
//        var num2 = input.nextInt();
//        if (num1 > num2) {
//            System.out.println(num1 + " > " + num2);
//        } else if (num1 == num2) {
//            System.out.println(num1 + " = " + num2);
//        } else {
//            System.out.println(num1 + " < " + num2);
//        }

//        //Bai 3
//        System.out.println("Nhap ho va ten: ");
//        var fullName = input.nextLine();
//
//        if (fullName.matches("^[a-zA-Z\\s]+$")) {
//            System.out.println("Hop le");
//        } else {
//            System.out.println("Khong hop le");
//        }

//        //Bai 4
//        System.out.println("Nhap vao chuoi thu nhat: ");
//        var str1 = input.nextLine();
//        System.out.println("Nhap vao chuoi thu hai: ");
//        var str2 = input.nextLine();
//        if (str1.compareTo(str2) == 0) {
//            System.out.println(str1 + " tuong duong " + str2);
//        } else if (str1.compareTo(str2) > 0) {
//            System.out.println(str1 + " dung sau chuoi " + str2);
//        } else {
//            System.out.println(str1 + " dung truoc chuoi " + str2);
//
//        }

//        //Bai 5
//        System.out.println("Nhap vao 3 so thuc bat ki: ");
//        var a = input.nextFloat();
//        var b = input.nextFloat();
//        var c = input.nextFloat();
//        if ((a <= 0) || (b <= 0) || (c <= 0)) {
//            System.out.println("Khong la 3 canh cua 1 tam giac");
//        } else if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
//            System.out.println("La 3 canh cua 1 tam giac");
//        } else {
//            System.out.println("Khong la 3 canh cua 1 tam giac");
//        }

//        //Bai 6
//        System.out.println("Nhap vao mot chuoi ki tu bat ki:");
//        String str = input.nextLine();
//        if (str.matches("^\\s+.*")) {                         //str.startsWith(" ") : khong bat duoc Tab
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }

//        //Bai 7
//        System.out.println("Nhap ho ten day du: ");
//        var fullName = input.nextLine().trim(); //.trim() neu muon loai bo dau cach thua o truoc va sau
//        var lastSpaceIndex = fullName.lastIndexOf(" ");
//        var firstName = fullName.substring(lastSpaceIndex + 1);
//        if (firstName.matches("^[A-Z].*")) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }


//        //Bai 8
//        System.out.println("Nhap vao chuoi can check: ");
//        var str = input.nextLine();
//        var lengthStr = str.length();
//        var firstCharacter = str.charAt(0);
//        var lastCharacter = str.charAt(lengthStr - 1);
//        if (firstCharacter == lastCharacter) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }

//        //Bai 9
//        System.out.println("Nhap vao day lon, day nho, chieu cao hinh thang: ");
//        var a = input.nextFloat();
//        var b = input.nextFloat();
//        var h = input.nextFloat();
//        Float S;
//        if ((a > 0) && (b > 0) && (h > 0)) {
//            S = (a + b) * h / 2;
//            System.out.println("Dien tich hinh thang S = " + S);
//        } else {
//            System.out.println("INVALID INPUT");
//        }

    }
}
