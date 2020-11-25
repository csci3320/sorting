public class Swap {
  public static void swap(double[] array, int index1, int index2){
    double temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }
  
}
