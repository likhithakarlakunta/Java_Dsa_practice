
import java.util.LinkedHashSet;
public class RemoveDuplicateElems {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 5, 1};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Array after removing duplicates:");
        System.out.println(set);
    }
}