import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("vedite vashe imya");

        String username = myObj.nextLine();
        System.out.println("Privet" + username);

    }
}