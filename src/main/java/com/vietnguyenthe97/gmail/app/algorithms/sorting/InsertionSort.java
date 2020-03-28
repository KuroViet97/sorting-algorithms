package com.vietnguyenthe97.gmail.app.algorithms.sorting;

import java.util.List;

public class InsertionSort implements SortInterface {
	public static void sort(List<Integer> arrayList) {
		for (int i = 1; i < arrayList.size(); i++) {
			for (int j = i; j > 0 && arrayList.get(j) < arrayList.get(j - 1); j--) {
				int middleMan = arrayList.get(j - 1);
				arrayList.set(j - 1, arrayList.get(j));
				arrayList.set(j, middleMan);
			}
		}
	}
}
