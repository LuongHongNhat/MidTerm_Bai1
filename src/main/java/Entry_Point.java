public class Entry_Point {


    public static int countUppercaseChar(String inputStr) {
        int count = 0;
        for (int i = 0; i < inputStr.length(); i++) {
//            String charInArray = String.valueOf(inputStr.charAt(i));
            if(Character.isUpperCase(inputStr.charAt(i))){
                count ++;
            }
        }
        return count;
    }

    public static void printUppercaseEachChar(String inputStr) {
        char[] charArray = inputStr.toCharArray();
        boolean foundSpace = true;
       for(int i = 0; i < charArray.length; i++) {
           if(Character.isLetter(charArray[i])) {
              if(foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else {
                foundSpace = true;
            }
        }
       System.out.println(String.valueOf(charArray));
    }

    public static void printUppercaseSentences(String inputStr) {

        String firstLetter = inputStr.substring(0, 1);
        String remainingStr = inputStr.substring(1, inputStr.length());
        int temp = inputStr.length();
        char[] charArray = remainingStr.toCharArray();
        firstLetter = firstLetter.toUpperCase();

       for(int i = 0; i < remainingStr.length(); i++) {
           if(charArray[i] == '.') {
                    charArray[i + 2] = Character.toUpperCase(charArray[i + 2]);
                }
        }

        System.out.println("Chuỗi sau khi đổi: " + firstLetter + String.valueOf(charArray));
    }
}
