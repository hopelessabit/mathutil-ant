/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hopeless.mathutil.core.test;

import com.hopeless.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author mical
 */
public class MathUtilityTest {
    //Kiểm thử ngoại lệ thì sao ????
    //Tức là hàm getF() được thiết kế rằng nếu đưa n cà chớn
    //thì hàm phải ném ngoại lệ!!!
    //Tức là getF(-5) thì EXPECTED == NGOẠI LỆ ILLEGAL ARGUMENT EXCEPTION
    //THẤY NGOẠI LỆ MỪNG RƠI NƯỚC MẮT
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        //Test case 5: getF() with a wrong arg: n = -5;
        //Exception result: An exception is thrown: Illegal Argument Exception
        
        MathUtility.getFactorial(21);
        //Nếu chỉ gõ lệnh trên thì bị màu đỏ
        //DO LỆNH TRÊN GÂY RA EXCEPTION, VÀ EXCEPTION LÀ MÀU ĐỎ
        //NHƯNG HÀM NÀY MÌNH KÌ VỌNG RA EXCEPTION, NẾU CÓ EXCEPTION
        //THÌ HÀM ĐÚNG NHƯ THIẾT KẾ, ĐÚNG THIẾT KẾ THÌ PHẢI RA MÀU XANH
        //LỖI CỦA TA LÀ KHÔNG ĐO, KHÔNG SO SÁNH, KHÔNG/CHƯA NHẬN DIỆN LÀ ĐÃ CÓ NGOẠI LỆ RỒI
        //TA CẦN THÊM 1 CÂU LỆNH: ĐÃ CÓ NGOẠI LỆ CHƯA???
        //CÓ RỒI --> XANH
        //CHƯA CÓ --> ĐỎ
        //JUnit 4 không dùng assert() để đo ngoại lệ
        //nhưng JUnit 5 dùng hàm asssert() để đo ngoại lệ
        
    }
    
    
    
    @Test
    //Trong hàm này sẽ chứa các test case để test getF()
    //Với n hợp lệ trong khoảng 0..20
    public void testFactorialGivenRightArgumentReturnsWell(){
        
        //Test case #1: Test getF() with n = 0
        //Expected result = 1; // hy vọng 0! = 1
        int n = 0;
        long expectedValue = 1; //hy vọng 0! = 1
        long actualValue = MathUtility.getFactorial(n);   //thực tế getF() trả về mấy ???
        Assert.assertEquals(expectedValue, actualValue);
        
        //Test case #2: Test getF() with n =5;
        //Expected result = 120; // hy vọng 5! = 120
        Assert.assertEquals(120, MathUtility.getFactorial(5));
        
        //Test case #3: Test getF() with n =6;
        //Expected result = 720; // hy vọng 6! = 720
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        
        //Test case #4: Test getF() with n =4;
        //Expected result = 24; // hy vọng 4! = 24
        Assert.assertEquals(24, MathUtility.getFactorial(4));
        
        
    }
    
}
