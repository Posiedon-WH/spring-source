package com.mytest.leetcode;

import org.junit.Test;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/6/18 23:38
 */
public class ArrTest {

	@Test
	public void test1(){
		int[][] re=new int[][]{{1,1},{1,2},{1,3}};
		System.out.println(re.length);
		System.out.println(re[0].length);
		for (int[] ints : re) {
			System.out.println(ints[0]);
		}
	}
}
