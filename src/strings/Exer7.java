package strings;

public class Exer7 {

    public boolean checkUppercaseAndDot(String str) {
        return str.matches("^[A-Z]{1}.+\\.$");
    }

    public static void main(String[] args) {
        Exer7 exer7 = new Exer7();
        System.out.println("A miala na sobie : " + exer7.checkUppercaseAndDot("A miala na sobie."));
        System.out.println("ale jednak nie : " + exer7.checkUppercaseAndDot("ale jednak nie"));
        System.out.println("Ala dziobała. : " + exer7.checkUppercaseAndDot("Ala dziobała."));
    }
}
