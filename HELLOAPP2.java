
public class HELLOAPP2{
    public static void main(String[] args) {
        // Check if at least one argument was provided
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, World! (Tip: Pass a name as an argument next time!)");
        }
    }
}