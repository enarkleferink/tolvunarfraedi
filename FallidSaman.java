public class FallidSaman {
  public static boolean saman(int[] a, int d, int e){
    boolean skilagildi = false;
    for (int i=0; i<(a.length-1);i++){
      if (a[i]== d && a[i+1] == e) {
        skilagildi = true;
        return skilagildi;
      }
      else if (a[i]== e && a[i+1] == d) {
        skilagildi = true;
        return skilagildi;
      }
    }
    return skilagildi;
  }
  public static void main(String[] args) {
    int N = 5;
    int d = (int)(Math.random()*5)+1;
    int e = (int)(Math.random()*5)+1;
    int[] a = new int[N];
    for (int i=0;i<N;i++){
      a[i]= (int)(Math.random()*5)+1;
    }
    boolean nidurstada = saman(a, d, e);
    System.out.print("Fylkið er: ");
    for (int j=0;j<N;j++){
      System.out.print(" "+a[j]+" ");
    }
    System.out.println();

    if (nidurstada){
      System.out.println("Tölurnar "+d+" og "+e+" eru hlið við hlið");
    }
    else {
        System.out.println("Tölurnar "+d+" og "+e+" eru ekki hlið við hlið");
    }
  }
}
