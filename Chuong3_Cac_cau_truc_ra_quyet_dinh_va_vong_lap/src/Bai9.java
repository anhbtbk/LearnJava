import java.util.Scanner;

//Bài 9. Cấu trúc ra quyết định if - else
public class Bai9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap diem trung binh cua ban: ");
        var avgGrade = input.nextFloat();
        var level = "";
        var amount = 0;
        if (avgGrade >= 3.6) {
            level = "xuat xac";
            amount = 10_000_000;
        } else if (avgGrade >= 3.2) {
            level = "gioi";
            amount = 4_600_000;
        } else if (avgGrade >= 3.0) {
            level = "kha";
            amount = 3_200_000;
        } else {
            level = "ban khong dat hoc bong";
        }
        System.out.println("Ban da dat hoc bong loai: " + level);
        System.out.println("Muc thuong: " + amount + "d");
    }
}
