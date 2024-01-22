package com.test.java.stream;

import java.util.Arrays;
import java.util.List;

import com.test.data.Data;
import com.test.data.Item;
import com.test.data.User;

public class Ex68_Stream {
	public static void main(String[] args) {
		
		m1();
	}

	private static void m1() {
		
		int[] nums1 = Data.getIntArray();
		System.out.println(Arrays.toString(nums1));
		
		int[] nums2 = Data.getIntArray(10);
		System.out.println(Arrays.toString(nums2));
		
		List<Integer> nums3 = Data.getIntList();
		System.out.println(nums3);
		
		List<Integer> nums4 = Data.getIntList(10);
		System.out.println(nums4);
		
		String[] txt1 = Data.getStringArray(5);
		System.out.println(Arrays.toString(txt1));
		
		User[] ulist = Data.getUserArray();
		System.out.println(Arrays.toString(ulist));
		
		Item[] ilist = Data.getItemArray();
		System.out.println(Arrays.toString(ilist));
		
	}
}
