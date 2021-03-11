import java.time.Duration;
import java.time.LocalTime;

public class Hi {
	String ObjectSystemValue = "";

	public static void main(String[] ee) {
//		System.out.println(ee[0] + ee[1]);
		byte a = 125, b = 5;
		b+= 1;
		System.out.println(b);
		
		int c = 11, d = 3;
		double e = Math.round((float)c/d);
		System.out.println(e);
	
		int i = 0;
		algo(i);
		System.out.println(i);
		
		String ax = new String("Hello");
		String bx = ax.intern();
		bx = (bx+1);
		
		System.out.println(ax.substring(0,5));
		
		long seconds = Duration.ofHours(2).getSeconds();
		System.out.println(seconds);
		ax.intern();
		
	}
	
	public static void algo(int i) {
		++i;
	}
}
