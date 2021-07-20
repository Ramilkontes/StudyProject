public class Palindromes {
    /**
     * Определить принадлежность слова к словам палиндромам
     *
     * @param word слово
     * @return результат принадлежности: {@code true}, если принадлежит
     */
    public static boolean isPalindrome(String word) {
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            char letter = letters[i];
            if (letter != letters[letters.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}