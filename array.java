package sample;

public class array {

	public static void main(String[] args) {
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "test"};
		System.out.println(+cars.length);
		System.out.println(cars[0]);
		 cars=new String[20];
		
		int a1[]= {10,20,30,40};
		System.out.println(a1.length);
		
		int[] test;
		test=new int[5];
		
		test[0]=10;
		test[1]=20;
		test[2]=30;
		test[3]=40;
		test[4]=50;
		
		for(int i=0; i<test.length;i++)
		{
			System.out.println("Element of index" + i + " : " + test[i]);
			System.out.println(test[i]);
		}
	}
	
	
		
}