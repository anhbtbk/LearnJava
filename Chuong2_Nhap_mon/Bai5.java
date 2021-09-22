import java.awt.desktop.AboutEvent;
import java.text.DecimalFormat;
import java.text.NumberFormat;

//Ép kiểu, làm tròn số
public class Bai5 {
    public static void main(String[] args) {

//        Ép kiểu đóng hộp
//        Mục đích: chuyển từ giá trị sang đối tượng để có thể sử dụng được các phương thức
//        int x = 100;
//        Integer xObject = x;
//        System.out.println(xObject.toString());
//        System.out.println(xObject.intValue());


//        double a = 2;
//        double b = 3;
//        double result = a / b;
//        System.out.println(result);
//        System.out.println(Math.ceil(result));
//        System.out.println(Math.floor(result));
//        System.out.println(Math.round(result));

//        //sử dụng DecimalFormat
//        NumberFormat format = new DecimalFormat("###.####");
//        System.out.println(format.format(result));

//        //Sử dụng printf và chuỗi chuyển đổi định dạng
//        System.out.printf("%3.4f", result);

//        float x = (float)3.141592;
//        int y = (int)x;
//        System.out.println(y);

        int a = 2;
        int b = 3;
        double x = (double)a / b;
        System.out.println(x);
        System.out.printf("%.5f\n", x);
        NumberFormat format = new DecimalFormat("##.####");
        System.out.println(format.format(x));
        System.out.println(Math.round(x));
        Integer aObject = a;
        System.out.println(aObject.intValue());

    }
}