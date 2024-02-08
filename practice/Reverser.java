public class Reverser {
    public static String reverse(final String in) {
        char hold;
        String inv = "";
        for (int i = 0; i < in.length(); i++) {
            hold = in.charAt(i);
            inv = hold + inv;
        }
        return inv;
    }
    
    
    public static String PhilipReverse(final String in) {
        int n = in.length();
        String hold = "";
        if (n == 0) {
            return hold + in.charAt(0);
        } else {
            --n;
            return hold + in.charAt(n) + PhilipReverse(in);
        }
    }
}