import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello " + name);
        if (name.equals("shylock")) {
            System.out.println("Good morning");
        } else if (name.equals("murr")) {
            System.out.println("Good night");
        } else {
            System.out.println("Goodbye");
        }
    }
}
