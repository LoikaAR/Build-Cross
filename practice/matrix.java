public class matrix {
    
    private static int[][] a = new int[3][];
    
    public static int[][] build() {
        int[][] a = new int[3][];
        for(int i = 0; i<a.length; i++) {
            a[i] = new int[i];
        }
        return a;
    }
    
    public static void main(String[] args){
        System.out.println(a.length);
    }
}