import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.example.RomanNumerals.intToRoman;

public class testRomanNumerals {
    @Test
    void TestCase1()
    {
        int number = 1;
        String expectedRoman = "I";

        Assertions.assertEquals(expectedRoman, intToRoman(number));
    }
    @Test
    void TestCase2()
    {
        int number = 2;
        String expectedRoman = "II";

        Assertions.assertEquals(expectedRoman, intToRoman(number));
    }
    @Test
    void TestCase3()
    {
        int number = 3;
        String expectedRoman = "III";

        Assertions.assertEquals(expectedRoman, intToRoman(number));
    }
    @Test
    void TestCase4to8()
    {
        String[] romanNumerals = {"", "", "", "", "IV", "V", "VI", "VII", "VIII"};

        for (int i = 4; i <= 8; i++)
        {
            Assertions.assertEquals(romanNumerals[i], intToRoman(i));
        }
    }
}
