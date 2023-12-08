package org.examples.ransomNote;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.examples.ransomNote.RansomNote.canConstruct;

class RansomNoteTest {

    @ParameterizedTest
    @CsvSource(value = {
            "a, b, false",
            "aa, ab, false",
            "aa, aab, true"
    })
    void canConstructTest(String ransomNote, String magazine, boolean canConstruct) {
        assertThat(canConstruct(ransomNote, magazine)).isEqualTo(canConstruct);
    }
}