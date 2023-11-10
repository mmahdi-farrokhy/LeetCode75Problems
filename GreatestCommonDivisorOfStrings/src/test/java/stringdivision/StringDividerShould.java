package stringdivision;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringDividerShould {

    @Test
    void find_the_greatest_divisor_in_a_string() {
        assertThat(new StringDivider("ABCABC", "ABC").findGreatestDivisor()).isEqualTo("ABC");
        assertThat(new StringDivider("ABABAB", "ABAB").findGreatestDivisor()).isEqualTo("AB");
        assertThat(new StringDivider("LEET", "CODE").findGreatestDivisor()).isEqualTo("");
    }
}
