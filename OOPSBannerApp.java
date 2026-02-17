/**
 * OOPSBannerApp UC2 - Banner Display Application
 *
 * Displays the word "OOPS" in a banner format using
 * asterisks (*) and spaces via multiple print statements.
 *
 * @author Developer
 * @version 4.0
 */


public class OOPSBannerApp {
    public static void main(String[] args) {

        String[][] oop = {
            {"   ***   ", "    ***    ", "*****   ", "*********"  },
            {" **   **  ", " **   **  ", "******  ", "*********"  },
            {"**     ** ", "**     ** ", "**   ** ", "**" },
            {"**     ** ", "**     ** ", "**   ** ", "*********" },
            {"**     ** ", "**     ** ", "******  ", "      ***" },
            {" **   **  ", " **   **  ", "**      ", "*********" },
            {"   ***    ", "   ***    ", "**      ", "*********"}
        };

        for (int i = 0; i < oop.length; i++) {
            System.out.println(String.join("   ", oop[i]));
        }
    }
}
