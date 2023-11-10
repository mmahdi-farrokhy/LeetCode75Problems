package stringmerge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlternativeMergingShould {
    @Test
    void merge_2_null_words() {
        Assertions.assertThat(new AlternativeMerging(null, null).merge()).isEqualTo("");
    }

    @Test
    void merge_2_words_with_length_0() {
        Assertions.assertThat(new AlternativeMerging("", "").merge()).isEqualTo("");
    }

    @Test
    void merge_2_words_with_equal_length() {
        Assertions.assertThat(new AlternativeMerging("a", "p").merge()).isEqualTo("ap");
        Assertions.assertThat(new AlternativeMerging("ab", "pq").merge()).isEqualTo("apbq");
        Assertions.assertThat(new AlternativeMerging("abc", "pqr").merge()).isEqualTo("apbqcr");
        Assertions.assertThat(new AlternativeMerging("abcd", "pqrs").merge()).isEqualTo("apbqcrds");
    }

    @Test
    void merge_2_words_first_with_longer_length() {
        Assertions.assertThat(new AlternativeMerging("ab", "p").merge()).isEqualTo("apb");
        Assertions.assertThat(new AlternativeMerging("abc", "p").merge()).isEqualTo("apbc");
    }

    @Test
    void merge_2_words_first_with_shorter_length() {
        Assertions.assertThat(new AlternativeMerging("a", "pq").merge()).isEqualTo("apq");
        Assertions.assertThat(new AlternativeMerging("a", "pqr").merge()).isEqualTo("apqr");
    }

    @Test
    void merge_2_words_first_with_length_0() {
        Assertions.assertThat(new AlternativeMerging("", "p").merge()).isEqualTo("p");
        Assertions.assertThat(new AlternativeMerging("", "pq").merge()).isEqualTo("pq");
        Assertions.assertThat(new AlternativeMerging("", "pqr").merge()).isEqualTo("pqr");
    }

    @Test
    void merge_2_words_second_one_with_length_0() {
        Assertions.assertThat(new AlternativeMerging("a", "").merge()).isEqualTo("a");
        Assertions.assertThat(new AlternativeMerging("ab", "").merge()).isEqualTo("ab");
        Assertions.assertThat(new AlternativeMerging("abc", "").merge()).isEqualTo("abc");
    }
}
