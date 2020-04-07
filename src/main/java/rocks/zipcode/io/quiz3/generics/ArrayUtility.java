package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {

    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for (int i = 0; i < array.length; i++) {
            if(getNumberOfOccurrences(array[i]) % 2 != 0){
                return array[i];
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (int i = 0; i < array.length; i++) {
            if(getNumberOfOccurrences(array[i]) % 2 == 0){
                return array[i];
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return (int) Arrays.stream(array)
                .filter(x -> x.equals(valueToEvaluate))
                .count();
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> retArray = new ArrayList<>();
        for(SomeType i : array){
            if(predicate.apply(i))
                retArray.add(i);
        }
        SomeType[] retArr = Arrays.copyOf(array, retArray.size());
        for (int i = 0; i < retArray.size(); i++) {
            retArr[i] = retArray.get(i);
        }
        return retArr;
    }
}
