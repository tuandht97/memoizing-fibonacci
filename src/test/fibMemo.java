package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class fibMemo {

  public static void main(String[] args) {
	System.out.println("Nhap so bat ky");
	
	Scanner scan = new Scanner(System.in);
	
	int t = scan.nextInt();
	
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    System.out.println("Fibo cua " + t +" la " + fibMemo(t, map));
    
  }

  public static int fibMemo(int n, Map<Integer, Integer> map) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    }
    
    if(map.containsKey(n)) {
      return map.get(n);
    } else {
      int t = fibMemo(n-1, map) + fibMemo(n-2, map);
      map.put(n, t);
      return t;
    }
  }
}
