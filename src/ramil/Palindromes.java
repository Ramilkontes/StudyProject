package ramil;

public class Palindromes {
    private String word;
    private boolean flag = false;
    private char[] letters;

    public Palindromes(String word) {
        this.word = word;
        this.letters = word.toCharArray();
    }

    public String definitionPolindromes()  {
        int i1 = 0;
        int i2 = letters.length - 1;
        while (i2 > i1) {
            if (letters[i1] != letters[i2]) {
                flag = false;
                return "This is false";
            }
            ++i1;
            --i2;
            flag = true;
        }
        return "This is true";
    }
}
