package com.solution.main;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.solution.model.Tree;

public class ReadInput {

	public static Scanner getScanner(String filename) {
		InputStream is = ReadInput.class.getClassLoader().getResourceAsStream(filename);
		Scanner sc = new Scanner(is);
		sc.useDelimiter("\n");
		return sc;
	}

	public static Tree getTree(String filename) {
		List<Integer> arr = new ArrayList<Integer>();

		Scanner sc = getScanner(filename);
		sc.useDelimiter(" ");

		sc.forEachRemaining(t -> {
			arr.add(Integer.parseInt(t));
		});

		Tree t = doGetTreeInput(arr, 0, arr.size());

		return t;

	}
	
	public static int[] getIntArray(int size , String arr){
		
		String[] array = arr.split(" ");

		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[i] = Integer.parseInt(array[i]);
		}
		return result ;
		
	}

	private static Tree doGetTreeInput(List<Integer> arr, int low, int high) {
		if (( high-low ) == 0) {
			return null;
		}
		int r_index = (low + high) / 2;

		Tree t = new Tree(arr.get(r_index));

		Tree left = doGetTreeInput(arr, low, r_index);
		Tree right = doGetTreeInput(arr, r_index+1, high);

		t.setLeft(left);
		t.setRight(right);

		return t;

	}
}
