public class MergeSort implements ISorter {

  @Override
  public void sort(double[] data) {
    double[] tempArray = new double[data.length];
    mergeSort(data, tempArray, 0, data.length-1);

  }
  public void mergeSort(double[] data, double[] tempArray, int leftIndex, int rightIndex){
    if(leftIndex < rightIndex){
      int center = (leftIndex + rightIndex)/2;
      mergeSort(data, tempArray, leftIndex, center);
      mergeSort(data, tempArray, center+1, rightIndex);
      merge(data, tempArray, leftIndex, center+1, rightIndex );
    }
  }

  public void merge(double[] data, double[] tempArray, int leftStart, int rightStart, int rightEnd){
    int leftPos = leftStart;
    int leftEnd = rightStart - 1;
    int rightPos = rightStart;
    int tempPos = leftStart;

    while(leftPos <= leftEnd && rightPos <= rightEnd){
      if(data[leftPos] < data[rightPos]){
        tempArray[tempPos++] = data[leftPos++];
      }
      else{
        tempArray[tempPos++] = data[rightPos++];
      }
    }
    while(leftPos <= leftEnd){
      tempArray[tempPos++] = data[leftPos++];
    }
    while(rightPos <= rightEnd){
      tempArray[tempPos++] = data[rightPos++];
    }

    for(int i = leftStart; i <= rightEnd; i++){
      data[i] = tempArray[i];
    }
  }
  
}
