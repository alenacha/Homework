import java.util.Arrays;

public class Lesson4 {
    public static void main(String[] args) {
        resultSumm();
    }

    public static void resultSumm() {
        int[] array1 = new int[20];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100);
            if (Math.random() <= 0.5) {
                array1[i] = -array1[i];
            }
        }
        System.out.println(Arrays.toString(array1));
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] >= 5 && array1[i] <= 45) {
                 sum= sum + array1[i];
            }
            if (array1[i] >=0 && array1[i]%2 ==0 ) {
                System.out.println(array1[i]);
            }

        }
        System.out.println(sum);

    }
}
