package com.monocept.maptest;
import java.util.*;
public class MapFreqTest {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(2,2,3,5,9,8,7,4,5,2,1,2,3,6,6,9,8,5,4,1,1,4,4,5,6,3,6,5,2,10));
		Map<Integer,Integer> freq=new HashMap<>();
		
//		for(Integer key:numbers){
//			if(!freq.containsKey(key)){
//				int value=1;
//				freq.put(key,value);
//			}
//			else {
//				int value=freq.get(key)+1;
//				freq.put(key, value);
//			}
//		}
		
		for (Integer element : numbers) {

			freq.put(element, freq.getOrDefault(element, 0) + 1);
		}
		
		System.out.println(freq);
	}

}
