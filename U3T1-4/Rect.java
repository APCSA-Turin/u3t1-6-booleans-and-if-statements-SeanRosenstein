public class Rect {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 6);
        Rectangle r2 = r1;
        r1 = null;
        r1.printArea();
        
    }
}
