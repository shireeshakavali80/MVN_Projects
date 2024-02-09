package practiceTest;
import org.junit.Test;
import practice.Palindrome;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PalindromeTest {

    @Test
    public void testPalindrome() {
        Palindrome PalindromeChecker = null;
        assertTrue(Palindrome.isPalindrome(121));
        assertTrue(Palindrome.isPalindrome(1221));
        assertTrue(Palindrome.isPalindrome(12321));
        assertFalse(Palindrome.isPalindrome(12345));
        assertFalse(Palindrome.isPalindrome(9876));
    }
}
