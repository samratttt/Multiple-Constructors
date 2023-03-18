public class Area {

    // making constructor : rectangle
    double length;
    double breadth;
    double area;
    public Area(int l, int b) {
        length = l;
        breadth = b;
        area = length * breadth;
    }

    // making second constructor : square

    public Area(int l) {
        length = l;
        area = length * length;
    }

    public static void main(String[] args) {
        Area rectangle = new Area(4, 3);
        System.out.println(rectangle.area);
        Area square = new Area(4);
        System.out.println(square.area);
    }
}
