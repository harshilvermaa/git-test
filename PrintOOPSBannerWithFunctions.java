public class PrintOOPSBannerWithFunctions {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        String[] banner = new String[o.length];

        for (int i = 0; i < o.length; i++) {
            banner[i] = String.join("   ", o[i], o[i], p[i], s[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Builds letter O (7 lines, 9-char width)
    private static String[] buildO() {
        return new String[]{
            String.join("", "*****"),
            String.join("", "*   *"),
            String.join("", "*   *"),
            String.join("", "*   *"),
            String.join("", "*   *"),
            String.join("", "*   *"),
            String.join("", "*****")
        };
    }

    // Builds letter P (7 lines, 9-char width)
    private static String[] buildP() {
        return new String[]{
            String.join("", "*****"),
            String.join("", "*   *"),
            String.join("", "*   *"),
            String.join("", "*****"),
            String.join("", "*    "),
            String.join("", "*    "),
            String.join("", "*    ")
        };
    }

    // Builds letter S (7 lines, 9-char width)
    private static String[] buildS() {
        return new String[]{
            String.join("", " *****"),
            String.join("", "*     "),
            String.join("", "*     "),
            String.join("", " *****"),
            String.join("", "     *"),
            String.join("", "     *"),
            String.join("", " *****")
        };
    }
}