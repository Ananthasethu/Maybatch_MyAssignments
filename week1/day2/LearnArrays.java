package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numlist [] = {2,3,3,2,4,6,7,4,8,7};
System.out.println("Duplicate numbers from the Array list as below ");
Arrays.sort(numlist);
for (int i=0; i<numlist.length-1; i++) {
	if(numlist[i]==numlist[i+1]) {
		System.out.println(numlist[i+1]);
	}
}
	}

}
