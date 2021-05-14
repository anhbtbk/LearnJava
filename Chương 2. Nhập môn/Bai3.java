import java.util.Scanner;

//Các biến trong Java
public class Bai3 {
    public static void main(String[] args) {
        //khai báo hằng
        final int MAX = 500;
        final double PI;
        PI = 3.141592;
        final String MONDAY = "Monday";
        final boolean OK = true;

        //khai báo biến
        int age = 0;
        String fullName;
        long ballance;
        Scanner input = new Scanner(System.in); //hàm nhập từ bàn phím
        System.out.println("Nhap tuoi cua ban: ");
        age = input.nextInt();
        input.nextLine();   //đọc bỏ dòng thừa

        System.out.println("Nhap ten cua ban: ");
        fullName = input.nextLine();

        System.out.println("So du la: ");
        ballance = input.nextLong();

        System.out.println("Hello " + fullName);
        System.out.println("Ban " + age + " tuoi.");
        System.out.println("So du cua ban la: " + ballance + "d");
//        System.out.printf("Hello %s!\n",fullName);     //giống trong C
//        System.out.printf("Ban %d tuoi\n",age);
//        System.out.printf("So du cua ban la %d\n",ballance);


    }


}
