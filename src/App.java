import Library.Bug;
import Library.LivingBeing;
// package Library;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        LivingBeing bug0 = new Bug("Bug 0");
        LivingBeing bug1 = new Bug("Bug 1");

        bug0.interact(bug1);

        //hw
        System.out.println("here is the new line");
        
        //new line
    }
}
