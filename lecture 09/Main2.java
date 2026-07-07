public class Main2 {
    public static void main(String[] args) {
        // Multi dimensional array
        // int[][] marks = new int[3][3];

        // marks[0][0] = 100;
        // marks[0][1] = 90;
        // marks[0][2] = 80;

        // marks[1][0] = 70;
        // marks[1][1] = 60;
        // marks[1][2] = 50;

        // marks[2][0] = 40;
        // marks[2][1] = 30;
        // marks[2][2] = 20;

        // for (int row = 0; row < marks.length; row++) {
        //     for (int col = 0; col < marks[row].length; col++) {
        //         System.out.print(marks[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // Multi dimensional array each with different length
        // int [][] marks = new int[3][];
        // marks[0] = new int[1];
        // marks[1] = new int[2];
        // marks[2] = new int[3];

        // /*
        //     [ ]
        //     [ ][ ]
        //     [ ][ ][ ]
        // */

        // marks[0][0] = 100;
        // marks[1][0] = 90;
        // marks[1][1] = 80;
        // marks[2][0] = 70;
        // marks[2][1] = 60;
        // marks[2][2] = 50;

        // for (int row =0; row< marks.length; row++){
        //     for(int col=0; col<marks[row].length; col++){
        //         System.out.print(marks[row][col] + " ");
        //     }
        //     System.out.println();
        // }


        // 1D array

        int[] rollNums = {101, 102, 103};

        for (int i = 0; i < rollNums.length; i++) {
            System.out.println(rollNums[i]);
        }

        // 2D array

        int[][] marks = {
            {100, 90, 80},
            {70, 60, 50},
            {40, 30, 20}
        };

        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }
    }
}
