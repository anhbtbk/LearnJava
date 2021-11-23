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
//        System.out.println("Nhập giá trị số từ 1-12: ");
//        var number = input.nextInt();
//        var zodiac = ""; // biến lưu tên con giáp
//        // tiến hành đánh giá với switch
//        switch (number) {
//            case 0:
//                System.out.println("Kết thúc chương trình");
//                break;
//            case 1:
//                zodiac = "Tý";
//                break;
//            case 2:
//                zodiac = "Sửu";
//                break;
//            case 3:
//                zodiac = "Dần";
//                break;
//            case 4:
//                zodiac = "Mão";
//                break;
//            case 5:
//                zodiac = "Thìn";
//                break;
//            case 6:
//                zodiac = "Tỵ";
//                break;
//            case 7:
//                zodiac = "Ngọ";
//                break;
//            case 8:
//                zodiac = "Mùi";
//                break;
//            case 9:
//                zodiac = "Thân";
//                break;
//            case 10:
//                zodiac = "Dậu";
//                break;
//            case 11:
//                zodiac = "Tuất";
//                break;
//            case 12:
//                zodiac = "Hợi";
//                break;
//            default:
//                System.out.println("Giá trị không hợp lệ. Vui lòng nhập giá trị [1-12]");
//        }
//        if (!zodiac.isEmpty()) {
//            System.out.println("STT " + number + " là con giáp: " + zodiac);
//        }

        //Bai 3:
//        System.out.println("Nhập ngày sinh tháng sinh cách nhau bởi 1 dấu cách: ");
//        var day = input.nextInt();
//        var month = input.nextInt();
//        var zodiac = ""; // biến lưu tên con giáp
//        // ta xét tháng trước ngày sau vì số tháng ít hơn số ngày
//        switch (month) {
//            case 1:
//                if (0 < day && day < 20) { // 1 - 19/1
//                    zodiac = "Ma Kết";
//                } else if (day >= 20 && day <= 31) { // 20 - 31/1
//                    zodiac = "Bảo Bình";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 2:
//                if (0 < day && day < 19) { // 1 - 18/2
//                    zodiac = "Bảo Bình";
//                } else if (day >= 19 && day <= 29) { // 19 - 29/2
//                    zodiac = "Song Ngư";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 3:
//                if (0 < day && day < 21) { // 1 - 20/3
//                    zodiac = "Song Ngư";
//                } else if (day >= 21 && day <= 31) { // 21 - 31/3
//                    zodiac = "Bạch Dương";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 4:
//                if (0 < day && day < 21) { // 1 - 20/4
//                    zodiac = "Bạch Dương";
//                } else if (day >= 21 && day <= 30) { // 21 - 30/4
//                    zodiac = "Kim Ngưu";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 5:
//                if (0 < day && day < 21) { // 1 - 20/5
//                    zodiac = "Kim Ngưu";
//                } else if (day >= 21 && day <= 31) { // 21 - 31/5
//                    zodiac = "Song Tử";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 6:
//                if (0 < day && day < 22) { // 1 - 21/6
//                    zodiac = "Song Tử";
//                } else if (day >= 22 && day <= 30) { // 22 - 30/6
//                    zodiac = "Cự Giải";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 7:
//                if (0 < day && day < 23) { // 1 - 22/7
//                    zodiac = "Cự Giải";
//                } else if (day >= 23 && day <= 31) { // 23 - 31/7
//                    zodiac = "Sư Tử";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 8:
//                if (0 < day && day < 23) { // 1 - 22/8
//                    zodiac = "Sư Tử";
//                } else if (day >= 23 && day <= 31) { // 23 - 31/8
//                    zodiac = "Xử Nữ";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 9:
//                if (0 < day && day < 23) { // 1 - 22/9
//                    zodiac = "Xử Nữ";
//                } else if (day >= 23 && day <= 30) { // 23 - 30/9
//                    zodiac = "Thiên Bình";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 10:
//                if (0 < day && day < 24) { // 1 - 23/10
//                    zodiac = "Thiên Bình";
//                } else if (day >= 24 && day <= 31) { // 24 - 31/10
//                    zodiac = "Bọ Cạp";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 11:
//                if (0 < day && day < 23) { // 1 - 22/11
//                    zodiac = "Bọ Cạp";
//                } else if (day >= 24 && day <= 30) { // 23 - 30/11
//                    zodiac = "Nhân Mã";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 12:
//                if (0 < day && day < 22) { // 1 - 21/12
//                    zodiac = "Nhân Mã";
//                } else if (day >= 22 && day <= 31) { // 22 - 31/12
//                    zodiac = "Ma Kết";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            default:
//                System.out.println("Tháng không hợp lệ. Vui lòng kiểm tra lại.");
//                break;
//        }
//        if (!zodiac.isEmpty()) {
//            System.out.println("Cung hoàng đạo nhà bạn là: " + zodiac);
//        }

        //Bai 4:
        System.out.println("Nhập tên ngày của tuần: ");
        var dayOfWeek = input.nextLine();
        var result = ""; // biến lưu kết quả chuyển đổi
        // tiến hành kiểm tra và đánh giá
        dayOfWeek = dayOfWeek.toLowerCase(); // viết thường hết cho dễ so sánh
        dayOfWeek = dayOfWeek.trim(); // loại bỏ hết các dấu cách thừa
        // vào cấu trúc switch
        switch (dayOfWeek) {
            case "thứ hai":
                result = "Monday";
                break;
            case "thứ ba":
                result = "Tuesday";
                break;
            case "thứ tư":
                result = "Wednesday";
                break;
            case "thứ năm":
                result = "Thursday";
                break;
            case "thứ sáu":
                result = "Friday";
                break;
            case "thứ bảy":
                result = "Saturday";
                break;
            case "chủ nhật":
                result = "Sunday";
                break;
            default:
                result = "Invalid day of week";
                break;
        }
        System.out.println("Kết quả chuyển đổi: ");
        System.out.println(dayOfWeek + " -> " + result);

    }
}
