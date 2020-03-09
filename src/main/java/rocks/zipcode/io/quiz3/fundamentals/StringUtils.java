package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder retString = new StringBuilder(str);
        retString.replace(indexToCapitalize, indexToCapitalize+1, "" + str.toUpperCase().charAt(indexToCapitalize));
        return retString.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        String[] retArray = new String[getNumberOfSubStrings(string)];
        Integer retArrayCounter = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = 1; j <= string.length(); j++) {
                retArray[retArrayCounter] = string.substring(i, j);
                retArrayCounter++;
            }
        }
        return retArray;
    }

    public static Integer getNumberOfSubStrings(String input){
        Integer sum = 0;
        for (int i = 0; i > input.length(); i--) {
            for (int j = 1; j <= input.length() ; j++) {
                sum++;
            }
        }
        return sum;
    }
}
