public class PrintOOPSBannerWithClass {

    public static void main(String[] args) {

        CharacterPattern o = new CharacterPattern('O', new String[]{
                String.join("", "*****"),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "*****")
        });

        CharacterPattern p = new CharacterPattern('P', new String[]{
                String.join("", "*****"),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "*****"),
                String.join("", "*    "),
                String.join("", "*    "),
                String.join("", "*    ")
        });

        CharacterPattern s = new CharacterPattern('S', new String[]{
                String.join("", " *****"),
                String.join("", "*     "),
                String.join("", "*     "),
                String.join("", " *****"),
                String.join("", "     *"),
                String.join("", "     *"),
                String.join("", " *****")
        });

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("   ",
                    o.getLine(i),
                    o.getLine(i),
                    p.getLine(i),
                    s.getLine(i));
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}