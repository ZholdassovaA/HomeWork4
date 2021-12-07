package lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ForGit {

    @Test
    @DisplayName("Test assertTrue")
    void assertTest() {
        // true
        Assertions.assertEquals(true, 5 > 1);
    }

    @Test
    @DisplayName("Test assertFalse")
    void assertTest2() {
        // false
        Assertions.assertEquals(false, 8 < 6);
    }
}
