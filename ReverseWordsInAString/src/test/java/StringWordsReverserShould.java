import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringWordsReverserShould {
    private StringWordsReverser stringWordsReverser;

    @BeforeEach
    void setUp() {
        stringWordsReverser = new StringWordsReverser();
    }

    @Test
    void reverse_words_in_a_string_separated_by_only_one_space() {
        assertThat(stringWordsReverser.reverseWords("  the sky is   blue ")).isEqualTo("blue is sky the");
        assertThat(stringWordsReverser.reverseWords("  hello world  ")).isEqualTo("world hello");
        assertThat(stringWordsReverser.reverseWords("a good   example")).isEqualTo("example good a");

    }

    @Test
    void wrong_test() {
        assertThat(stringWordsReverser.reverseWords("  Bob    Loves  Alice   ")).isEqualTo("Alice Loves Bob");
    }
}
