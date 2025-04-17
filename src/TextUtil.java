public class TextUtil {

    public static String generateMenu(String... choices) {
        StringBuilder menu = new StringBuilder();

        for (int i = 0; i < choices.length; i++) {
            menu.append("[").append(i + 1).append("] ").append(choices[i]).append("\n");
        }

        return menu.toString();
    }
}
