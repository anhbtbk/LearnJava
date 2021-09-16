import javax.sound.midi.Soundbank;

//Lớp String
public class Bai6 {
    public static void main(String[] args) {
        String firstName = "Anh";
        System.out.println(firstName.toUpperCase());
        System.out.println(firstName.toLowerCase());
        System.out.println(firstName.compareTo("anh"));
        System.out.println(firstName.compareTo("ANH"));
        System.out.println(firstName.compareTo("ANh"));
        System.out.println(firstName.length());

        String result = "      Bui Tuan Anh       ";
        System.out.println(result.replace(" ", "*"));
        System.out.println(result.replaceAll("\\s+", "**"));
    }
}

// String là kiểu tham chiếu, biến là đối tượng và bất biến
// Vì biến là đối tượng nên có thể gọi đến các phương thức
// Bản chất String là final class
