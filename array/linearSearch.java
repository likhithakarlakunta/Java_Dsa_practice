public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};

        int target = 15;
        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}