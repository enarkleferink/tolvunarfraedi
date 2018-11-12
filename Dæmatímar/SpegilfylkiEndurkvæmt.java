public class SpegilfylkiEndurkvæmt{ //e. palindrome array

  public static boolean prec(int[] a, int i, int j){
    if(i==j || i+1==j) return true;
    else if(a[i]==a[j]) return (prec(a, ++i, --j));
    else if (a[i]!=a[j]) return false;
    return true;
  }

  public static void main(String[] args){
    int T = 5;
    int[] a = {1,2,3,2,1};

    System.out.print("Fylkið er: ");
    for (int i=0;i<T;i++){
      System.out.print(" "+a[i]+" ");
    }
    System.out.println();

    System.out.println(prec(a, 0, a.length-1));

    int[] b = {0,2,3,2,1};

    System.out.print("Fylkið er: ");
    for (int i=0;i<T;i++){
      System.out.print(" "+b[i]+" ");
    }
    System.out.println();

    System.out.println(prec(b, 0, b.length-1));

  }
}
