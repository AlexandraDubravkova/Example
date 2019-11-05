public class Array {

    public static void main(String[] args){

        int[] a = new int[10];
        int[] b = new int[10];

        Array.printArray();

        for (int i = 0; i <= 9; i++) {
            //b[0] = 10;
            //b[1] = 9;
            //b[2] = 8;
            b[i] = 10 - i;
             //a[0] = 1;
             //a[1] = 2;
             //a[2] = 3;
             a[i] = i + 1;
            System.out.println("Array a: " + a[i] + ", Array b: " + b[i]);
        }
    }

    public static void printArray(){
        int[][] c = new int[5][5];
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                c[i][j] = j;
                System.out.print(c[i][j] + " ");
            }
           System.out.println();
        }

        }
    }




