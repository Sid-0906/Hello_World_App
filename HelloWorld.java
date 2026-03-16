public class HelloWorld {
    public static void main(String[] args) {

        // UC1
        System.out.println("Hello World");

        // UC2
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "! Welcome to the application.");
        } else {
            System.out.println("Please provide your name.");
        }

    }
}