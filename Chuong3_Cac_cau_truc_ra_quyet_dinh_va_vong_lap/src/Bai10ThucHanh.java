import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai10ThucHanh {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        //Bai 1:
//        System.out.println("Moi ban nhap lua chon: ");
//        System.out.println("0: Thoat chuong trinh.");
//        System.out.println("1-12: Tuong ung cac thang trong nam");
//        var choice = input.nextInt();
//        switch (choice) {
//
//            case 0: {
//                System.out.println("Thoat chuong trinh!");
//                break;
//            }
//            case 1:
//            case 2:
//            case 3: {
//                System.out.println("Mua xuan");
//                break;
//            }
//            case 4:
//            case 5:
//            case 6: {
//                System.out.println("Mua ha");
//                break;
//            }
//            case 7, 8, 9: {
//                System.out.println("Mua thu");
//                break;
//            }
//            case 10, 11, 12: {
//                System.out.println("Mua dong");
//                break;
//            }
//            default: {
//                System.out.println("Gia tri nhap khong dung, xin moi nhap lai!");
//                break;
//            }
//        }

        //Bai 2:
//        System.out.println("Moi ban nhap lua chon tu 0 - 12: ");
//
//        var choice = input.nextInt();
//        switch (choice) {
//
//            case 0: {
//                System.out.println("Thoat chuong trinh!");
//                break;
//            }
//            case 1: {
//                System.out.println("Ti");
//                break;
//            }
//            case 2: {
//                System.out.println("Suu");
//                break;
//            }
//            case 3: {
//                System.out.println("Dan");
//                break;
//            }
//            case 4: {
//                System.out.println("Mao");
//                break;
//            }
//            case 5: {
//                System.out.println("Thin");
//                break;
//            }
//            case 6: {
//                System.out.println("Ty");
//                break;
//            }
//            case 7: {
//                System.out.println("Ngo");
//                break;
//            }
//            case 8: {
//                System.out.println("Mui");
//                break;
//            }
//            case 9: {
//                System.out.println("Than");
//                break;
//            }
//            case 10: {
//                System.out.println("Dau");
//                break;
//            }
//            case 11: {
//                System.out.println("Tuat");
//                break;
//            }
//            case 12: {
//                System.out.println("Hoi");
//                break;
//            }
//
//            default: {
//                System.out.println("Gia tri nhap khong dung, xin moi nhap lai!");
//                break;
//            }
//        }
        //Bai 3:
//
        System.out.println("Moi ban nhap ngay sinh: ");
        var date = input.nextInt();
        System.out.println("Moi ban nhap thang sinh: ");
        var month = input.nextInt();
        switch (month) {
            case 1: {
                switch (date) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19:
                        System.out.println("Ma Ket");
                        break;
                    case 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31:
                        System.out.println("Bao Binh");
                        break;
                }
                break;
            }
            case 2: {
                switch (date) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18:
                        System.out.println("Bao Binh");
                        break;
                    case 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29:
                        System.out.println("Song Ngu");
                        break;
                }
                break;
            }
            case 3: {
                switch (date) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20:
                        System.out.println("Song Ngu");
                        break;
                    case 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31:
                        System.out.println("Bach Duong");
                        break;
                }
                break;
            }
            case 4: {
                switch (date) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20:
                        System.out.println("Bach Duong");
                        break;
                    case 21, 22, 23, 24, 25, 26, 27, 28, 29, 30:
                        System.out.println("Kim Nguu");
                        break;
                }
                break;
            }
            case 5: {
                switch (date) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20:
                        System.out.println("Kim Nguu");
                        break;
                    case 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31:
                        System.out.println("Song Tu");
                        break;
                }
                break;
            }
            case 6: {
                switch (date) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21:
                        System.out.println("Song Tu");
                        break;
                    case 22, 23, 24, 25, 26, 27, 28, 29, 30:
                        System.out.println("Cu Giai");
                        break;
                }
                break;
            }
            case 7: {
                switch (date) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22:
                        System.out.println("Cu Giai");
                        break;
                    case 23, 24, 25, 26, 27, 28, 29, 30, 31:
                        System.out.println("Su Tu");
                        break;
                }
                break;
            }
            case 8: {
                switch (date) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22:
                        System.out.println("Su Tu");
                        break;
                    case 23, 24, 25, 26, 27, 28, 29, 30, 31:
                        System.out.println("Xu Nu");
                        break;
                }
                break;
            }
            case 9: {
                switch (date) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22:
                        System.out.println("Xu Nu");
                        break;
                    case 23, 24, 25, 26, 27, 28, 29, 30:
                        System.out.println("Thien Binh");
                        break;

                }
                break;
            }
            case 10: {
                switch (date) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23:
                        System.out.println("Thien Binh");
                        break;
                    case 24, 25, 26, 27, 28, 29, 30, 31:
                        System.out.println("Bo Cap");
                        break;
                }
                break;
            }
            case 11: {
                switch (date) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22:
                        System.out.println("Bo Cap");
                        break;
                    case 23, 24, 25, 26, 27, 28, 29, 30:
                        System.out.println("Nhan Ma");
                        break;
                }
                break;
            }
            case 12: {
                switch (date) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21:
                        System.out.println("Nhan Ma");
                        break;
                    case 22, 23, 24, 25, 26, 27, 28, 29, 30, 31:
                        System.out.println("Ma Ket");
                        break;
                }
                break;
            }
            default:
                System.out.println("Ngay thang khong hop le, xin moi nhap lai!");
                break;
        }


        //Bai 4:
//        System.out.println("Moi ban nhap ten cac thu bang Tieng Viet: ");
//        var choice = input.nextLine();
//        var choiceChange = choice.toLowerCase();
//        switch (choiceChange) {
//            case "thu hai": {
//                System.out.println("Monday");
//                break;
//            }
//            case "thu ba": {
//                System.out.println("Tuesday");
//                break;
//            }
//            case "thu tu": {
//                System.out.println("Wednesday");
//                break;
//            }
//            case "thu nam": {
//                System.out.println("Thursday");
//                break;
//            }
//            case "thu sau": {
//                System.out.println("Friday");
//                break;
//            }
//            case "thu bay": {
//                System.out.println("Saturday");
//                break;
//            }
//            case "chu nhat": {
//                System.out.println("Sunday");
//                break;
//            }
//            default: {
//                System.out.println("Invalid day of week");
//            }
//
//        }

    }
}
