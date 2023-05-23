public class Subset {
  public static void main(String[] args) {
    // Create two arrays of integers.
    int[] array1 = {1, 2, 3};
    int[] array2 = {1, 2, 3, 5, 6};

    // Check if the first array is a subset of the second array.
    if (subset(array1, array2)) {
      System.out.println("Array 1 is a subset of Array 2");
    } else {
      System.out.println("Array 1 is not a subset of Array 2");
    }
  }

  public static boolean subset(int[] array1, int[] array2) {
    // Check if the first array is empty.
    if (array1.length == 0) {
      return true;
    }

    // Iterate over the second array and check if each element is present in the first array.
    for (int i = 0; i < array2.length; i++) {
      if (!contains(array1, array2[i])) {
        return false;
      }
    }

    return true;
  }

  public static boolean contains(int[] array, int value) {
    // Iterate over the array and return true if the value is found.
    for (int i = 0; i < array.length; i++) {
      if (array[i] == value) {
        return true;
      }
    }

    return false;
  }
}
