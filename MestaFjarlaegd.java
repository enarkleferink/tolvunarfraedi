public class MestaFjarlaegd{
 public static void main(String[] args) {
	int N = Integer.parseInt(args[0]);  // stærð fylkis
	int[] a = new int[N]; // skilgr., skapa, upph.st.

	a[0] = (int)(Math.random()*11)-5;
  System.out.print(""+a[0]);

	for (int i = 1; i < N; i++) {
		a[i] = (int)(Math.random()*11)-5;
		System.out.print(", "+a[i]);
	}
	System.out.println();

	int[] Fjarlaegd = new int[N];

    for (int k=0; k<N; k++){
      for (int l=k+1; l<N; l++){
	        if (a[k] == a[l]){
	          Fjarlaegd[k] = l-k;
	          break;
	        }

	      }
	   }
	   int maxStada = 0;
	   int maxFjarlaegd = Fjarlaegd[0];
	   for (int m=0;m<N ;m++){
      if (Fjarlaegd[m]> maxFjarlaegd){
        maxFjarlaegd = Fjarlaegd[m];
        maxStada = m;
      }
     }
    System.out.print("Mesta fjarlægð er " + maxFjarlaegd);
    System.out.println(" fyrir gildið " + a[maxStada]);

 }
}
