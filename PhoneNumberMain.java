import java.util.Scanner;

class PhoneNumberFormatter {

    String maskPhoneNumber(String phone) {

        if (phone.length() != 10) {
            return "Invalid phone number";
        }

        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }

        String lastFour = phone.substring(6);

        StringBuilder result = new StringBuilder("XXXXXX");
        result.append("-");
        result.append(lastFour);

        return result.toString();
    }
}

public class PhoneNumberMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        PhoneNumberFormatter obj = new PhoneNumberFormatter();

        String result = obj.maskPhoneNumber(phone);

        System.out.println(result);

        sc.close();
    }
}