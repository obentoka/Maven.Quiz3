package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {

    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return str.substring(0, indexToCapitalize) +
                str.toUpperCase().substring(indexToCapitalize, indexToCapitalize+1) +
                str.substring(indexToCapitalize+1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        String[] retArray = new String[getNumberOfSubStrings(string)];
        List<String> sub = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                String sString = string.substring(i, j);
                if (!sub.contains(sString))
                    sub.add(sString);
            }
        }
        for (int i = 0; i < sub.size(); i++) {
            retArray[i] = sub.get(i);
        }
        return retArray;
    }

    public static Integer getNumberOfSubStrings(String input){
        return (int) Arrays.stream(getAllSubStrings(input))
                .count();
    }
}
