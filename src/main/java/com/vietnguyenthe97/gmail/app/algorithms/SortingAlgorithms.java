package com.vietnguyenthe97.gmail.app.algorithms;

import java.util.Arrays;
import java.util.List;

public class SortingAlgorithms {
	public static List<Integer> insertionSort(List<Integer> arrayList) {
		for (int i = 1; i < arrayList.size(); i++) {
			for (int j = i; j > 0 && arrayList.get(j) < arrayList.get(j-1); j--) {
				int middleMan = arrayList.get(j-1);
				arrayList.set(j-1, arrayList.get(j));
				arrayList.set(j, middleMan);
			}
		}
		return arrayList;
	}

	public static void main(String[] args) {
		List<Integer> arrayList = Arrays.asList(1, 2, 5, -2, 0, 4, 3);
		System.out.println(SortingAlgorithms.insertionSort(arrayList));
	}
}
