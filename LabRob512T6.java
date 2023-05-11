public class LabRob512T6 {
    public static void main(String[] args) {
        int[][] array = new int[15][];
        for (int i = 0; i < 4; i++) {
            array[i] = new int[5];
            array[i+4] = new int[8];
            array[i+8] = new int[3];
            array[i+11] = new int[9];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.round(Math.random() * 15);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
