package week_07.live_class;

public class Reverse {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5, 6};
        int[] list2 = reverse(list1);
        for (int a : list2) {
            System.out.print(a + " ");
        }
    }
    public static int[] reverse(int[] list1){
        int[] result = new int[list1.length];
        for(int i = 0, j = list1.length - 1; i < list1.length; i++,j--){
            result[i] = list1[j];
        }
        return result;
    }
}
