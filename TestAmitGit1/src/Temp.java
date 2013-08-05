import java.math.BigDecimal;


/** * Generated class, please do not edit. */
public class Temp {
	
	public static void main(String[] args) {
		String str="11115678901234567";
		
		Double dbl= 11115678901234567.00;//Double.valueOf(str);
		
		BigDecimal bd1= new BigDecimal("11115678901234567");
		
		System.out.println("Double: "+dbl);
		System.out.println("BigDouble 1: "+bd1);
		System.out.println("BigDouble doubleVal: "+bd1.doubleValue());
		System.out.println("BigDouble 2: "+BigDecimal.valueOf(bd1.doubleValue()));
		System.out.println("Double to long: "+dbl.floatValue());
	}
	
}