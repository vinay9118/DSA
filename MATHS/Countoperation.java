public class Countoperation {
    public static int countOperations(int num1, int num2) {
        int countans = 0;
        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
            countans++;
        }
        return countans;
    }

    public static void main(String[] args) {
        int num =10;
        int num2=10;
        int result = countOperations(num, num2);
        System.out.println(result);
    }
}
