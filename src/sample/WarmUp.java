package sample;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WarmUp {
	public static void main(String[] args) {

		//WAP to create an array for range of values frm 0,1,2,3.....100
		int [] numArr;
		numArr = new int[100];
		for (int i=0;i<=100;i++){
			numArr[i]=i;
		}

		//Same using java8 Features
		int[] numbersArray=IntStream.rangeClosed(0,100).toArray();

		//WAP to create  an ArrayList<Integer> that contains 0,1,2,3.....100 Integer Number.
		List<Integer> numList=new ArrayList<>();
		for (int i=0;i<=100;i++){
			numList.add(new Integer(i));
		}

		//Same using Java 8 feature
		List<Integer> numbersList=IntStream.rangeClosed(0,100)      // 0,1,2,3.....100
				.mapToObj(i-> new Integer(i))   //Integer Object  0,1,2,3.....100
				.collect(Collectors.toList());  //Add all integer object to ArrayList<Integer>

	}
}