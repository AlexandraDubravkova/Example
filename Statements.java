import javax.swing.plaf.nimbus.State;

public class Statements {

    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++) {
            System.out.println(i);
            if(i == 50) {
                break;
            }
        }
        Statements.forExample();
        Statements.whileExample();
        Statements.doWhileExample();
    }

    private static void forExample() {
        for(int i = 1; i <= 100; ) {
            i++;
            System.out.println("FOR: " + i);
            if ((i % 2) == 0) {
                //System.out.println(i);
            }
        }
    }

    private static void whileExample() {
        int j = 0;
        while (j < 100) {
            j++;
            System.out.println("WHILE: " + j);
        }
    }

    private static void doWhileExample() {
        int k = 0;
        do {
            k++;
            System.out.println("DO-WHILE: " + k);
        } while (k < 100);
    }

}
