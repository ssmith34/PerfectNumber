public class PerfectNumber {

    public static boolean isPerfectNumber (int number) {
        // Edge Cases
        if (number < 1) {
            return false;
        }

        // Variable Declaration
        int sum = 0;

        // iterate through number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
                System.out.println(sum);
            }
        }
        return sum == number ? true : false;
    }
}
