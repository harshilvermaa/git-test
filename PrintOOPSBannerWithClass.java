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

        for (int i = 0; i < 7; i++) {
            System.out.println(String.join("   ",
                    o.getLine(i),
                    o.getLine(i),
                    p.getLine(i),
                    s.getLine(i)));
        }
    }
}