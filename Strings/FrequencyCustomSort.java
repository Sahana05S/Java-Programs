package Strings;

import java.util.*;

public class FrequencyCustomSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(freq.keySet());

        Collections.sort(list, (a, b) -> {
            if (freq.get(a).equals(freq.get(b))) {
                return b - a;   // same freq → DESCENDING value
            }
            return freq.get(a) - freq.get(b);  // ASCENDING frequency
        });

        for (int x : list) {
            for (int i = 0; i < freq.get(x); i++) {
                System.out.print(x + " ");
            }
        }
    }
}

