package activities.mock_exam.exam1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5,100,100,60,20,1,99, 2, 1, 3, 4, 4};
        int numbers[] = findNumbers(arr);

        Arrays.stream(numbers).forEach(System.out::println);

    }

    public static int[] findNumbers(int[] arr) {
        int[] result = new int[2];
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }
        int mask = 1;
        while ((mask & xor) == 0) {
            mask <<= 1;
        }
        for (int num : arr) {
            if ((num & mask) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }
        return result;
    }

}
