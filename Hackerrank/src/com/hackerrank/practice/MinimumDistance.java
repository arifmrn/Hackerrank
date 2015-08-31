package com.hackerrank.practice;
public class MinimumDistance {

	public static void main(String[] args) {
		int[] input =  {3, 4, 5};
		int x = 3;
		int y = 5;
		System.out.println(minDistance(input, x, y));
		boolean fl=true;
		System.out.println(fl+"  "+!fl);
	}

	static int minDistance(int[] arr, int x, int y) {
		int  distance, result = Integer.MAX_VALUE,x_temp= Integer.MAX_VALUE, y_temp= Integer.MAX_VALUE;
		int distancel=Integer.MAX_VALUE,distanceR=Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				x_temp = i;
				if(y_temp!=Integer.MAX_VALUE)
					{distancel = x_temp - y_temp;
					distanceR=Integer.MAX_VALUE;
					}
				while (i<arr.length&&arr[i] != y)
					i++;
				if (i<arr.length&&arr[i] == y) {
					y_temp = i;
					distanceR = y_temp - x_temp;
				}
			} else if (arr[i] == y) {
				y_temp = i;
				if(x_temp!=Integer.MAX_VALUE)
					{
					distancel = y_temp - x_temp;
					distanceR=Integer.MAX_VALUE;
					}
				while (i<arr.length&&arr[i] != x)
					i++;
				if (i<arr.length&&arr[i] == x) {
					x_temp = i;
					distanceR = x_temp - y_temp;
				}
			}
			distance=(distancel>distanceR)?distanceR: distancel;
			if (distance < result)
				result = distance;
		}
		return result;
	}

}
