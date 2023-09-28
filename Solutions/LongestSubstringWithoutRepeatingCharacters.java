class LongestSubstringWithoutRepeatingCharacters {
    public int characterReplacement(String s, int k) {

    int left = 0;
    int right = 0;
    int maxFreq = 0;
    int[] freq = new int[26];
    int result = 0;

    char[] chars = s.toCharArray();

    while(right < chars.length)
    {
        freq[chars[right] - 'A']++;
        maxFreq = Math.max(maxFreq, freq[chars[right] - 'A']);

        if(right - left + 1 - maxFreq > k)
        {
            freq[chars[left] - 'A']--;
            left++;
        }

        result = Math.max(result, right - left + 1);


        right++;
    }

    return result;

    }
}