public class Binary_Search {

    public static int binarytosearch(int number[], int key) {

        int start = 0;
        int end = number.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            // key found
            if (number[mid] == key) {
                return mid;
            }

            // right side
            if (number[mid] < key) {
                start = mid + 1;
            }

            // left side
            else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int number[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 14;

        int index = binarytosearch(number, key);

        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index : " + index);
        }
    }
}