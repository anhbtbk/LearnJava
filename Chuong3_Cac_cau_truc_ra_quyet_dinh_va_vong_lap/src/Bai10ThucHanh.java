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
//        System.out.println("Moi ban nhap ngay sinh: ");
//        var date = input.nextInt();
//        System.out.println("Moi ban nhap thang sinh: ");
//        var month = input.nextInt();
//        switch (month) {
//            case 1: {
//                switch (date) {
//                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19:
//                        System.out.println("Ma Ket");
//                        break;
//                    case 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31:
//                        System.out.println("Bao Binh");
//                        break;
//                }
//                break;
//            }
//            case 2: {
//                switch (date) {
//                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18:
//                        System.out.println("Bao Binh");
//                        break;
//                    case 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29:
//                        System.out.println("Song Ngu");
//                        break;
//                }
//                break;
//            }
//            case 3: {
//                switch (date) {
//                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20:
//                        System.out.println("Song Ngu");
//                        break;
//                    case 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31:
//                        System.out.println("Bach Duong");
//                        break;
//                }
//                break;
//            }
//            case 4: {
//                switch (date) {
//                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20:
//                        System.out.println("Bach Duong");
//                        break;
//                    case 21, 22, 23, 24, 25, 26, 27, 28, 29, 30:
//                        System.out.println("Kim Nguu");
//                        break;
//                }
//                break;
//            }
//            case 5: {
//                switch (date) {
//                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20:
//                        System.out.println("Kim Nguu");
//                        break;
//                    case 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31:
//                        System.out.println("Song Tu");
//                        break;
//                }
//                break;
//            }
//            case 6: {
//                switch (date) {
//                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21:
//                        System.out.println("Song Tu");
//                        break;
//                    case 22, 23, 24, 25, 26, 27, 28, 29, 30:
//                        System.out.println("Cu Giai");
//                        break;
//                }
//                break;
//            }
//            case 7: {
//                switch (date) {
//                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22:
//                        System.out.println("Cu Giai");
//                        break;
//                    case 23, 24, 25, 26, 27, 28, 29, 30, 31:
//                        System.out.println("Su Tu");
//                        break;
//                }
//                break;
//            }
//            case 8: {
//                switch (date) {
//                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22:
//                        System.out.println("Su Tu");
//                        break;
//                    case 23, 24, 25, 26, 27, 28, 29, 30, 31:
//                        System.out.println("Xu Nu");
//                        break;
//                }
//                break;
//            }
//            case 9: {
//                switch (date) {
//                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22:
//                        System.out.println("Xu Nu");
//                        break;
//                    case 23, 24, 25, 26, 27, 28, 29, 30:
//                        System.out.println("Thien Binh");
//                        break;
//
//                }
//                break;
//            }
//            case 10: {
//                switch (date) {
//                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23:
//                        System.out.println("Thien Binh");
//                        break;
//                    case 24, 25, 26, 27, 28, 29, 30, 31:
//                        System.out.println("Bo Cap");
//                        break;
//                }
//                break;
//            }
//            case 11: {
//                switch (date) {
//                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22:
//                        System.out.println("Bo Cap");
//                        break;
//                    case 23, 24, 25, 26, 27, 28, 29, 30:
//                        System.out.println("Nhan Ma");
//                        break;
//                }
//                break;
//            }
//            case 12: {
//                switch (date) {
//                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21:
//                        System.out.println("Nhan Ma");
//                        break;
//                    case 22, 23, 24, 25, 26, 27, 28, 29, 30, 31:
//                        System.out.println("Ma Ket");
//                        break;
//                }
//                break;
//            }
//            default:
//                System.out.println("Ngay thang khong hop le, xin moi nhap lai!");
//                break;
//        }


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

// *************************Chua bai tap****************************

//Bai 1:
//        System.out.println("Moi ban nhap lua chon: ");
//        System.out.println("0: Thoat chuong trinh.");
//        System.out.println("1-12: Tuong ung cac thang trong nam");
//        var choice = input.nextInt();
//        var season = "";
//        switch (choice) {
//
//            case 0: {
//                System.out.println("Thoat chuong trinh!");
//                break;
//            }
//            case 1, 2, 3:
//                season = "mua xuan";
//                break;
//            case 4, 5, 6:
//                season = "mua ha";
//                break;
//            case 7, 8, 9:
//                season = "mua thu";
//                break;
//            case 10, 11, 12:
//                season = "mua dong";
//                break;
//            default: {
//                System.out.println("Gia tri nhap khong hop le, xin moi nhap lai!");
//                break;
//            }
//        }
//        if (!season.isEmpty()) {
//            System.out.println("Thang " + choice + " la mua " + season);
//        }

        //Bai 2:
//        System.out.println("Nh???p gi?? tr??? s??? t??? 1-12: ");
//        var number = input.nextInt();
//        var zodiac = ""; // bi???n l??u t??n con gi??p
//        // ti???n h??nh ????nh gi?? v???i switch
//        switch (number) {
//            case 0:
//                System.out.println("K???t th??c ch????ng tr??nh");
//                break;
//            case 1:
//                zodiac = "T??";
//                break;
//            case 2:
//                zodiac = "S???u";
//                break;
//            case 3:
//                zodiac = "D???n";
//                break;
//            case 4:
//                zodiac = "M??o";
//                break;
//            case 5:
//                zodiac = "Th??n";
//                break;
//            case 6:
//                zodiac = "T???";
//                break;
//            case 7:
//                zodiac = "Ng???";
//                break;
//            case 8:
//                zodiac = "M??i";
//                break;
//            case 9:
//                zodiac = "Th??n";
//                break;
//            case 10:
//                zodiac = "D???u";
//                break;
//            case 11:
//                zodiac = "Tu???t";
//                break;
//            case 12:
//                zodiac = "H???i";
//                break;
//            default:
//                System.out.println("Gi?? tr??? kh??ng h???p l???. Vui l??ng nh???p gi?? tr??? [1-12]");
//        }
//        if (!zodiac.isEmpty()) {
//            System.out.println("STT " + number + " l?? con gi??p: " + zodiac);
//        }

        //Bai 3:
//        System.out.println("Nh???p ng??y sinh th??ng sinh c??ch nhau b???i 1 d???u c??ch: ");
//        var day = input.nextInt();
//        var month = input.nextInt();
//        var zodiac = ""; // bi???n l??u t??n con gi??p
//        // ta x??t th??ng tr?????c ng??y sau v?? s??? th??ng ??t h??n s??? ng??y
//        switch (month) {
//            case 1:
//                if (0 < day && day < 20) { // 1 - 19/1
//                    zodiac = "Ma K???t";
//                } else if (day >= 20 && day <= 31) { // 20 - 31/1
//                    zodiac = "B???o B??nh";
//                } else {
//                    System.out.println("Ng??y kh??ng h???p l???");
//                }
//                break;
//            case 2:
//                if (0 < day && day < 19) { // 1 - 18/2
//                    zodiac = "B???o B??nh";
//                } else if (day >= 19 && day <= 29) { // 19 - 29/2
//                    zodiac = "Song Ng??";
//                } else {
//                    System.out.println("Ng??y kh??ng h???p l???");
//                }
//                break;
//            case 3:
//                if (0 < day && day < 21) { // 1 - 20/3
//                    zodiac = "Song Ng??";
//                } else if (day >= 21 && day <= 31) { // 21 - 31/3
//                    zodiac = "B???ch D????ng";
//                } else {
//                    System.out.println("Ng??y kh??ng h???p l???");
//                }
//                break;
//            case 4:
//                if (0 < day && day < 21) { // 1 - 20/4
//                    zodiac = "B???ch D????ng";
//                } else if (day >= 21 && day <= 30) { // 21 - 30/4
//                    zodiac = "Kim Ng??u";
//                } else {
//                    System.out.println("Ng??y kh??ng h???p l???");
//                }
//                break;
//            case 5:
//                if (0 < day && day < 21) { // 1 - 20/5
//                    zodiac = "Kim Ng??u";
//                } else if (day >= 21 && day <= 31) { // 21 - 31/5
//                    zodiac = "Song T???";
//                } else {
//                    System.out.println("Ng??y kh??ng h???p l???");
//                }
//                break;
//            case 6:
//                if (0 < day && day < 22) { // 1 - 21/6
//                    zodiac = "Song T???";
//                } else if (day >= 22 && day <= 30) { // 22 - 30/6
//                    zodiac = "C??? Gi???i";
//                } else {
//                    System.out.println("Ng??y kh??ng h???p l???");
//                }
//                break;
//            case 7:
//                if (0 < day && day < 23) { // 1 - 22/7
//                    zodiac = "C??? Gi???i";
//                } else if (day >= 23 && day <= 31) { // 23 - 31/7
//                    zodiac = "S?? T???";
//                } else {
//                    System.out.println("Ng??y kh??ng h???p l???");
//                }
//                break;
//            case 8:
//                if (0 < day && day < 23) { // 1 - 22/8
//                    zodiac = "S?? T???";
//                } else if (day >= 23 && day <= 31) { // 23 - 31/8
//                    zodiac = "X??? N???";
//                } else {
//                    System.out.println("Ng??y kh??ng h???p l???");
//                }
//                break;
//            case 9:
//                if (0 < day && day < 23) { // 1 - 22/9
//                    zodiac = "X??? N???";
//                } else if (day >= 23 && day <= 30) { // 23 - 30/9
//                    zodiac = "Thi??n B??nh";
//                } else {
//                    System.out.println("Ng??y kh??ng h???p l???");
//                }
//                break;
//            case 10:
//                if (0 < day && day < 24) { // 1 - 23/10
//                    zodiac = "Thi??n B??nh";
//                } else if (day >= 24 && day <= 31) { // 24 - 31/10
//                    zodiac = "B??? C???p";
//                } else {
//                    System.out.println("Ng??y kh??ng h???p l???");
//                }
//                break;
//            case 11:
//                if (0 < day && day < 23) { // 1 - 22/11
//                    zodiac = "B??? C???p";
//                } else if (day >= 24 && day <= 30) { // 23 - 30/11
//                    zodiac = "Nh??n M??";
//                } else {
//                    System.out.println("Ng??y kh??ng h???p l???");
//                }
//                break;
//            case 12:
//                if (0 < day && day < 22) { // 1 - 21/12
//                    zodiac = "Nh??n M??";
//                } else if (day >= 22 && day <= 31) { // 22 - 31/12
//                    zodiac = "Ma K???t";
//                } else {
//                    System.out.println("Ng??y kh??ng h???p l???");
//                }
//                break;
//            default:
//                System.out.println("Th??ng kh??ng h???p l???. Vui l??ng ki???m tra l???i.");
//                break;
//        }
//        if (!zodiac.isEmpty()) {
//            System.out.println("Cung ho??ng ?????o nh?? b???n l??: " + zodiac);
//        }

        //Bai 4:
        System.out.println("Nh???p t??n ng??y c???a tu???n: ");
        var dayOfWeek = input.nextLine();
        var result = ""; // bi???n l??u k???t qu??? chuy???n ?????i
        // ti???n h??nh ki???m tra v?? ????nh gi??
        dayOfWeek = dayOfWeek.toLowerCase(); // vi???t th?????ng h???t cho d??? so s??nh
        dayOfWeek = dayOfWeek.trim(); // lo???i b??? h???t c??c d???u c??ch th???a
        // v??o c???u tr??c switch
        switch (dayOfWeek) {
            case "th??? hai":
                result = "Monday";
                break;
            case "th??? ba":
                result = "Tuesday";
                break;
            case "th??? t??":
                result = "Wednesday";
                break;
            case "th??? n??m":
                result = "Thursday";
                break;
            case "th??? s??u":
                result = "Friday";
                break;
            case "th??? b???y":
                result = "Saturday";
                break;
            case "ch??? nh???t":
                result = "Sunday";
                break;
            default:
                result = "Invalid day of week";
                break;
        }
        System.out.println("K???t qu??? chuy???n ?????i: ");
        System.out.println(dayOfWeek + " -> " + result);

    }
}
