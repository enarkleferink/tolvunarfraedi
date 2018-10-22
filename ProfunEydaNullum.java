public class ProfunEydaNullum {

  public static int[] eydaNullum(int[] a){
    int Núll=0;
    boolean[] stodur = new boolean[a.length];

    for (int j=0;j<a.length;j++){
      if (a[j]==0) {
        Núll++;
        stodur[j]=true;
      }
    }

      int lengdN = (a.length-Núll);
      int[] n = new int [lengdN];
      int c = 0;
      for (int l=0; l<a.length;l++){
        if(!stodur[l]){
          n[c]=a[l];
          c++;
        }
      }
      return n;
  }


  public static void main(String[] args) {
    int[] a = new int[20];
    for (int i=0; i<20; i++){
      a[i] = (int)(Math.random()*6);
    }
    int[] n = eydaNullum(a);
    StdOut.print("Fylkið með núllum er: "+a[0]);
    for (int k =1;k<n.length;k++){
      StdOut.print(", "+a[k]);
    }
      StdOut.println(". ");

    StdOut.print("Fylkið án núlla er: "+n[0]);
    for (int k =1;k<n.length;k++){
      StdOut.print(", "+n[k]);
    }
      StdOut.println(". ");
  }

}
