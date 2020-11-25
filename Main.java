public class Main{
  public static void main(String[] args) {
    new Main();
  }

  //double[] data;
  public Main(){
    int size = 10;
    
    double[] data = new double[size];
    init(data, size);

    ISorter sorter = new DoNothingSorter();

    sorter.sort(data);
    printData(data);
    boolean sorted = isSorted(data);
    System.out.println(sorted);

    sorter = new BubbleSorter();
    sorter.sort(data);

    printData(data);
    sorted = isSorted(data);
    System.out.println(sorted);
  }

  void init(double[] data, int size){
    for(int i = 0; i < data.length; i++){
      data[i] = Math.random();
    }
  }

  void printData(double[] data){
    for(int i = 0; i < data.length; i++){
      System.out.println(i + " " + data[i]);
    }
  }

  boolean isSorted(double[] data){
    for(int i = 0; i < data.length - 1; i++){
      if(data[i] > data[i+1])
        return false;
    }
    return true;
  }
}