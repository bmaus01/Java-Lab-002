/**
 *
 * @author Trevor Hartman
 * @author Bryan Maus
 *
 * @since Version 1.0
 *
 */
import java.text.NumberFormat;

public class PricelessScript {
    /**
     * Proof that MasterCard marketing is in your DNA
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // String variables, some with format specifiers
        String scriptTemplateLine1 = "%d tickets: %s";
        String scriptTemplateLine2 = "%d hotdogs, %d popcorn, %d sodas: %s";
        String scriptTemplateLine3 = "2 autographed baseball %s";
        String scriptTemplateLine4 = "watching the Giants win: %s";
        String priceless = "priceless";

        // integer variable
        int people = 3;
        // 32 bit floating point variable
        float ticketPrice = 14.0f;  // 32 Bit, but it does exist!
        // double precision floating point variable
        double itemPrice = 9.0;    // Double precision
        // boolean variable
        boolean trueOrFalse = false;

        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.println(
                String.format(scriptTemplateLine1, people,
                        formatter.format(people * ticketPrice)));

        // Example of using printf and platform specific line separator "%n" to
        // format instead of String.format
        System.out.printf((scriptTemplateLine2) + "%n", people, people, people,
                formatter.format(people * itemPrice));

        itemPrice = 45.0;
        System.out.println(
                String.format(scriptTemplateLine3, formatter.format(itemPrice * 2)));

        System.out.println(
                String.format(scriptTemplateLine4, priceless));

        System.out.println(trueOrFalse);
        String Test = "%nThis string shows how to use a floating point with only two digits after the decimal for money: $%.2f instead of the normal %s";
        String one= "six zeros!";
        double numberofTimes = 3;
        System.out.println(String.format(Test, numberofTimes, one));
    }
}
