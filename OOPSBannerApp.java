public class OOPSBannerApp {

    /**
     * Inner static class to store character and its pattern
     */
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Create and initialize character patterns
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        CharacterPatternMap SPACE = new CharacterPatternMap(' ', new String[]{
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        });

        return new CharacterPatternMap[]{O, P, S, SPACE};
    }

    /**
     * Get pattern for a given character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return new String[]{
                "     ", "     ", "     ",
                "     ", "     ", "     ", "     "
        };
    }

    /**
     * Print message as banner
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        StringBuilder[] output = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            output[i] = new StringBuilder();
        }

        for (char ch : message.toCharArray()) {
            String[] pattern = getCharacterPattern(ch, charMaps);

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

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}