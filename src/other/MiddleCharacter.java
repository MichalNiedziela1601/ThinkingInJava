package other;

public class MiddleCharacter {

    public static String getMiddle(String word) {
        int length = word.length();
        if(length % 2 == 0) {
            String word1 = word.substring(length/2-1,length/2+1);
            return word1;
            } else if(length < 2) {
            return word;
        } else {
            return word.substring(length/2, length - length/2);
        }
    }

    public static void main(String[] args) {
    System.out.println(getMiddle("test"));
    System.out.println(getMiddle("testing"));
    System.out.println(getMiddle("middle"));
    System.out.println(getMiddle("A"));
    }
}
