public class FallidHeildarHaekkun {
  public static int heildarHaekkun(int[] h){
    int skilagildi = 0;
    for (int i=0; i<(h.length-1);i++){
      if (h[i] < h[i+1]) {
        skilagildi += (h[i+1]-h[i]);
      }
    }
    return skilagildi;
  }
  public static void main(String[] args) {
    int N = 10;
    int[] h = new int[N];
    System.out.print("Fylkið er: ");
    for (int i=0;i<N;i++){
      h[i]= (int)(Math.random()*100)+1;
      System.out.print(" "+h[i]+" ");
    }
    int nidurstada = heildarHaekkun(h);
    System.out.println();
    System.out.println("Heildarhækkunin er "+nidurstada+". ");
  }
}
