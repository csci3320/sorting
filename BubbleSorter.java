

public class BubbleSorter implements ISorter {

  @Override
  public void sort(double[] data) {
    for(int i = 0; i < data.length; i++){
      for(int j = 0; j < data.length-1-i; j++){
        if(data[j+1] > data[j]) continue;
        double temp = data[j+1];
        data[j+1] = data[j];
        data[j] = temp;
      }
    }

  }

}
