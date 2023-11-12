import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VowelReverser {
    private List<Character> vowels = Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'});

    public String reverseVowels(String s) {
        String result = "";
        char[] letters = s.toCharArray();
        int leftIndex = 0;
        int rightIndex = s.length() - 1;
        String vowels = "aeiouAEIOU";
        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex && vowels.indexOf(letters[leftIndex]) == -1)
                leftIndex++;

            while (leftIndex < rightIndex && vowels.indexOf(letters[rightIndex]) == -1)
                rightIndex--;

            char tmp = letters[leftIndex];
            letters[leftIndex] = letters[rightIndex];
            letters[rightIndex] = tmp;

            leftIndex++;
            rightIndex--;
        }

        return new String(letters);
    }
}
