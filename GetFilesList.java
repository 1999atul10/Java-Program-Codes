class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                throw new CheckArgument("Less than 5 arguments");
            } else {
                int sum = 0;
                for (int i = 0; i < args.length; i++) {
                    sum += Integer.parseInt(args[i]);
                }
                System.out.println(sum);
            }
        } catch (CheckArgument e) {
            System.out.println(e.getMessage());
        }
    }
}

