package com.demo.ExceptionHandeling;

import java.io.IOException;

public class Exception_exampels {

}
// 1 yes
class parent101
{
	void m1 () throws Exception
	{
		
	}
}
class child101 extends parent101
{
	@Override
	void m1() throws ArithmeticException
	{
		
	}
}
// ----------------------------------------------------------------------------------------------------------------------------
//2 yes
class Parent102
{
	void m1 () throws IndexOutOfBoundsException
	{
		
	}
}
class Child102 extends Parent102
{
	@Override
	void m1() throws IndexOutOfBoundsException

	{
		
	}
}
//----------------------------------------------------------------------------------------------------------------------------
// 3 yes
class Parent103
{
	void m1 () throws NumberFormatException
	{
		
	}
}
class Child103 extends Parent103
{
	@Override
	void m1() throws IllegalArgumentException
	{
		
	}
}
//----------------------------------------------------------------------------------------------------------------------------
// 4 yes
class Parent104
{
	void m1 () throws NullPointerException
	{
		
	}
}
class Child104 extends Parent104
{
	@Override
	void m1() throws RuntimeException
	{
		
	}
}
//----------------------------------------------------------------------------------------------------------------------------
//5 yes
class Parent105
{
	void m1 () throws IOException

	{
		
	}
}
class Child105 extends Parent105
{
	@Override
	void m1() 
	{
		
	}
}
//----------------------------------------------------------------------------------------------------------------------------
//6  error
class Parent106
{
	void m1 () throws RuntimeException
	{
		
	}
}
class Child106 extends Parent106
{
	@Override
	void m1() throws IOException
	{
		
	}
}

//----------------------------------------------------------------------------------------------------------------------------
//7
class Parent107
{
	void m1 () throws IOException 
	{
		
	}
}
class Child107 extends Parent107
{
	@Override
	void m1() throws FileNotFoundException
	{
		
	}
}

//----------------------------------------------------------------------------------------------------------------------------
//8 no error
class Parent108
{
	void m1 () throws ClassNotFoundException
	{
		
	}
}
class Child108 extends Parent108
{
	@Override
	void m1() throws IOException
	{
		
	}
}




























































