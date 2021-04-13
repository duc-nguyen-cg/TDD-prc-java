
/* Content:
    If an integer is divisible by 3 or contains number 3, print "Fizz"
    If an integer is divisible by 5 or contains number 5, print "Buzz"
    If an integer satisfies 2 of 4 above criteria, print "FizzBuzz"
    else read the integer if it lies between 0 and 100
*/
public class FizzBuzzTranslate {
    static final int MAX_COUNT = 100;
    static final int MIN_COUNT = 0;
    static final String FIZZ_MESSAGE = "Fizz";
    static final String BUZZ_MESSAGE = "Buzz";
    static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    static final String[] WORDS = {"muoi", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin" };

    public static boolean checkChar(int number, char digit){
        boolean checkChar = false;
        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == digit){
                checkChar = true;
            }
        }
        return checkChar;
    }

    public static String convertDigitToWord(char digit){
        String result = "";
        for (int i = 0; i < DIGITS.length; i++){
            if (DIGITS[i] == digit) {
                result = WORDS[i];
            }
        }
        return result;
    }

    public static String convertNumberToString(int number){
        String message = "";
        String str = Integer.toString(number);
        if (number > MIN_COUNT & number < MAX_COUNT){
            for (int i = 0; i < str.length(); i++){
                message += convertDigitToWord(str.charAt(i)) + " ";
            }
        }
        return message.trim();
    }


    public static String translate( int number){
        String message = "";

        boolean isDivisibleBy3 = number%3 == 0;
        boolean isDivisibleBy5 = number%5 == 0;
        boolean isDivisibleBy3And5 = isDivisibleBy3 & isDivisibleBy5;

        boolean contain3 = checkChar(number, '3');
        boolean contain5 = checkChar(number, '5');
        boolean contain3And5 = contain3 & contain5;

        if (contain3And5 || isDivisibleBy3And5 || (contain3 & isDivisibleBy5) || (contain5 & isDivisibleBy3)){
            message = FIZZ_MESSAGE + BUZZ_MESSAGE;
        } else {
            if (contain3 || isDivisibleBy3){
                message = FIZZ_MESSAGE;
            } else if (contain5 || isDivisibleBy5){
                message = BUZZ_MESSAGE;
            } else {
                message = convertNumberToString(number);
            }
        }
        return message;
    }
}
