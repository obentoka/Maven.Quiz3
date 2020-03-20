package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {

    public static String[] wave(String str) {
        String low = str.toLowerCase();
        List<String> stringArray = new ArrayList<>();
        for (int i = 0; i < low.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))){
                String waveString = StringUtils.capitalizeNthCharacter(low, i);
                stringArray.add(waveString);
            }
        }
        String[] retArray = new String[stringArray.size()];
        for (int i = 0; i < stringArray.size(); i++) {
            retArray[i] = stringArray.get(i);
        }
        return retArray;
    }
}
