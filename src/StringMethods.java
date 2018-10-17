

public class StringMethods {

    public static void main(String[] args) {
        boolean response = abcTest ("123.abc");
        System.out.println(response);

        String alternatingStrings = alternateStrings("abc","xyzop");
        System.out.println(alternatingStrings);
    }

    public static String alternateStrings(String string, String string2) {
        String newString = "";
        int startIndex = 0;


        while (string.length()!=0 && string2.length()!=0) {
            newString = newString + string.substring(startIndex, startIndex+1);
            newString = newString + string2.substring(startIndex, startIndex+1);

            if (startIndex == string.length()-1) {
                newString = newString + string2.substring(startIndex+1, string2.length());
                return newString;
            }
            if (startIndex == string2.length()-1) {
                newString = newString + string.substring(startIndex+1, string.length());
                return newString;
            }

            startIndex++;

        }
        return newString;
    }

    public static boolean abcTest (String input) {
        int indexOfA = input.indexOf("a");

        if (input == ""){
            return false;
        }

        if (indexOfA==0){
            return true;
        }
        if ((input.substring(indexOfA-1, indexOfA).equals("."))){
            return false;
        }
        return true;
    }



}
