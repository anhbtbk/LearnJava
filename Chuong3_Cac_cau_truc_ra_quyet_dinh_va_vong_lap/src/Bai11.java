//Bài 11. Toán tử ba ngôi
public class Bai11 {

    //    public static void main(String[] args) {
//        var n = 100;
//        System.out.println(isEven(n));
//    }
//    public static boolean isEven(int n) {
//        return (n % 2 == 0);
//    }
    public static void main(String[] args) {
        var n = 35;
        var result = "";
        result = (n % 2 == 0) ? "la so chan" : "la so le";
        System.out.println(result);

        var isDivisable = false;
        isDivisable = (n % 2 == 0) ? true
                : (n % 3 == 0) ? true
                : (n % 5 == 0);
        System.out.println(isDivisable);
    }
}