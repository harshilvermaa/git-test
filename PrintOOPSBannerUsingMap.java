import java.util.HashMap;
import java.util.Map;

public class PrintOOPSBannerUsingMap {

    public static void main(String[] args) {

        Map<Character, BannerCharacter> patternMap = createPatternMap();

        renderBanner("OOPS", patternMap);
    }

    // Creates and stores all character patterns
    private static Map<Character, BannerCharacter> createPatternMap() {

        Map<Character, BannerCharacter> map = new HashMap<>();

        map.put('O', new BannerCharacter('O', new String[]{
                String.join("", "*****"),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "*****")
        }));

        map.put('P', new BannerCharacter('P', new String[]{
                String.join("", "*****"),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "*****"),
                String.join("", "*    "),
                String.join("", "*    "),
                String.join("", "*    ")
        }));

        map.put('S', new BannerCharacter('S', new String[]{
                String.join("", " *****"),
                String.join("", "*     "),
                String.join("", "*     "),
                String.join("", " *****"),
                String.join("", "     *"),
                String.join("", "     *"),
                String.join("", " *****")
        }));

        return map;
    }

    // Renders banner for any word
    private static void renderBanner(String word, Map<Character, BannerCharacter> map) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                BannerCharacter bc = map.get(ch);
                line.append(bc.getLine(row)).append("   ");
            }

            System.out.println(line.toString());
        }
    }
}