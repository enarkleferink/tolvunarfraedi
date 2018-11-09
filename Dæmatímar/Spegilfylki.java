public class Spegilfylki{ //e. palindrome array

  public static boolean palin(int[] a){
    int N = a.length;
    for (int i=0;i<(N/2);i++){
      if (a[i] != a[N-i-1]) return false;
    }
    return true;
  }

  public static void main(String[] args){
    int T = 5;
    int[] a = new int[T];

    System.out.print("Fylkið er: ");
    for (int i=0;i<T;i++){
      a[i]= (int)(Math.random()*T)+1;
      System.out.print(" "+a[i]+" ");
    }
    System.out.println();
    System.out.println(palin(a));

    int[] b = {1,2,3,2,1};

    System.out.print("Fylkið er: ");
    for (int i=0;i<T;i++){
      System.out.print(" "+b[i]+" ");
    }
    System.out.println();
    System.out.println(palin(b));

  }

}
