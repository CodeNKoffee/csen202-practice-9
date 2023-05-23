public class UnionIntersection {

  public static void main(String[] args) {
    int[] array1 = {12, 32, 14, 35, 89, 16, 120};
    int[] array2 = {9, 12, 8, 17, 120, 35, 36};

    System.out.println("Union:");
    printUnion(array1, array2);

    System.out.println("\nIntersection:");
    printIntersection(array1, array2);
  }

  public static void printUnion(int[] array1, int[] array2) {
    // Create a new array to store the union of the two arrays.
    int[] union = new int[array1.length + array2.length];

    // Iterate over the first array and add each element to the union array.
    for (int i = 0; i < array1.length; i++) {
      union[i] = array1[i];
    }

    // Iterate over the second array and add each element to the union array if it is not already present.
    for (int i = 0; i < array2.length; i++) {
      if (!contains(union, array2[i])) {
        union[array1.length + i] = array2[i];
      }
    }

    // Print the union array.
    for (int i = 0; i < union.length; i++) {
      System.out.print(union[i] + ", ");
    }
  }

  public static void printIntersection(int[] array1, int[] array2) {
    // Create a new array to store the intersection of the two arrays.
    int[] intersection = new int[array1.length];

    // Iterate over the first array and add each element to the intersection array if it is also present in the second array.
    int index = 0;
    for (int i = 0; i < array1.length; i++) {
      if (contains(array2, array1[i])) {
        intersection[index++] = array1[i];
      }
    }

    // Print the intersection array.
    for (int i = 0; i < index; i++) {
      System.out.print(intersection[i] + ", ");
    }
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
