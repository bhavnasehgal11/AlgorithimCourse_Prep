import java.util.*;

class EditDistance {
  public static int EditDistance(String s, String t) {
	  int m = s.length(), n = t.length();
      int[][] table = new int[m + 1][n + 1];
      
      for(int j = 1; j <= n; j++){
    	  table[0][j] = j;
      }
      
      for(int i = 1; i <= m; i++){
    	  table[i][0] = i;
      }
      
      for(int i = 1; i <= m; i++) {
          for(int j = 1; j <= n; j++) {
        	  if(s.charAt(i-1) == t.charAt(j-1)){
        		  table[i][j] = table[i-1][j-1];
        	  }
        	  else{
        		  table[i][j] =1+ Math.min(table[i-1][j],Math.min(table[i-1][j-1], table[i][j-1]));
        	  }
          }
      }
      return table[m][n];
  }
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    String s = scan.next();
    String t = scan.next();

    System.out.println(EditDistance(s, t));
  }

}
