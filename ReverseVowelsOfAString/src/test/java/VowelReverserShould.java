import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class VowelReverserShould {
    @Test
    void reverse_the_vowels_in_a_string() {
        VowelReverser vowelReverser = new VowelReverser();
        Assertions.assertThat(vowelReverser.reverseVowels("hello")).isEqualTo("holle");
        Assertions.assertThat(vowelReverser.reverseVowels("leetcode")).isEqualTo("leotcede");
        Assertions.assertThat(vowelReverser.reverseVowels("target")).isEqualTo("tergat");
        Assertions.assertThat(vowelReverser.reverseVowels("java")).isEqualTo("java");
        Assertions.assertThat(vowelReverser.reverseVowels("IntelliJ Idea")).isEqualTo("antellIJ ideI");
    }
}
