/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hopeless.mathutil.core.test;

import com.hopeless.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author mical
 */
@RunWith(value = Parameterized.class)
//Báo với JUnit rằng code trong class này ta sex tách data và hàm
//so sánh riêng biệt nhau - DATA DRIVEN TESTING
//Tách thì phải có kĩ thuật nhồi/fill data trở lại lệnh so sánh
//fill trở lại thông qua biến - biến chứa value được thay đổi
//DDT có anh em với Parameterized - tham số hoá data
public class MathUtilityAdvancedTest {
    //Chuẩn bị mảng 2 chiều để chứa data trong các test case sẽ dùng
    //Quy ước mảng phải là static public
    @Parameterized.Parameters
    public static Object[][] initData(){
        return new Object[][]{
                            {0, 1},
                            {1, 1},        
                            {2, 2},
                            {3, 6},
                            {4, 24},
                            {5, 120},
                            {6, 720}
                    };
    }
    
    //Map từng cặp data ở trên vào 2 biến và sẽ đẩy 2 biến này vào
    //hàm assertEquals() đã quen
    @Parameterized.Parameter(value = 0) //lấy cột 0 của mảng gán vào
    public int n;
    @Parameterized.Parameter(value = 1) //lấy cột 1 của mảng gán vào
    public long expected;
    
    //Test hoy
    @Test
    public void testFactorialGivenRightArgumentReturnsWell(){
        Assert.assertEquals(expected, MathUtility.getFactorial(n));
        
    }
    
    
}
