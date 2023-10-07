package Java8InterviewProgram;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheNumbers {

	public static void main(String[] args) {
		String Ip = "THALAPATHY VIJAY";
		
	Map<String,Long> map = Arrays.stream(Ip.split(""))
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	
	System.out.println(map);

	}

}
