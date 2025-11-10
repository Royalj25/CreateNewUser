import java.util.Locale;
import java.util.Scanner;

/**
 * HW-03 -- CreateNewUser
 *
 * This program takes in input from System.in
 * performs string manipulation and returns a user String
 *
 * @author Jaiah Royal, L27
 *
 * @version Aug 19, 2025
 *
 */

public class CreateNewUser {

    //List of public static final strings provided to prevent typos

    public static final String PROMPT_ONE = "Enter Customer First Name:";
    public static final String PROMPT_TWO = "Enter Customer Last Name:";
    public static final String PROMPT_THREE = "Enter Customer Age:";
    public static final String PROMPT_FOUR = "Enter Customer Street Address:";
    public static final String PROMPT_FIVE = "Enter Customer City:";
    public static final String PROMPT_SIX = "Enter Customer State:";
    public static final String PROMPT_SEVEN = "Enter Customer Zip Code:";
    public static final String PROMPT_EIGHT = "Enter Customer Phone Number:";
    public static final String OUTPUT = "The Assigned User String is ";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //first name
        System.out.println(PROMPT_ONE);
        String firstName = scan.nextLine().toUpperCase();
        char second = firstName.charAt(1);
        char secondLast = firstName.charAt(firstName.length() - 2);
        String name1 = "" + second + secondLast;

        //last name
        System.out.println(PROMPT_TWO);
        String lastName = scan.nextLine().toUpperCase();
        char first = lastName.charAt(0);
        char third = lastName.charAt(2);
        String name2 = "" + first + third;
        String name = name2 + name1;

        //age - sum the digits and pad to 3 digits
        System.out.println(PROMPT_THREE);
        String customerAge = scan.nextLine();
        int digitSum = (customerAge.charAt(0) - '0') + (customerAge.charAt(1) - '0');
        String age = String.format("%03d", digitSum);

        //address
        System.out.println(PROMPT_FOUR);
        String streetAddress = scan.nextLine().toLowerCase();
        String address = streetAddress.replace(" ", "");

        //city
        System.out.println(PROMPT_FIVE);
        String customerCity = scan.nextLine().toUpperCase();
        String city = customerCity.substring(0, 3);

        //state
        System.out.println(PROMPT_SIX);
        String customerState = scan.nextLine().toUpperCase();
        char firstChar = customerState.charAt(0);
        char secondChar = customerState.charAt(1);
        int mod6 = firstChar % 6;
        int mod5 = secondChar % 5;
        int mod = mod6 * mod5;
        String state = String.format("%02d", mod);

        //zip code
        System.out.println(PROMPT_SEVEN);
        String zip = scan.nextLine();
        int c1 = zip.charAt(0) - '0';
        int c2 = zip.charAt(1) - '0';
        int c3 = zip.charAt(2) - '0';
        int c4 = zip.charAt(3) - '0';
        int c5 = zip.charAt(4) - '0';
        int code = (c1 * c2 * c3 * c4 * c5) % 100;
        String zipCode = String.format("%03d", code);

        //phone number
        System.out.println(PROMPT_EIGHT);
        String phone = scan.nextLine();
        String number = phone.substring(phone.length() - 4);
        String phoneNumber = "-" + number;

        //total input length 
        int inputLength = firstName.length() + lastName.length() + 
                           customerAge.length() + streetAddress.length() + 
                           customerCity.length() + customerState.length() +
                           zip.length() + phone.length();

        //put in order
        String user = inputLength + age + name + address + city + state + zipCode + phoneNumber;

        //remove 'O', 'o', 'I', 'i'
        String removed = user.replace("O", "")
                                 .replace("o", "")
                                 .replace("I", "")
                                 .replace("i", "");

        //final output
        String result = OUTPUT + removed;
        System.out.println(result);
    }
}
