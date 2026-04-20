import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    /**
     * Creates and returns a map of character patterns
     */
    public static Map<Character, String[]> createCharacterPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        map.put(' ', new String[]{
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        });

        return map;
    }

    /**
     * Retrieves pattern from map
     */
    public static String[] getCharacterPattern(char ch, Map<Character, String[]> map) {
        return map.getOrDefault(ch, map.get(' '));
    }

    /**
     * Prints banner message
     */
    public static void printMessage(String message, Map<Character, String[]> map) {

        StringBuilder[] output = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            output[i] = new StringBuilder();
        }

        for (char ch : message.toCharArray()) {
            String[] pattern = getCharacterPattern(ch, map);

            for (int i = 0; i < 7; i++) {
                output[i].append(pattern[i]).append("  ");
            }
        }

        for (StringBuilder line : output) {
            System.out.println(line);
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createCharacterPatternMap();

        String message = "OOPS";

        printMessage(message, patternMap);
    }
}