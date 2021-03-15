package com.teksystems;

public class Sequence {

	public void getLength() {

		int [] seq = {10, 22, 9, 33, 21, 50, 41, 60};
		int len = seq.length;
		int seq_arr[] = new int[len];;
		int arr_len = seq_arr.length;
		
		int i, j = 0, max = 0;
		for (i = 0; i < arr_len; i++)
			seq_arr[i] = 1;
		for (i = 1; i < arr_len-1; i++)
			for (j = 0; j < i; j++)
				if (seq[i] > seq[j] && seq_arr[i] < seq_arr[j] + 1)
					seq_arr[i] = seq_arr[j] + 1;
		for (i = 0; i < arr_len; i++)
			if (max < seq_arr[i])
				max = seq_arr[i];
		System.out.println("Length of Longest sebsequence :: "+max);
	}

}
