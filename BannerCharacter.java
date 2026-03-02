public class BannerCharacter {

    private char character;
    private String[] pattern;

    public BannerCharacter(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public String getLine(int index) {
        return pattern[index];
    }

    public char getCharacter() {
        return character;
    }
}