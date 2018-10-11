public class RandomWhileLessThan{  
  public static void main(String[] args) {  
    
    double Random = Math.random();
    int count = 0;
    
    while (Random<=0.9) {
    	System.out.println(Random);
        Random = Math.random();
		count++;
    }
   
    System.out.println("While-lykkjan keyrðist "+count+" sinnum.");
       
  }  
}  