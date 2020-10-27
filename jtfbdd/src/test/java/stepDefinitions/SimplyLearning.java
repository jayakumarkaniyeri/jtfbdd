package stepDefinitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimplyLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("Manu","Giri", "Gopal", "Sathi", "Rama");
		
		//names.stream().sorted().forEach(s -> System.out.print(s+" "));
		names.stream().filter(val -> val.length() > 4).map(val -> val.toUpperCase()).forEach(val -> System.out.println(val));
		
		List<Integer> nums = Arrays.asList(16, 21, 9, 7, 55, 32, 12);
		List<Integer> sorList = nums.stream().sorted().collect(Collectors.toList());
		System.out.print(nums);
		System.out.print(sorList);
		
	}

}
