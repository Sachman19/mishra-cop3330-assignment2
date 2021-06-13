package ex24;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static ex24.app.isAnagram;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test if anagrams are recognized")
class anagramTest {

    @Test
    void testAnagram() {
        assertTrue(isAnagram("Anagram", "Nagaram"));
        assertTrue(isAnagram("Tone", "Note"));
    }
}