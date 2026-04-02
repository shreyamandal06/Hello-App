/**
 * Hello App
 * UC5
 * Display "Hello" with Multiple Command-Line Arguments
 * 
 *@author Shreya
 *@version 5
 */
 
public class UC5 {
    public static void main(String[] args) {

        StringBuilder names = new StringBuilder();

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }

            System.out.println("Hello, " + names + "!");
        }
    }
}