import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        // Don't edit anything here
        double[] a1 = new double[] { 10.001, 11.591, 0.011, 5.991, 16.121, 0.131, 100.981, 1.001 };
        double[] a2 = new double[] { 1.99, 1.99, 0.99, 1.99, 0.99, 1.99, 0.99, 0.99 };
        double[] a3 = new double[] { 0.01, 0.01, 0.01, 0.01, 0.01, 0.01, 0.01, 0.01, 0.01, 0.01 };
        double[] a4 = new double[] { 10.01, -12.22, 0.23, 19.20, -5.13, 3.12 };

        getTotal(a1);
        getTotal(a2);
        getTotal(a3);
        getTotal(a4);
    }

    static void getTotal(double[] arr) {
        System.out.println("Processing Array:" + Arrays.toString(arr));
        double total = 0;
        String totalOutput = "";
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        String output = String.valueOf(total);
        // set the double to a string variable
        totalOutput = output + "";
        // end add/edit section
        System.out.println("Total is " + totalOutput);
        System.out.println("End process");
    }

}