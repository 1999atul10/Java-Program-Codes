//8.2 Implementing constructor.
class rectangle {
    int length, width;

    Rectangle(int x,int y)
    {
        length=x;
        breadth=y;
    }

    int rectarea() {
        return (length * breadth);
    }
}

public class rectangle_cons {
    public static void main(String args[]) {
        rectangle r1 = new rectangle(15, 10);
        int area1 = r1.rectarea();
        System.out.println("Area1=" + area1);

    }

}
