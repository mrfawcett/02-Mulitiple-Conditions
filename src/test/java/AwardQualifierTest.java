import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class AwardQualifierTest {
    @DisplayName("awardQualifier Test 1")
    @Test
    void awardQualifier_Test01 () {
        double gpa = 4.0;
        int tardies = 2;
        int detentions = 0;
        String expects = "Honor Roll"; // GPA ≥ 3.5, no detentions, fewer than 3 tardies
        String received = HonorRoll.awardQualifier(gpa, tardies, detentions);
        assertEquals(expects.trim().toLowerCase(), received.trim().toLowerCase());
    }

    @DisplayName("awardQualifier Test 2")
    @Test
    void awardQualifier_Test02 () {
        double gpa = 3.6;
        int tardies = 3;
        int detentions = 0;
        String expects = "Merit List"; // GPA ≥ 3.5, no detentions, but tardies not < 3
        String received = HonorRoll.awardQualifier(gpa, tardies, detentions);
        assertEquals(expects.trim().toLowerCase(), received.trim().toLowerCase());
    }

    @DisplayName("awardQualifier Test 3")
    @Test
    void awardQualifier_Test03 () {
        double gpa = 3.5;
        int tardies = 1;
        int detentions = 1;
        String expects = "No List"; // GPA ≥ 3.5, but has detention → disqualified
        String received = HonorRoll.awardQualifier(gpa, tardies, detentions);
        assertEquals(expects.trim().toLowerCase(), received.trim().toLowerCase());
    }

    @DisplayName("awardQualifier Test 4")
    @Test
    void awardQualifier_Test04 () {
        double gpa = 3.4;
        int tardies = 0;
        int detentions = 1;
        String expects = "Merit List"; // GPA in (2.5,3.5), detentions < 2
        String received = HonorRoll.awardQualifier(gpa, tardies, detentions);
        assertEquals(expects.trim().toLowerCase(), received.trim().toLowerCase());
    }

    @DisplayName("awardQualifier Test 5")
    @Test
    void awardQualifier_Test05 () {
        double gpa = 3.4;
        int tardies = 2;
        int detentions = 2;
        String expects = "No List"; // GPA in range, but detentions ≥ 2
        String received = HonorRoll.awardQualifier(gpa, tardies, detentions);
        assertEquals(expects.trim().toLowerCase(), received.trim().toLowerCase());
    }

    @DisplayName("awardQualifier Test 6")
    @Test
    void awardQualifier_Test06 () {
        double gpa = 2.6;
        int tardies = 5;
        int detentions = 0;
        String expects = "Merit List"; // GPA in (2.5,3.5), detentions < 2
        String received = HonorRoll.awardQualifier(gpa, tardies, detentions);
        assertEquals(expects.trim().toLowerCase(), received.trim().toLowerCase());
    }

    @DisplayName("awardQualifier Test 7")
    @Test
    void awardQualifier_Test07 () {
        double gpa = 2.6;
        int tardies = 1;
        int detentions = 2;
        String expects = "No List"; // GPA in range, but detentions ≥ 2
        String received = HonorRoll.awardQualifier(gpa, tardies, detentions);
        assertEquals(expects.trim().toLowerCase(), received.trim().toLowerCase());
    }

    @DisplayName("awardQualifier Test 8")
    @Test
    void awardQualifier_Test08 () {
        double gpa = 2.49;
        int tardies = 0;
        int detentions = 0;
        String expects = "No List"; // GPA = 2.49 (boundary not included for Merit List)
        String received = HonorRoll.awardQualifier(gpa, tardies, detentions);
        assertEquals(expects.trim().toLowerCase(), received.trim().toLowerCase());
    }

    @DisplayName("awardQualifier Test 9")
    @Test
    void awardQualifier_Test09 () {
        double gpa = 0.0;
        int tardies = 10;
        int detentions = 5;
        String expects = "No List"; // Very low GPA → automatically No List
        String received = HonorRoll.awardQualifier(gpa, tardies, detentions);
        assertEquals(expects.trim().toLowerCase(), received.trim().toLowerCase());
    }

    @DisplayName("awardQualifier Test 10")
    @Test
    void awardQualifier_Test10 () {
        double gpa = 3.9;
        int tardies = 0;
        int detentions = 0;
        String expects = "Honor Roll"; // Best case: GPA high, no detentions, no tardies
        String received = HonorRoll.awardQualifier(gpa, tardies, detentions);
        assertEquals(expects.trim().toLowerCase(), received.trim().toLowerCase());
    }

}
