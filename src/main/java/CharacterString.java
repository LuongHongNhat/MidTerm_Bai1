import java.util.Scanner;

public class CharacterString {

    private static String inputString() {
        System.out.println("Input your string:");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        return inputString;
    }

    public static void main( String[] args )
    {
        String inputStr = inputString();

        // Đếm kí tự in hoa trong chuỗi
//        System.out.println("My Uppercase character in string are : " + Entry_Point.countUppercaseChar(inputStr));
//        System.out.println("=============");

        // Xuất chuỗi và viết in hoa chữ cái đầu
//        Entry_Point.printUppercaseEachChar(inputStr);
//        System.out.println("=============");

        Entry_Point.printUppercaseSentences(inputStr);
//        System.out.println("=============");

    }
}
