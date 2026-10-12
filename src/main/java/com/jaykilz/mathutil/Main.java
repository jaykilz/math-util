package com.jaykilz.mathutil;

import com.jaykilz.mathutil.core.MathUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        // TDD - VIẾT CODE BẮT ĐẦU TỪ VIẾT TEST
        testFactorialGivenValidN5ReturnsWell120();

    }

    //test hàm tính giai thừa với n =5 và hy vọng trả về 120, thực tế đoán xem chờ có code đã
    public static void testFactorialGivenValidN5ReturnsWell120() {
        long expected = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(n);

        System.out.println("Check 5! | expected: " + expected + " | actual: " + actual);
    }

}

//CODE DÙNG ĐỂ TEST CODE CHÍNH, TEST CODE BASE, THÌ CODE NÀY GỌI LÀ TEST SCRIPT
//CODE NÀY VỀ LÝ THUYẾT KO CẦN SHIP CHO KHÁCH HÀNG

