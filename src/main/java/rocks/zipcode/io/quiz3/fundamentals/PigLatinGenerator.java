package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    public String translate(String str) {
        StringBuilder retString = new StringBuilder();
        String[] arrayString = str.split(" ");
        if(arrayString.length > 1) {
            for (String i : arrayString) {
                if (VowelUtils.hasVowels(i)) {
                    if (!VowelUtils.isVowel(i.charAt(0))) {
                        retString.append(i, VowelUtils.getIndexOfFirstVowel(i), i.length());
                        retString.append(i, 0, VowelUtils.getIndexOfFirstVowel(i));
                        retString.append("ay ");
                    } else {
                        retString.append(i).append("way ");
                    }
                } else {
                    retString.append(i).append("ay ");
                }
            }
            retString.replace(retString.lastIndexOf(" "), retString.lastIndexOf(" ")+1, "");
        }else {
            for (String i : arrayString) {
                if (VowelUtils.hasVowels(i)) {
                    if (!VowelUtils.isVowel(i.charAt(0))) {
                        retString.append(i, VowelUtils.getIndexOfFirstVowel(i), i.length());
                        retString.append(i, 0, VowelUtils.getIndexOfFirstVowel(i));
                        retString.append("ay");
                    } else {
                        retString.append(i).append("way");
                    }
                } else {
                    retString.append(i).append("ay");
                }
            }
        }
        return retString.toString();
    }
}
