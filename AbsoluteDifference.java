public class AbsoluteDifference {
  public static void main(String[] args) {
    // Create an array of floating-point numbers.
    double[] array = {4.5, 3.5, 6.0, 20.0, 3.0};

    // Print the minimum absolute difference between any pair of numbers in the array.
    System.out.println(absoluteDifference(array));
  }

  public static double absoluteDifference(double[] array) {
    double minAbsoluteDifference = Double.MAX_VALUE;

    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        double diff = Math.abs(array[i] - array[j]);
        if (diff < minAbsoluteDifference) {
          minAbsoluteDifference = diff;
        }
      }
    }
    return minAbsoluteDifference;
  }
}
