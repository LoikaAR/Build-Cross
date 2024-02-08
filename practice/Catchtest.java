public class Catchtest {
    public static void m(Object o) {
        System.out.println("A");
        try {
            System.out.println("B");
            String s = o.toString();
            System.out.println(s);
            String t = s.toString();
            System.out.println(t);
        }
        catch (NullPointerException ex) {
            System.out.println("NX");
        }
        catch (Exception ex) {
            System.out.println("X");
        }
    }
    
}