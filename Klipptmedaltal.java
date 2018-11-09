public class Klipptmedaltal {
  public static double trmean(double[] a){ //þarfnast lagfæringar
    double max = StdStats.max(a);
    double min = StdStats.min(a);
    double sum = 0;
    for (int i=0; i<a.length;i++){
      sum += a[i];
    }
    double skilagildi = ((sum-max-min)/sum);
    return skilagildi;
  }
  public static void main(String[] args) {
    int N = 10;
    double[] a = new double[N];
    System.out.println("Fylkið er: ");
    for (int i=0;i<N;i++){
      a[i]= Math.random()*10;
      StdOut.printf("stak nr. " +(i+1)+ "%10.3f\n", a[i]);
    }
    double klippt = trmean(a);
    double medaltal = StdStats.mean(a);
    System.out.println();
    System.out.println("Klippta meðaltalið er "+klippt+". ");
    System.out.println("Venjulegt meðaltal er "+medaltal+". ");
  }
}
