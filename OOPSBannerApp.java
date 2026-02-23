/**
 * OOPSBannerApp UC5 - Banner Display Application
 * @author Developer
 * @version 5.0
 */


public class OOPSBannerApp {
    public static void main(String[] args) {

        String[][] oop = {
            String.join("   ***   ", "    ***    ", "*****   ", "*********"  ),
            String.join(" **   **  ", " **   **  ", "******  ", "*********"  ),
            String.join("**     ** ", "**     ** ", "**   ** ", "**" ),
            String.join("**     ** ", "**     ** ", "**   ** ", "*********" ),
            String.join("**     ** ", "**     ** ", "******  ", "      ***" ),
            String.join(" **   **  ", " **   **  ", "**      ", "*********" ),
            String.join("   ***    ", "   ***    ", "**      ", "*********")
        };

        for (int i = 0; i < oop.length; i++) {
            System.out.println(String.join("   ", oop[i]));
        }
    }
}
