// implementing the concept of method overloading.
class room {
    float length;
    float breadth;

    room(float x, float y) {
        length = x;
        breadth = y;
    }

    room(float x) {
        length = breadth = x;
    }
}

public class method_overloading {
    public static void main(String[] args) {
        room r1 = new room(10, 20);
        float area = r1.length * r1.breadth;
        System.out.println("The area of the double parametrized constructor is=" + area);
        room r2 = new room(10);
        float areaa = r2.length * r2.breadth;
        System.out.println("The area of the single parametrized constructor is=" + areaa);

    }

}
