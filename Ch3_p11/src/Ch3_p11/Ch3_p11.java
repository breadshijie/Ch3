package Ch3_p11;

import Ch3_p11.Car;

public class Ch3_p11 {
	public static void main(String[] args) 
	{
		Car car1;
		car1 = new Car();
		
		car1.num=1234;
		car1.gas=20.5;
		
		car1.show();
	}
}

class Car
{
	int num;
	double gas;
	
	void show() 
	{
		System.out.println("�����O"+num);
		System.out.println("�����O"+gas);
	}
}