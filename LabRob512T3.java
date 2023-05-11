public class LabRob512T3 {
    public static void main(String[] args) {
        int[] firstArray = new int[5];
        int[] secondArray = new int[5];
        int[] thirdArray = new int[5];
        double totalFirstArray = 0, totalSecondArray = 0, totalThirdArray = 0;

        for (int i = 0; i < 5; i++) {
            firstArray[i] = (int) Math.round(Math.random() * 5);
            totalFirstArray += firstArray[i];
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            secondArray[i] = (int) Math.round(Math.random() * 5);
            totalSecondArray += secondArray[i];
            System.out.print(secondArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            thirdArray[i] = (int) Math.round(Math.random() * 5);
            totalThirdArray += thirdArray[i];
            System.out.print(thirdArray[i] + " ");
        }

        totalFirstArray /= 5;
        totalSecondArray /= 5;
        totalThirdArray /= 5;

        System.out.println();

        if (totalFirstArray == totalSecondArray && totalFirstArray == totalThirdArray) {
            System.out.println("totalFirstArray == totalSecondArray == totalThirdArray");
        } else if(totalSecondArray > totalThirdArray && totalSecondArray > totalFirstArray) {
            System.out.println("totalSecondArray");
        } else if(totalFirstArray > totalSecondArray && totalFirstArray > totalThirdArray) {
            System.out.println("totalFirstArray");
        } else {
            System.out.println("totalThirdArray");
        }

    }
}
