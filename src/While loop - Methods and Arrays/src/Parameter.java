public class Parameter {
    public static void main(String[] args) {
        int num = sumTwoNum(4, 7);
        System.out.println(num);
        System.out.println(sumTwoNum(4, 7));
    }

    public static int sumTwoNum(int first, int second) {
        System.out.println("First number received: " + first);
        System.out.println("Second number received: " + second);
        int sum = first + second;
        return sum;
    }
}
