public class RammiNM{  
    public static void main(String[] args) {  
        int n = Integer.parseInt(args[0]);     //línur  //i
        int m = Integer.parseInt(args[1]);     //dálkar //j
        
        int i = 1;
        int j = 1;
        int k = 1;
        
        if (n<2 || m<2) {  
            System.out.println("Breidd og hæð verða að vera heiltala stærri eða jafnt og tveir");  
        }  
        else {  
        	
        	for (i=1;i<=n;i++)  {  
        		
				if (i==1 || i==n) {
					System.out.print("+ ");
					for (j=2; j<m; j++) {
						System.out.print("- ");
					}
					System.out.print("+");
					System.out.println();
				}
				else {
					System.out.print("| ");
					for (k=2; k<m; k++) {
						System.out.print("  ");
					}
					System.out.print("|");
					System.out.println();
				}

			}					  

        }
        
    }  
}