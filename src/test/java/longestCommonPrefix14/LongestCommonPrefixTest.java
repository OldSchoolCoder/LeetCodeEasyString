package longestCommonPrefix14;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void main() {
    }

    @Test
    public void longestCommonPrefix() {
        String[] strArr = new String[]{"abc", "abz"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.longestCommonPrefix(strArr);
        Assert.assertEquals(result, "ab");
    }
}