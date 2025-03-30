package Practice;

public class PracticeFourConversion {
    public static int sumOfNumbersInString(String str) {
        int sum = 0;
        String temp = "";
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                /*
                 * Add the digit in to temp if there is a digit in the string */
                temp += ch;
            } else {
                /*
                 * if there is no digit in the string then
                 * convert the string of number in to number
                 * and make temp null again to go for the next character*/
                if (!temp.isEmpty()) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        /*
         * if string has number at the end of it then we need to convert
         * the String in to number and then add these number*/
        if (!temp.isEmpty()) {
            sum += Integer.parseInt(temp);
        }
        return sum;
    }
    /*
    * For input "abc12xyz34pqr56":

Character	temp	sum	       Action
'a'          ""	    0	Non-digit, ignore
'b'	         ""	    0	Non-digit, ignore
'c'		     ""	    0	Non-digit, ignore
'1'		     "1"	0	Digit, start accumulating
'2'		     "12"	0	Digit, continue accumulating
'x'		     ""	    12	Non-digit, add 12 to sum
'y'		     ""	    12	Non-digit, ignore
'z'		     ""	    12	Non-digit, ignore
'3'		     "3"	12	Digit, start accumulating
'4'		     "34"	12	Digit, continue accumulating
'p'		     ""	    46	Non-digit, add 34 to sum
'q'		     ""	    46	Non-digit, ignore
'r'		     ""	    46	Non-digit, ignore
'5'		     "5"	46	Digit, start accumulating
'6'		     "56"	46	Digit, continue accumulating
At the end of the loop, temp still holds "56", so it gets added to sum.*/

    public static void main(String[] args) {
        String input = "abc12xyz34pqr56";
        int output = sumOfNumbersInString(input);
        System.out.println(output);
    }
}
