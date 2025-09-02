public class Main {
    public static void main(String[] args) {
        final int ONE = 7;
        final int TWO = 7;
        String[][] x = new String[ONE][TWO];
        for (int i = 0; i < ONE; i++) {
            for (int j = 0; j < TWO; j++) {
                if (i == j) {
                    x[i][j] = "X";
                } else if (i == (TWO - 1 - j)) {
                    x[i][j] = "X";
                } else {
                    x[i][j] = " ";
                }
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }
}