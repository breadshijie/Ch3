package Ch3_p12;

import Ch3_p12.Car;

public class Ch3_p12 {
	public static void main(String[] args) 
	{
		Car car1;
		car1 = new Car();
		
		car1.num=1234;
		car1.gas=20.5;
		
		car1.showCar();
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
	
	void showCar() 
	{
		System.out.println("�}�l��ܨ��l���");
		show();
	}
}