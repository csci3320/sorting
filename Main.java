import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
  public static void main(String[] args) {
    new Main();
  }

  //double[] data;
  public Main(){
    int size = 100000;
    
    double[] data = new double[size];

    init(data, size);
    //double[] data = new double[]{4, 3, 1, 5,2};

    List<ISorter> sorters = new ArrayList<ISorter>();
    sorters.add(new DoNothingSorter());
    sorters.add(new BubbleSorter());
    sorters.add(new BubbleShort());
    sorters.add(new SelectionSort());
    sorters.add(new InsertionSort());
    sorters.add(new MergeSort());
    sorters.add(new QuickSort());
    System.out.println("Name:\t\tSorted?:\tTime:");
    System.out.println("------------------------------------------------------------");

    for(ISorter sorter : sorters){
      long startTime;
      long endTime;
      double[] localData = Arrays.copyOf(data, data.length);
      startTime = System.nanoTime();
      sorter.sort(localData);
      endTime = System.nanoTime();
      double elapsedTime = ((endTime - startTime)/1000000000.0);
      System.out.println(sorter.getClass().getName() + "\t" + isSorted(localData) + "\t\t" + elapsedTime + "s");
      //printData(localData);
    }
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