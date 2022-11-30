//program 8.1 Implenting class and object.
class rectangle {
    int length, breadth;

    void getdata(int x, int y) {
        length = x;
        breadth = y;

    }

    class RectArea {
        public static void main(String args[]) {
            rectangle r1 = new rectangle();
            r1.getdata(10, 20);
            int area = r1.length * r1.breadth;
            System.out.println("The area of the rectangle is=" + area);
            rectangle r2 = new rectangle();
            r2.length = 15;
            r2.breadth = 15;
            int area2 = r2.length * r2.breadth;
            System.out.println("the area of the second object is=" + area2);

        }
    }
}