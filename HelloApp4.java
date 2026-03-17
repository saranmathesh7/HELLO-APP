public class HelloApp4{
    public static void main(String[] args) {

        String message = "Hello, ";

        // If no arguments → default to "World"
        if (args.length == 0) {
            message += "World";
        } else {
            // Loop through all arguments
            for (int i = 0; i < args.length; i++) {
                message += args[i];

                // Add comma only if it's not the last element
                if (i < args.length - 1) {
                    message += ", ";
                }
            }
        }

        message += "!";
        System.out.println(message);
    }
}