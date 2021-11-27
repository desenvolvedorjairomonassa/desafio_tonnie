import java.io.IOException;
import java.util.*;


public class Main{
  
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //StringTokenizer st = new StringTokenizer(br.readLine()); // Lê a linha de entrada
    //int testeCase = Integer.parseInt(st.nextToken());
    
    int t = Integer.parseInt(input.next());
    for(int i=0; i<t;i++){
        int k = Integer.parseInt(input.next());
        int n = Integer.parseInt(input.next());
       int rest = k/n;
       int change = k%n;
       int total = rest+change;
       System.out.println (total);
      
    }
  }
  
  
	
}
