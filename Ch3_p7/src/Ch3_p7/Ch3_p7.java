package Ch3_p7;

import Ch3_p7.Car;

public class Ch3_p7 {
	public static void main(String[] args) 
	{
		Car car1;
		car1 = new Car();
		
		Car car2;
		car2 = new Car();
		
		car1.num=1234;
		car1.gas=20.5;
		
		car2.num=2345;
		car2.gas=30.5;
		
		System.out.println("Ŧ많촑"+car1.num);
		System.out.println("Ŧ많촑"+car1.gas);
		
		System.out.println("Ŧ많촑"+car2.num);
		System.out.println("Ŧ많촑"+car2.gas);
	}
}

class Car
{
	int num;
	double gas;
}
