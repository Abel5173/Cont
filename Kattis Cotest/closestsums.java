import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class closestsums {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int cases = 0;
while (sc.hasNextInt()){
	cases++;
	System.out.println("Case " + cases + ":");
	int n = sc.nextInt();
	int[] nums = new int[n];	
	for (int i = 0; i < nums.length; i++)
		nums[i] = sc.nextInt();
	ArrayList<Integer> sums = new ArrayList<>((n * (n + 1)) / 2);
	for (int i = 0; i < nums.length - 1; i++)
		for (int j = i + 1; j < nums.length; j++)
			if (nums[i] != nums[j])
				sums.add(nums[i] + nums[j]);
	Collections.sort(sums);
	int m = sc.nextInt();
	int[] queries = new int[m];
	for (int i = 0; i < queries.length; i++)
		queries[i] = sc.nextInt();
	int closest = 0;
	for (int query : queries){
		int index = Collections.binarySearch(sums, query);
		if (index >= 0)
			closest = sums.get(index);
		else{
			index = -index - 1;
			if (index == 0 || index == sums.size())
				closest = sums.get(index == 0 ? 0 : sums.size() - 1);
			else{
				int a1 = sums.get(index - 1);
				int a2 = sums.get(index);
				closest = Math.abs(query - a1) <= Math.abs(query - a2) ? a1 : a2;
				}
			}
			System.out.println("Closest sum to " + query + " is " + closest + ".");
		}
	}
	}
}