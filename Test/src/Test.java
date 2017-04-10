import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,2,3,7,5,6,9,8);
		doIt();	
	}
	
	public static void doStuff(List<Integer> list){
	
		System.out.println(list.stream()
			.filter(e -> e > 3)
			.filter(e -> (e % 2 == 0))
			.map(e -> e*2)
			.findFirst().get()
		);
	}
	
	public static void doIt()
	{
		int a=10,b=5;
		
		doSomething doItNow = new doSomething();
		System.out.println(doItNow.doOperation(a, b, (x,y) ->{return x/y;}));
		
	}
			
}

