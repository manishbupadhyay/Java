public class TwoDArray {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        a[0][0] = 5;
        a[0][1] = 6;
        a[0][2] = 7;

        a[1][0] = 8;
        a[1][1] = 9;
        a[1][2] = 10;

        a[2][0] = 11;
        a[2][1] = 12;
        a[2][2] = 13;

        // length of 2D array
        System.out.println(a.length);
        System.out.println(a[0].length);

        // print all value from 2d array
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[0].length; col++)
                System.out.println(a[row][col]);
        }
    }

}
