// Put any necessary java8 imports you may need for solution
import java.util.*;

public class Testing {
    public final static int MAGIC_NUMBER=6174;
	public static int kaprekar(int num) {
	    int count=0;
	    int number=num;
	    int first,second;
	    do{
	        first=firstNumber(number);
	        second=secondNumber(number);
	        number=first-second;
	        count++;
	    }while(number!=MAGIC_NUMBER);
	    return count;
  }
  public static int firstNumber(int num){
      List<Integer> digits=digits(num);
      Collections.sort(digits,Comparator.reverseOrder());
      return intValue(digits);
  }
  
  public static int secondNumber(int num){
      List<Integer> digits=digits(num);
      Collections.sort(digits);
      return intValue(digits);
  }
  
  public static int intValue(List<Integer> digits){
      int value=0;
      for(int digit:digits){
          value+=value*10+digit;
      }
      return value;
  }
  
  public static ArrayList<Integer> digits(int num){
      ArrayList<Integer> digits=new ArrayList<>();
      for(int value=num;value>0;value=value/10){
          digits.add(value%10);
      }
      return digits;
  }
}
