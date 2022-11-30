public class ExternalClass {

    public int x = 50;
    public int y = 60;

    class InternalClass {

        public int z = 10;

        void internalClassMethod(int z) {
            System.out.println("x = " + z);
            System.out.println("this.z = " + this.z);
            System.out.println("InternalClass.this.x = " + ExternalClass.this.x);
            System.out.println("InternalClass.this.y = " + ExternalClass.this.y);
        }
    }

    public static void main(String[] args) {
        ExternalClass a = new ExternalClass();
        ExternalClass.InternalClass fl = a.new InternalClass();
        fl.internalClassMethod(23);
    }
}
