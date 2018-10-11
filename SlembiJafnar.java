public class SlembiJafnar {
 public static void main(String[] args) {
	int N = Integer.parseInt(args[0]);  // stærð fylkis
	int[] a = new int[N]; // skilgr., skapa, upph.st.
	
	for (int i = 0; i < (N-1); i++) {
		a[i] = (int)(Math.random()*51)*2;  
		System.out.print(""+a[i]+", ");
	}
	
	int lok = (int)(Math.random()*51)*2;
	System.out.println(""+lok+". ");
 }
}