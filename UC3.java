/**
 * Hello App
 * UC3
 * Display "Hello" with Command-Line Argument or Default Message
 * 
 *@author Shreya
 *@version 3
 */
 
 public class UC3 {
    public static void main(String[] args) {

        String name = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello, " + name + "!");

    }
}