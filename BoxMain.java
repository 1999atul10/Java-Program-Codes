class Box {
    private double width;
    private double height;
    private double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(Box ob) {

        super(ob);
    }
}

public class BoxMain {
    public static void main(String args[]) {
        Box mybox1 = new Box(10, 20, 30);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
    }
}	
