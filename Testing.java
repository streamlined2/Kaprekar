import java.util.*;

public class Testing {

    public final static int MAGIC_NUMBER=6174;

    public static void main(String[] args) {
    	System.out.printf("Steps to reach kaprekar number %d: %d\n",6162,kaprekar(6162));
    	System.out.printf("Steps to reach kaprekar number %d: %d\n",2345,kaprekar(2345));
    	System.out.printf("Steps to reach kaprekar number %d: %d\n",6734,kaprekar(6734));
    	System.out.printf("Steps to reach kaprekar number %d: %d\n",8934,kaprekar(8934));
    	System.out.printf("Steps to reach kaprekar number %d: %d\n",3278,kaprekar(3278));
	}

    public static int kaprekar(final int num) {
	    int count=0;
	    int number=num;
	    do{
	        number=firstNumber(number)-secondNumber(number);
	        count++;
	    }while(number!=MAGIC_NUMBER);
	    return count;
  }
    
  public static int firstNumber(final int num){
      final List<Integer> digits=digits(num);
      Collections.sort(digits,Comparator.reverseOrder());
      return intValue(digits);
  }
  
  public static int secondNumber(final int num){
      final List<Integer> digits=digits(num);
      Collections.sort(digits);
      return intValue(digits);
  }
  
  public static int intValue(final List<Integer> digits){
      int value=0;
      for(int digit:digits){
          value=value*10+digit;
      }
      return value;
  }
  
  public static List<Integer> digits(final int num){
      final List<Integer> digits=new ArrayList<>();
      for(int value=num;value>0;value=value/10){
          digits.add(0,value%10);
      }
      return digits;
  }

 
}
