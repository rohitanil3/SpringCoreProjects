package com.onesolvent.springdemo;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		Solution s =new Solution(); 
		
		System.out.println(s.solution(new int[]{1,1,9,8,6,3,3,5,4,2}));
		
		
	}
	public  int solution(int[] A) {
		Set<Integer> set =new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			
			set.add(A[i]);
		}
		set.stream().sorted().collect(Collectors.toSet());
		for (Integer integer : set) {
			int i=0;
			while(i<A.length){
			 A[i]=integer;
			 i++;
			}
		}
          for (int i = 0; i < A.length; i++) {
			
			set.add(A[i]);
		}
		return set.size();
        // write your code in Java SE 8
        
    }
}
