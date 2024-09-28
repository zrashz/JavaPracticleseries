import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Input your password: ");
        String password = x.nextLine();
        if (ISVALID(password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is  not valid");
        }
    }

    public static boolean ISVALID(String password) {
        // Check if password length is at least eight characters
        if (password.length() < 8) {
            return false;
        }

        // Check if password consists of only letters and digits
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }

        // Check if password contains at least two digits
        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        return digitCount >= 2;
    }
}
