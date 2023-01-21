import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringConvert {
	public static int toInt(String s) {
		return Integer.parseInt(s);
	}
	public static Integer toInteger(String s) {
		return Integer.valueOf(s);
	}
	public static long toLong(String s) {
		return Long.parseLong(s);
	}
	public static Long toLong(String s) {
		return Long.valueOf(s);
	}
	public static double toDouble(String s) {
		return Double.parseDouble(s);
	}
	public static Double toDouble(String s) {
		return Double.valueOf(s);
	}
	public static char[] toCharArray(String s) {
		return s.toCharArray();
	}
	public static byte[] toByteArray(String s) {
		return s.getBytes();
	}
	public static boolean toboolean(String s) {
		return Boolean.parseBoolean(s);
	}
	public static Boolean toBoolean(String s) {
		return Boolean.valueOf(s);
		
	}
	public static Date toDate(String date, String pattern)throws ParseException{
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		return formatter.parse(date);
	}
	
	
	public static void main(String[] args) {
		String s = "1";
		System.out.println("To primitve Int : " +toInt(s));
		System.out.println("To Integer Wrapper type : " +toInteger(s));
		System.out.println("To primitve Long : " +toLong(s));
		
		

	}

}
