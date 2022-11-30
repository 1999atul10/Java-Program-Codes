public class ThreadingTable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 2; i <= 10; i++) {
                    System.out.println(i + " * 2 = " + i * 2);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 2; i <= 10; i++) {
                    System.out.println(i + " * 3 = " + i * 3);
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 2; i <= 10; i++) {
                    System.out.println(i + " * 4 = " + i * 4);
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
