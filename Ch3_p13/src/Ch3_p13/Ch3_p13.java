package Ch3_p13;

import Ch3_p13.Car;

public class Ch3_p13 {
	public static void main(String[] args) 
	{
		int n=1234;
		Car car1;
		car1 = new Car();
		
		car1.setNum(1234);
	}
}

class Car
{
	void setNum(int n)
	{
		int num=n;
		System.out.println("¨®¸¹¬O"+num);
	}
}