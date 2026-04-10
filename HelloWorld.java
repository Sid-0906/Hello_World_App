public class HelloWorld {
    public static void main(String[] args) {

        String greeting;

        if (args.length > 0) {
            // Join all names with comma and space
            String names = String.join(", ", args);
            greeting = "Hello, " + names + "!";
        } else {
            greeting = "Hello, World!";
        }

        System.out.println(greeting);
    }
}