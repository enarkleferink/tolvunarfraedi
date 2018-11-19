public class DT12D1{
  public static void main(String[] args) {
    Stopwatch timer1 = new Stopwatch();
    int total1 = 0;
    for (int i=0; i<100000000; i++){
      total1+=i;
    }
    double timiInt = timer1.elapsedTime();
    StdOut.println(timiInt);

    Stopwatch timer2 = new Stopwatch();
    double total2 = 0.0;
    for (double i=0; i<100000000; i++){
      total2+=i;
    }
    double timiDouble = timer2.elapsedTime();
    StdOut.println(timiDouble);

  }
}
