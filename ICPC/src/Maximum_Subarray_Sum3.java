public class Maximum_Subarray_Sum3 {
    public static void main(String[] args) {
        int[] array = { -1, 2, 4, -3, 5, 2, -5, 2 };
        int best = 0, sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = Math.max(array[i], sum + array[i]);
            best = Math.max(best, sum);
        }
        System.out.println(best);
    }
}