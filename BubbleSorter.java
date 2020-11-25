

public class BubbleSorter implements ISorter {

  @Override
  public void sort(double[] data) {
    for(int i = 0; i < data.length; i++){
      for(int j = i+1; j < data.length; j++){
        if(data[j] > data[i]) continue;
        double temp = data[j];
        data[j] = data[i];
        data[i] = temp;
      }
    }

  }

}
