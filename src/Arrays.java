public class Arrays {
    public static void main(String[] args) {
        int[] myNums = {1, 2, 3, 4, 5};
        // iterating through an array with a for each loop
        for (int i: myNums) {
            System.out.println(i);
        }
        // print first number in myNums
        System.out.println(myNums[0]);
        // print the last number in myNums
        System.out.println(myNums[myNums.length - 1]);
    }
}
