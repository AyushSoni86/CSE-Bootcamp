class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        // elements of first row
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        // elements of second row
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        // elements of third row
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.println(arr[0][2]);
    }
}
