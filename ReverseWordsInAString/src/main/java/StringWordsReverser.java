import java.util.Arrays;
import java.util.stream.Collectors;

public class StringWordsReverser {
    public String reverseWords(String s) {
        s = s.trim();
        while (true) {
            if (s.indexOf("  ") != -1)
                s = s.replaceAll("  ", " ");
            else
                break;
        }

        String[] words = s.split(" ");
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
