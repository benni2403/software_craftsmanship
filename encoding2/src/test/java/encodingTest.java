import org.junit.jupiter.api.Test;
import static org.example.Main.encode;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class encodingTest {
    @Test
    void first_test() {
        int[] testCase1 = {2};
        int[] case1Result = {2, 1};
        int[] testCase2 = {2, 2};
        int[] case2Result = {2, 2};
        int[] testCase3 = {2, 2, 2};
        int[] case3Result = {2, 3};
        int[] testCase4 = {2, 2, 2, 7};
        int[] case4Result = {2, 3, 7, 1};
        int[] testCase5 = {2, 2, 2, 7, 2};
        int[] case5Result = {2, 3, 7, 1, 2, 1};


        assertArrayEquals(encode(testCase1), case1Result);
        assertArrayEquals(encode(testCase2), case2Result);
        assertArrayEquals(encode(testCase3), case3Result);
        assertArrayEquals(encode(testCase4), case4Result);
        assertArrayEquals(encode(testCase5), case5Result);
    }
}
