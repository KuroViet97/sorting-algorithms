package com.vietnguyenthe97.gmail.app.algorithms.search;

import java.util.Arrays;
import java.util.List;

import com.vietnguyenthe97.gmail.app.algorithms.sorting.InsertionSort;

public class BinarySearch {
	public static int binarySearch(List<Integer> list, int firstIndex, int lastIndex, int findingValue) {
		if (lastIndex < firstIndex) {
			return -1;
		} else {
			int middleIndex = firstIndex + (lastIndex - firstIndex)/2;
			if (list.get(middleIndex) == findingValue) {
				return middleIndex;
			} else {
				if (list.get(middleIndex) < findingValue) {
					return binarySearch(list, middleIndex + 1, lastIndex, findingValue);
				} else {
					return binarySearch(list, firstIndex, middleIndex - 1, findingValue);
				}
			}
		}
	}
}
