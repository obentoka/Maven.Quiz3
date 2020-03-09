package rocks.zipcode.io.quiz3.generics;

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
        Integer occurance = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(valueToEvaluate))
                occurance++;
        }
        return occurance;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
