import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class CanRideFamilyRiverTest {
    @DisplayName("canRideFamilyRiver Test 1")
    @Test
    void canRideFamilyRiver_Test01 () {
        int age = 8;
        double height = 40;
        boolean parent = false;
        boolean expected = true; // exactly at boundary
        boolean received = ThemePark.canRideFamilyRiver(age, height, parent);
        assertEquals(expected, received);
    }

    @DisplayName("canRideFamilyRiver Test 2")
    @Test
    void canRideFamilyRiver_Test02 () {
        int age = 10;
        double height = 45;
        boolean parent = false;
        boolean expected = true; // clearly qualifies
        boolean received = ThemePark.canRideFamilyRiver(age, height, parent);
        assertEquals(expected, received);
    }

    @DisplayName("canRideFamilyRiver Test 3")
    @Test
    void canRideFamilyRiver_Test03 () {
        int age = 8;
        double height = 39;
        boolean parent = false;
        boolean expected = false; // fails height requirement
        boolean received = ThemePark.canRideFamilyRiver(age, height, parent);
        assertEquals(expected, received);
    }

    @DisplayName("canRideFamilyRiver Test 4")
    @Test
    void canRideFamilyRiver_Test04 () {
        int age = 7;
        double height = 42;
        boolean parent = true;
        boolean expected = true; // under 8, but has parent
        boolean received = ThemePark.canRideFamilyRiver(age, height, parent);
        assertEquals(expected, received);
    }

    @DisplayName("canRideFamilyRiver Test 5")
    @Test
    void canRideFamilyRiver_Test05 () {
        int age = 7;
        double height = 39;
        boolean parent = true;
        boolean expected = true; // parent overrides age/height rules
        boolean received = ThemePark.canRideFamilyRiver(age, height, parent);
        assertEquals(expected, received);
    }

    @DisplayName("canRideFamilyRiver Test 6")
    @Test
    void canRideFamilyRiver_Test06 () {
        int age = 7;
        double height = 42;
        boolean parent = false;
        boolean expected = false; // under 8, no parent
        boolean received = ThemePark.canRideFamilyRiver(age, height, parent);
        assertEquals(expected, received);
    }

    @DisplayName("canRideFamilyRiver Test 7")
    @Test
    void canRideFamilyRiver_Test07 () {
        int age = 12;
        double height = 39;
        boolean parent = false;
        boolean expected = false; // meets age but fails height
        boolean received = ThemePark.canRideFamilyRiver(age, height, parent);
        assertEquals(expected, received);
    }

    @DisplayName("canRideFamilyRiver Test 8")
    @Test
    void canRideFamilyRiver_Test08 () {
        int age = 5;
        double height = 30;
        boolean parent = true;
        boolean expected = true; // very young, but with parent
        boolean received = ThemePark.canRideFamilyRiver(age, height, parent);
        assertEquals(expected, received);
    }

    @DisplayName("canRideFamilyRiver Test 9")
    @Test
    void canRideFamilyRiver_Test09 () {
        int age = 5;
        double height = 30;
        boolean parent = false;
        boolean expected = false; // very young, no parent
        boolean received = ThemePark.canRideFamilyRiver(age, height, parent);
        assertEquals(expected, received);
    }

    @DisplayName("canRideFamilyRiver Test 10")
    @Test
    void canRideFamilyRiver_Test10 () {
        int age = 20;
        double height = 70;
        boolean parent = false;
        boolean expected = true; // adult, easily qualifies
        boolean received = ThemePark.canRideFamilyRiver(age, height, parent);
        assertEquals(expected, received);
    }
}
