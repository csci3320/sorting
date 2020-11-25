public class QuickSort implements ISorter {

  @Override
  public void sort(double[] data) {
    double[] result = quicksort(data, data.length);
    System.arraycopy(result, 0, data, 0, result.length);

  }

  public double[] quicksort(double[] data, int length) {
    if (length == 0)
      return null;// Degenerate case

    double[] toReturn = new double[length];

    // Trivial case
    if (length==1) {
      toReturn[0] = data[0];
      return toReturn;
    }

    int pivotIndex = (length) / 2;
    double pivot = data[pivotIndex];
    double[] lessThan = new double[length -1];
    double[] greaterThan = new double[length -1];
    int lessThanIndex = 0;
    int greaterThanIndex =0 ;
    for(int i = 0; i < length; i++){
      if(i==pivotIndex) continue;
        if(data[i] < pivot)
          lessThan[lessThanIndex++] = data[i];
        else
          greaterThan[greaterThanIndex++] = data[i];
    } 

    int toReturnIndex = 0;
    double[] firstHalf = quicksort(lessThan, lessThanIndex);
    double[] secondHalf = quicksort(greaterThan, greaterThanIndex);
    if (firstHalf != null){
      System.arraycopy(firstHalf, 0, toReturn, 0, firstHalf.length);
      toReturnIndex += firstHalf.length;
    }
    toReturn[toReturnIndex++] = pivot;
    if(secondHalf != null)
      System.arraycopy(secondHalf, 0, toReturn, toReturnIndex, secondHalf.length);
    return toReturn;
  }

}
