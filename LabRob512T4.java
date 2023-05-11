public class LabRob512T4 {
    public static void main(String[] args) {
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];

        for (int i = 0; i < 10; i++) {
            firstArray[i] = (int) Math.round(Math.random() * 10);
            secondArray[i] = (int) Math.round(Math.random() * 10);
        }

        int[] thirdArray = new int[10];
        for (int i = 0; i < 10; i++) {
            thirdArray[i] = firstArray[i] + secondArray[i];
        }

        for (int i : firstArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : secondArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : thirdArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
