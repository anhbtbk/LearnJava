import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai6ThucHanh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        //Bai 1:
//        System.out.println("Enter a string: ");
//        String string = input.nextLine();
//        System.out.println("Length = " + string.length());
//
//        //Bai 2:
//        System.out.println(string.toUpperCase());
//
//        //Bai 3:
//        System.out.println(string.replace(" ", "*"));

//        //Bai 4 + Bai 5:
//        String str1 = "Bui Tuan Anh Tuan Anh";
//        String str2 = "Anh";
//        System.out.println(str1.indexOf(str2));
//        System.out.println(str1.lastIndexOf(str2));
//        //Chú ý: Nếu kết quả = -1 thì chuỗi str2 không xuất hiện trong chuỗi str1

//        //Bai 6:
//        String str = "       Bui   Tuan Anh  " ;
//        str = str.replaceAll("\\s+"," "); //thay nhiều khoảng cách = 1 khoảng cách
//        System.out.println(str.trim()); //xóa khoảng cách ở đầu và cuối chuỗi

//        //Bai 7:
//        String str = "Bui Tuan Anh";
//        System.out.println(str);
//        System.out.println(str.replaceAll("\\s+","\n"));

//        //Bai 7 lam lai:
//        String str = "Bui Tuan Tuan Anh";
//        int firstSpace = str.indexOf(" ");
//        int lastSpace = str.lastIndexOf(" ");
//        String lastName = str.substring(0, firstSpace);
//        String middleName = str.substring(firstSpace + 1, lastSpace);
//        String firstName = str.substring(lastSpace + 1);
//        System.out.println("Full Name: " + str);
//        System.out.println("Last Name: " + lastName);
//        System.out.println("Middle Name: " + middleName);
//        System.out.println("First Name: " + firstName);

        //Bai 8:
        String str = "Bui Tuan Anh";
        System.out.println("String: " + str);
        System.out.println("First character: " + str.charAt(0) + " " + "at 0");
        System.out.println("Last character: " + str.charAt(str.length() - 1) + " " + "at " + (str.length() - 1));


    }
}
