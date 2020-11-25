public class SelectionSort implements ISorter{

  @Override
  public void sort(double[] data) {
    for(int i = 0; i < data.length; i++){
      double smallest = Double.MAX_VALUE;
      int smallestIndex = -1;
      for(int j = i; j < data.length; j++){
        double current = data[j];
        if(current < smallest){
          smallest = current;
          smallestIndex = j;
        }
      }
      double temp = data[i];
      data[i] = smallest;
      data[smallestIndex] = temp;
      //Move everything back
    }

  }
  
}
