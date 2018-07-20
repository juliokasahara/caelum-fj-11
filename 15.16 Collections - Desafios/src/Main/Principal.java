package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal{
	
	public static void main(String[] args) {
		
		List<Integer> numList = new ArrayList<>();
		for (int i = 1; i < 1001; i++) {
			numList.add(i);
		}
		
		System.out.println(numList);
		Collections.reverse( numList );
		System.out.println(numList);

	}


	
}


