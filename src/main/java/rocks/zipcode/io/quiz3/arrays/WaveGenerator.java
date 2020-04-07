package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {

    public static String[] wave(String str) {
        AtomicInteger i = new AtomicInteger(0);
        List<String> stringArray = new ArrayList<>();
        str.toLowerCase().chars()
                .map(x -> (char)x)
                .forEach(x -> {
                    if(Character.isAlphabetic(x)){
                        stringArray.add(StringUtils.capitalizeNthCharacter(str.toLowerCase(), i.get()));
                    }
                    i.incrementAndGet();
                });
        return stringArray.toArray(new String[0]);
    }
}
