/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hopeless.mathutil.core;

/**
 *
 * @author mical
 */
public class MathUtility {
    public static final double PI = 3.1415;
	
	//Hàm tính N! = 1 x 2 x 3 x ... x N
	//Trong đó không có giai thừa âm
	//0! = 1! = 1
	//Vì giai thừa tăng giá trị rất nhanh, 20! vừa đủ cho 18 số 0
	//tức là 21! tràn kiểu LONG
	//Quy ước: hàm này chỉ tính từ 0.20!
	//Có 2 cách viết: Dùng For (truyền thống) và Recursion - đệ quy
	public static long getFactorial(int n){
            
		if (n < 0 || n > 20)
			throw new IllegalArgumentException("Invalid n. n must be between 0..20");
                
		if(n == 0 || n == 1)
			return 1;
		
		//Sống sót đến đoạn này, n từ 2..20 rồi???, for mà chơi
		long product = 1; //biến khởi động cho tích nhân dồn

		for (int i = 2; i <= n; i++)
			product *= i;
		
		return product;
	}
}
