package com.cts.collections;

import java.util.*;

public class MinNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(96);
		list.add(75);
		list.add(89);
		list.add(26);
		list.add(56);
		list.add(41);
		list.add(94);
		list.add(46);
		
		System.out.println("Min Num:"+Collections.min(list));
	}

}
