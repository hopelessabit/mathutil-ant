/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hopeless.mathutil.main;

import com.hopeless.mathutil.core.MathUtility;

/**
 *
 * @author mical
 */
public class Main {

    public static void main(String[] args) {
//        testFactorialGivenWrongArgumentThrowsException();
        testFactorialGivenRightArgumentRunsWell();
//        testFactorialGivenWrongArgumentThrowsException();
        
    }

    //Thiết kế hàm getF() là: chỉ tính N! từ 0..20!
    //NẾU ĐƯA N < 0 HOẶC N > 20 THÌ HÀM SẼ KHÔNG TÍNH, CHỬI
    //                          BẰNG CÁCH NÉM RA NGOẠI LỆ
    //Thực tế hàm getF() khi chạy có làm được như thiết kế hay không
    //phải test thử mới biết được
    public static void testFactorialGivenWrongArgumentThrowsException() {
        //Test case #4: Test getF() with n = -5, wrong argument
        //Expected value: an exception is thrown
        //                IllegalArgumentException
        System.out.println("Test -5!: Expected: Illegal Argument Exception is thrown! ");
        MathUtility.getFactorial(-5);
    }
    
    //dân dev phải có trách nhiệm test code của mình chạy đúng sai
    //trước khi lắp rap nó với các class khác để hình thành chức năng
    //Có nhiều quy tắc đặt tên hàm cho việc kiểm thử hàm
    //Thường tên hàm sẽ bao hàm ý nghĩa của việc kiểm thử
    //VD hàm dưới đây sẽ dùng để test hàm tính giai thừa
    //trong tình huống - cáe đưa n đúng chuẩn, thì ta hy vọng - expected
    //hàm chạy ngon như thiết kế, vd n = 5 thì hàm phải trả về 120
    //tức là 5~ hy vọng hàm tính ra 120
    public static void testFactorialGivenRightArgumentRunsWell() {
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);
        
        //Test Case #1: Test getFactorial with n = 0
        //Expected vaule: 1 - Hy vọng đưa n = 0 thì hàm trả về 1
        System.out.println("Test " + n + "!: Expected = " + expectedValue
                + " | Actual = " + actualValue);
        
        //Test Case #2: Test getFactorial with n = 1
        //Expected vaule: 1 - Hy vọng đưa n = 1 thì hàm trả về 1
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n + "!: Expected = " + expectedValue
                + " | Actual = " + actualValue);

        //Test Case #3: Test getFactorial with n = 3
        //Expected vaule: 6 - Hy vọng đưa n = 3 thì hàm trả về 6
        expectedValue = 6;
        System.out.println("Test 3!: Expected = " + expectedValue
                + " | Actual = " + MathUtility.getFactorial(3));
    }
}
