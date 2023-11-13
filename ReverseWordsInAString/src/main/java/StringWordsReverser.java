import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringWordsReverser {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int startIndex = 0;
        int endIndex = words.length - 1;
        while (startIndex < endIndex) {
            String tmp = words[startIndex];
            words[startIndex] = words[endIndex];
            words[endIndex] = tmp;
            startIndex++;
            endIndex--;
        }

        return String.join(" ", words);
    }
}
