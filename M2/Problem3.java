import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        // Don't edit anything here
        Integer[] a1 = new Integer[] { -1, -2, -3, -4, -5, -6, -7, -8, -9, -10 };
        Integer[] a2 = new Integer[] { -1, 1, -2, 2, 3, -3, -4, 5 };
        Double[] a3 = new Double[] { -0.01, -0.0001, -.15 };
        String[] a4 = new String[] { "-1", "2", "-3", "4", "-5", "5", "-6", "6", "-7", "7" };

        bePositive(a1);
        bePositive(a2);
        bePositive(a3);
        bePositive(a4);

    }

    static <T extends Object> void bePositive(T[] arr) {
        System.out.println("Processing Array:" + Arrays.toString(arr));
        // your code should set the indexes of this array
        Object[] output = new Object[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[0] instanceof Integer) {

                if (((Integer) arr[i]).doubleValue() < 0) {
                    double a = (((Integer) arr[i]).doubleValue()) * -1;
                    output[(int) a - 1] = a;
                    System.out.println("Result: " + a);
                    // Error!!!
                } else {
                    double a = (((Integer) arr[i]).doubleValue());
                    output[(int) a - 1] = a;
                    System.out.println("Result: " + a);
                }
            }
            if ((arr[0] instanceof Double)) {

                if (((Double) arr[i]).doubleValue() < 0) {
                    double a = (((Double) arr[i]).doubleValue()) * -1;
                    output[i] = a;
                    System.out.println("Result: " + a);

                    // Error!!!
                } else {
                    double a = (((Double) arr[i]).doubleValue());
                    output[i] = a;
                    System.out.println("Result: " + a);
                }
                Arrays.sort(output);
            }

            if (arr[0] instanceof String) {
                if (Double.parseDouble((String) arr[i]) < 0) {
                    double a = Double.parseDouble((String) arr[i]) * -1;
                    output[(int) a - 1] = a;
                    System.out.println("Result: " + a);
                    // Error!!!
                } else {
                    double a = Double.parseDouble((String) arr[i]);
                    output[(int) a - 1] = a;
                    System.out.println("Result: " + a);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Object i : output) {
            if (i != null) {
                break;
            }
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(String.format("%s (%s)", i, i.getClass().getSimpleName().substring(0, 1)));
        }
        System.out.println("Result: " + sb.toString());
    }
}