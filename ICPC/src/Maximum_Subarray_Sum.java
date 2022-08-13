public class Maximum_Subarray_Sum {
    public static void main(String[] args) {
        int[] array = { -1, 2, 4, -3, 5, 2, -5, 2 };
        int best = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += array[k];
                }
                best = Math.max(best, sum);
            }
        }
        System.out.println(best);
    }
}