package HW0B;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    public static Map<Character, Integer> letterToNum() {
        Map<Character, Integer> treeMap= new TreeMap<>();
        int start = (int)'a';
        for (int i = 1; i <= 26; i++) {
            char c = (char)start;
            treeMap.put(c, i);
            start+=1;
        }
        return treeMap;
    }

    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> treeMap = new TreeMap<>();
        for (int num : nums) {
            treeMap.put(num, num * num);
        }
        return treeMap;
    }

    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> treeMap = new TreeMap<>();
        for (String word : words) {
            if (!treeMap.containsKey(word)) {
                treeMap.put(word, 1);
            }
            else {
                int count = treeMap.get(word);
                count+=1;
                treeMap.put(word, count);
            }
        }
        return treeMap;
    }

    public static void main(String[] args) {
        Map<Character, Integer> treeMap1 = letterToNum();
        System.out.println(treeMap1);

        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(6);
        l1.add(5);
        Map<Integer, Integer> treeMap2 = squares(l1);
        System.out.println(treeMap2);

        List<String> l2 = new ArrayList<>();
        l2.add("word1");
        l2.add("word2");
        l2.add("word3");
        l2.add("word4");
        l2.add("word3");
        l2.add("word1");
        l2.add("word1");

        Map<String, Integer> treeMap3 = countWords(l2);
        System.out.println(treeMap3);
    }
}
