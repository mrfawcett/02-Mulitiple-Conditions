import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CanRideKiddieCarouselTest {
    @DisplayName("canRideKiddieCarousel Test 1")
    @Test
    void canRideKiddieCarousel_Test01 () {
        int age = 11;
        boolean sibling = false;
        boolean expected = true; // under 12, always allowed
        boolean received = ThemePark.canRideKiddieCarousel(age, sibling);
        assertEquals(expected, received);
    }

    @DisplayName("canRideKiddieCarousel Test 2")
    @Test
    void canRideKiddieCarousel_Test02 () {
        int age = 5;
        boolean sibling = false;
        boolean expected = true; // under 12
        boolean received = ThemePark.canRideKiddieCarousel(age, sibling);
        assertEquals(expected, received);
    }

    @DisplayName("canRideKiddieCarousel Test 3")
    @Test
    void canRideKiddieCarousel_Test03 () {
        int age = 0;
        boolean sibling = false;
        boolean expected = true; // even babies are "under 12"
        boolean received = ThemePark.canRideKiddieCarousel(age, sibling);
        assertEquals(expected, received);
    }

    @DisplayName("canRideKiddieCarousel Test 4")
    @Test
    void canRideKiddieCarousel_Test04 () {
        int age = 12;
        boolean sibling = true;
        boolean expected = true; // 12+ requires younger sibling
        boolean received = ThemePark.canRideKiddieCarousel(age, sibling);
        assertEquals(expected, received);
    }

    @DisplayName("canRideKiddieCarousel Test 5")
    @Test
    void canRideKiddieCarousel_Test05 () {
        int age = 12;
        boolean sibling = false;
        boolean expected = false; // 12+ without sibling not allowed
        boolean received = ThemePark.canRideKiddieCarousel(age, sibling);
        assertEquals(expected, received);
    }

    @DisplayName("canRideKiddieCarousel Test 6")
    @Test
    void canRideKiddieCarousel_Test06 () {
        int age = 15;
        boolean sibling = true;
        boolean expected = true; // older but has younger sibling
        boolean received = ThemePark.canRideKiddieCarousel(age, sibling);
        assertEquals(expected, received);
    }

    @DisplayName("canRideKiddieCarousel Test 7")
    @Test
    void canRideKiddieCarousel_Test07 () {
        int age = 15;
        boolean sibling = false;
        boolean expected = false; // older without sibling
        boolean received = ThemePark.canRideKiddieCarousel(age, sibling);
        assertEquals(expected, received);
    }

    @DisplayName("canRideKiddieCarousel Test 8")
    @Test
    void canRideKiddieCarousel_Test08 () {
        int age = 30;
        boolean sibling = true;
        boolean expected = true; // technically allowed if with younger sibling
        boolean received = ThemePark.canRideKiddieCarousel(age, sibling);
        assertEquals(expected, received);
    }

    @DisplayName("canRideKiddieCarousel Test 9")
    @Test
    void canRideKiddieCarousel_Test09 () {
        int age = 30;
        boolean sibling = false;
        boolean expected = false; // too old, no sibling
        boolean received = ThemePark.canRideKiddieCarousel(age, sibling);
        assertEquals(expected, received);
    }

    @DisplayName("canRideKiddieCarousel Test 10")
    @Test
    void canRideKiddieCarousel_Test10 () {
        int age = 12;
        boolean sibling = true;
        boolean expected = true; // checking exact boundary with sibling
        boolean received = ThemePark.canRideKiddieCarousel(age, sibling);
        assertEquals(expected, received);
    }

}
