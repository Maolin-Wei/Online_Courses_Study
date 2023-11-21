package HW0B;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {
    public static int sum(List<Integer> L) {
        if (L.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int num : L) {
            sum += num;
        }
        return sum;
    }

    public static List<Integer> evens(List<Integer> L) {
        List<Integer> l = new ArrayList<>();
        for (int num : L) {
            if (num % 2 == 0) {
                l.add(num);
            }
        }
        return l;
    }

    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> l = new ArrayList<>();
        for (int num1 : L1) {
            for (int num2 : L2) {
                if (num1 == num2) {
                    l.add(num1);
                }
            }
        }
        return l;
    }

    public static int countOccurrencesOfC(List<String> words, char c) {
        int count = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == c) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<String> L3 = new ArrayList<>();
        l1.add(1);
        l1.add(5);
        l1.add(3);
        l2.add(2);
        l2.add(5);
        l2.add(8);
        L3.add("abc");
        L3.add("aab");
        char c = 'c';
        System.out.println(sum(l1));
        System.out.println(evens(l1));
        System.out.println(common(l1, l2));
        System.out.println(countOccurrencesOfC(L3, c));
    }
}
