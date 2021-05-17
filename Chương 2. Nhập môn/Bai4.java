//các toán tử
public class Bai4 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("kq = " + (a && b));
        System.out.println("kq = " + (a || b));

    }
}

// + và - được sử dụng như toán hạng 1 ngôi và 2 ngôi
/*
        float a = Float.NaN;
        float b = 600;
        float sum = a + b;
        kq = NaN
 */
/*
        float a = Float.NEGATIVE_INFINITY;
        float b = Float.POSITIVE_INFINITY;
        float sum = a + b;
        kq = NaN
 */
/*
        float a = 0;
        float b = 0;
        float sum = a / b;
        kq = NaN
        //chú ý kết quả phép chia khi toán hạng là số nguyên hay số thực sẽ khác nhau
 */
/*
        double a = -10.25;
        long b = -3;
        double sum = a % b; //dấu phụ thuộc tử số
        kq = -1.25
 */
/*
        long a = 10;
        long x = ++a; //tăng a lên 1 đơn vị sau đó gán vào x
        System.out.println("a = " + a); //a = 11
        System.out.println("x = " + x); //x = 11

        long b = 5;
        long y = b++;   //y gán bằng b sau đó mới tăng b lên 1 đơn vị
        System.out.println("b = " + b); //b = 6
        System.out.println("y = " + y); //y = 5 (gán bằng giá trị b trước khi tăng 1 đơn vị
 */
/*
        long a = 10;
        long b = 100;
        System.out.println("kq = " + (a==b));  //chỉ nên so sánh 2 giá trị cùng kiểu
        kq = false
 */
/*
        //chỉ thực hiện được 2 toán hạng ở kiểu boolean
        boolean a = true;
        boolean b = false;
        System.out.println("kq = " + (a && b)); kq = false
        System.out.println("kq = " + (a || b)); kq = true
        // đối với phép và && nên đưa biểu thức sai nhiều nhất lên trước, vì nếu gặp sai sẽ dừng so sánh
        // đối với phép hoặc || nên đưa biểu thức đúng nhiều nhất lên trước, vì nếu gặp đúng sẽ dừng so sánh
        // => chương trình sẽ chạy nhanh hơn
 */