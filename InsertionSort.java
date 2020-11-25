public class InsertionSort implements ISorter{

  @Override
  public void sort(double[] data) {
    for(int i = 1; i < data.length; i++){
      //Move left until we meet something that is smaller than we are
      for(int j = i; j > 0; j--){
        if(data[j-1] > data[j]){
          Swap.swap(data, j, j-1);
        }
      }
    }

  }

}