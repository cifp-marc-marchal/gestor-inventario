public class Helpers {
    public static String normalize(String text) {
        return text.replaceAll("\\s+", "").toLowerCase().substring(0, 1).toUpperCase() + text.substring(1);
    }
}
