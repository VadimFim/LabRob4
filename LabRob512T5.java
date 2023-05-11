public class LabRob512T5 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
        }
        for (int i : array) {
            if (i % 2 == 0) {
                counter++;
            }
            System.out.print(i + " ");
        }
        System.out.println("\nКількість парних чисел: " + counter);
    }
}
