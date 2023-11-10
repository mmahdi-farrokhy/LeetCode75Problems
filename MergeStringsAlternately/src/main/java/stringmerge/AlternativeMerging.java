package stringmerge;

public class AlternativeMerging {
    private String word1;
    private String word2;

    public AlternativeMerging(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    public String merge() {
        String result = "";

        if (word1 != null && word2 != null) {
            int length1 = word1.length();
            int length2 = word2.length();
            String word1Char1 = "";
            String word2Char1 = "";
            if (length1 > 0)
                word1Char1 = String.valueOf(word1.charAt(0));

            if (length2 > 0)
                word2Char1 = String.valueOf(word2.charAt(0));

            result = word1Char1 + word2Char1;

            int maxLength = length1 > length2 ? length1 : length2;
            for (int charIndex = 1; charIndex < maxLength; charIndex++)
                result += getAdditionalChars(charIndex);
        }

        return result;
    }

    private String getAdditionalChars(int charIndex) {
        String additionalChars = "";

        if (word1.length() > charIndex)
            additionalChars += word1.charAt(charIndex);

        if (word2.length() > charIndex)
            additionalChars += word2.charAt(charIndex);

        return additionalChars;
    }
}
