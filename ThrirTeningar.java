public class ThrirTeningar {

  public static int kastaTening(){
    return ((int)(Math.random()*6)+1);
  }

  public static int kastaGodumTening(){ //hermir eftir teningakasti með þyngdum teningi (loaded die)
    double[] a = {0.05,0.125,0.125,0.125,0.125,0.45};
    return (StdRandom.discrete(a)+1);
}

  public static void main(String[] args) {
    System.out.println("Viltu kasta góðum teningi (já)? Annars kasta ég eða venjulegum teningi :D");
    String input = StdIn.readString();

    int N = 16;
    double[] utkomur = new double[N];

    if(input.equals("Já") || input.equals("já")){
      for (int i=0; i<1000; i++){
        int a = kastaGodumTening();
        int b = kastaGodumTening();
        int c = kastaGodumTening();
        utkomur[((a+b+c)-3)] += 1.0;
      }
      StdDraw.setYscale(0, 300);
      StdDraw.setPenColor(StdDraw.RED);
      StdStats.plotBars(utkomur);
    }
    else{
      for (int i=0; i<1000; i++){
        int a = kastaTening();
        int b = kastaTening();
        int c = kastaTening();
        utkomur[((a+b+c)-3)] += 1.0;
      }
      StdDraw.setYscale(0, 300);
      StdDraw.setPenColor(StdDraw.BLUE);
      StdStats.plotBars(utkomur);
    }
  }
}
