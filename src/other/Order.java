package other;

public class Order {

    public static String order(String words) {
        StringBuilder sb = new StringBuilder();
        if(words.length() > 1) {
            String[] s = words.split(" ");

            for(int i = 0; i < s.length; i++) {
                for(int j = 0; j < s.length; j++) {
                    if(s[j].contains(Integer.toString(i+1))) {
                        sb.append(s[j] + " ");
                    }
                }

            }
            sb.delete(sb.length()-1,sb.length());
            return sb.toString();
        }
        return words;
    }

  public static void main(String[] args) {
    //
    System.out.println(order("is2 Thi1s T4est 3a"));
    System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
    System.out.println(order("bac1a"));
    System.out.println(order(""));
  }
}
