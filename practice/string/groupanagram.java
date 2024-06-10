package practice.string;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class groupanagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (!visited[i]) {
                List<String> group = new ArrayList<>();
                group.add(strs[i]);
                visited[i] = true;

                char[] charsI = strs[i].toCharArray();
                Arrays.sort(charsI);
                String sortedI = new String(charsI);

                for (int j = i + 1; j < strs.length; j++) {
                    if (!visited[j]) {
                        char[] charsJ = strs[j].toCharArray();
                        Arrays.sort(charsJ);
                        String sortedJ = new String(charsJ);

                        if (sortedI.equals(sortedJ)) {
                            group.add(strs[j]);
                            visited[j] = true;
                        }
                    }
                }

                result.add(group);
            }
        }

        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupedAnagrams = groupAnagrams(input);

        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }
}