package com.vietnguyenthe97.gmail.app.algorithms.sorting;

import java.util.List;

public class SelectionSort implements SortInterface{
	public static void sort(List<Integer> unsortedList) {
		for (int i=0; i<unsortedList.size(); i++) {
			int minIndex = i;
			for (int j=i+1; j<unsortedList.size(); j++) {
				if (unsortedList.get(j) < unsortedList.get(minIndex)) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int middleMan = unsortedList.get(i);
				unsortedList.set(i, unsortedList.get(minIndex));
				unsortedList.set(minIndex, middleMan);
			}
		}
	}
}
