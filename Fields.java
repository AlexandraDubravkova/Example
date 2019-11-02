public class Fields {

    public static void main(String[] args) {

        int i;
        int[] field;
        field = new int[5];


        System.out.println("Size of field: " + field.length);

        for (i = 0; i < field.length; i++) {
            field[i] = i + 1;

            System.out.println("Field size:" + field[i]);
        }
        int[] primes = {1, 3, 5, 7, 11}; //inicializovane pole

        int[][] a = new int[2][9];  //dvojrozmerne pole
        System.out.println("Rows: " + a.length);
        System.out.println("Columns :" + a[0].length);

        int[][] b = new int[3][];
        for (int j = 0; j < b.length; j++) {
            b[j] = new int[j + 1];
            for (int k = 0; k < b[j].length; k++) {
                b[j][k] = j * 10 + k;
                System.out.println(b[j][k]);
            }
        }

        int [][][] c = new int[2][3][4]; //trojrozmerne pole
        System.out.println("Field: " + c.length);
        System.out.println("Field: " + c[0].length);
        System.out.println("Field: " + c[0][1].length);


    }
}






