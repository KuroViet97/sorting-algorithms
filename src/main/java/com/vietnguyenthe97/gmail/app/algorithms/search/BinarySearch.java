package com.vietnguyenthe97.gmail.app.algorithms.search;

import java.util.List;

public class BinarySearch {
	public static int search(List<Integer> list, int firstIndex, int lastIndex, int findingValue) {
		if (lastIndex < firstIndex) {
			return -1;
		} else {
			int middleIndex = firstIndex + (lastIndex - firstIndex)/2;
			if (list.get(middleIndex) == findingValue) {
				return middleIndex;
			} else {
				if (list.get(middleIndex) < findingValue) {
					return search(list, middleIndex + 1, lastIndex, findingValue);
				} else {
					return search(list, firstIndex, middleIndex - 1, findingValue);
				}
			}
		}
	}
	
	public static int searchIteratively(List<Integer> list, int firstIndex, int lastIndex, int findingValue) {
		int foundIndex = -1;
		while (lastIndex >= firstIndex) {
			int middleIndex = firstIndex + (lastIndex - firstIndex)/2;
			if (list.get(middleIndex) == findingValue) {
				foundIndex = middleIndex;
				break;
			}
			
			if (list.get(middleIndex) < findingValue) {
				firstIndex = middleIndex + 1;
			}
			
			if (list.get(middleIndex) > findingValue) {
				lastIndex = middleIndex - 1;
			}
		}
		return foundIndex;
	}
}  
