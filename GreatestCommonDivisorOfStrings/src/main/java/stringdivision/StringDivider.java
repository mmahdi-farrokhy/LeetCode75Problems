package stringdivision;

public class StringDivider {
    private String str1;
    private String str2;

    public StringDivider(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public String findGreatestDivisor() {
        String min = str1.length() > str2.length() ? str2 : str1;
        String max = str1.length() > str2.length() ? str1 : str2;
        String greatestDivisor = "";

        for (int i = min.length(); i > 0; i--) {
            String temp = min.substring(0, i);
            if (isDivisor(temp, max) && isDivisor(temp, min)) {
                greatestDivisor = temp;
                break;
            }
        }

        return greatestDivisor;
    }

    private boolean isDivisor(String div, String string) {
        if (div.isEmpty())
            return false;

        for (int i = 0; i < string.length(); i += div.length())
            if (!string.substring(i, Math.min(i + div.length(), string.length())).equals(div))
                return false;

        return true;
    }
}
