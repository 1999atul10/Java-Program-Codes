//8.3 implementing default constructor and parametrized constructor.
class perimeter {
    int length;
    int breadth;

    // default constructor
    perimeter() {
        length = 0;
        breadth = 0;
    }

    // parametrized constructor
    perimeter(int x, int y) {
        length = x;
        breadth = y;
    }

    void cal_perimeter() {
        int peri;
        peri = 2 * (length + breadth);
        System.out.println("\nThe perimeter of the rectangle is=" + peri);
    }
}

class default_const {
    public static void main(String[] args) {
        perimeter p1 = new perimeter();
        perimeter p2 = new perimeter(5, 10);
        p1.cal_perimeter();
        p2.cal_perimeter();
    }
}