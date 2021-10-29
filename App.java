public class App {
    public static void main(String[] args) throws Exception {
        double[] exampleArray = { 1, 5, 6, 5, 4, 1 };
        double maximum = exampleArray[0];

        for (int i = 1; i < exampleArray.length; i++) {

            if (exampleArray[i] > maximum) {

                maximum = exampleArray[i];

            }

        }

        System.out.println(maximum);
    }
}
