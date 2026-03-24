public class HelloApp5{
    public static void main(String[] args) {
        // Step 1: Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Hello World !");
        } else {
            // Step 2: Use StringBuilder for efficient string construction
            StringBuilder names = new StringBuilder();

            // Step 3: Enhanced For Loop (For-Each) to iterate through args
            for (String name : args) {
                // Add a comma and space if names already contains content
                if (names.length() > 0) {
                    names.append(" ");
                }
                names.append(name);
            }

            // Step 4: Print the final concatenated result
            System.out.println("Hello " + names.toString() + " !");
        }
    }
}