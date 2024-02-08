public class List {
    
    private final int value;
    private final List tail;
    
    public List(final int value, final List tail) {
        this.value = value;
        this.tail = tail;
    }
    
    public int sum() {
        if (tail == null) {
            return this.value;
        } else {
            return this.value + this.tail.sum();
        }
    }
    
    public List greaterThan(int threshold) {
        if (this.value < threshold) {
            if (this.tail.tail != null) {
                List s = new List(this.tail.value, this.tail.greaterThan(threshold));
                return s;
            } else {
                List s = new List(this.tail.value, null);
                return s;
            }
        } else {
            List s = new List(this.value, this.tail.greaterThan(threshold));
            return s;
        }
    }
    
    
    public void print() {
        if (this.tail == null) {
            System.out.println(this.value);
        } else {
            System.out.println(this.value);
            this.tail.print();
        }
    }
    int i = 0;
    public int length() {
        if (this.tail == null) {
            i++;
            return i;
        } else {
            i++;
            this.tail.length();
        }
        return i;
    }
    
    public static void main(String[] args) {
        List l0 = new List(1, null);
        List l1 = new List(6, l0);
        List l2 = new List(3, l1);
        List l3 = new List(2, l2);
        List l4 = new List(2, l3);
        
        List hold = l4.greaterThan(2);
        
        hold.print();
    }
    
    
}