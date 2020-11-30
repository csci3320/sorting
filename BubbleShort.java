

public class BubbleShort implements ISorter {

  @Override
  public void sort(double[] data) {
    for(int i = 0; i < data.length; i++){
      boolean swap = false;
      for(int j = 0; j < data.length-1-i; j++){
        if(data[j+1] > data[j]) continue;
        swap = true;
        double temp = data[j+1];
        data[j+1] = data[j];
        data[j] = temp;
      }
      if(!swap) return;
    }

  }

}
