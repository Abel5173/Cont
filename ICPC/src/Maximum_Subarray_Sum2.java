public class Maximum_Subarray_Sum2 {
    public static void main(String[] args) {
        int[] array = { -1, 2, 4, -3, 5, 2, -5, 2 };
        int best = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                best = Math.max(best, sum);
            }
        }
        System.out.println(best);
    }
}