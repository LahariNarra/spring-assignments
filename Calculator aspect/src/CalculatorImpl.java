package com.capgemini.spring.calculator.impl;

import com.capgemini.spring.calculator.*;
import org.springframework.stereotype.*;
@Component
public class CalculatorImpl implements Calculator{
	
	public void addition(int number1, int number2)throws ArithmeticException{
		if(number1 > 0 && number2  > 0 )
			System.out.println(number1+number2);
		else
		{
			System.out.println("Number should not be less than Zero");
			throw new ArithmeticException();
		}
	}

	public void division(double number1,double number2)throws ArithmeticException{
		if(number2 != 0)
			System.out.println(number1/number2);
		else
		{
			System.out.println("Number should not be  Zero");
			throw new ArithmeticException();
		}
	}
}