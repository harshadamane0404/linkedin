package sample;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
//Integer array list
ArrayList<Integer> a1= new ArrayList<Integer>();
a1.add(10);
a1.add(20);
System.out.println(a1);
System.out.println(a1.size());
a1.remove(0);
System.out.println(a1);
System.out.println(a1.size());
a1.add(0,100);
a1.add(1,100);
a1.add(3,100);
System.out.println(a1);
a1.clear();
System.out.println(a1);


//String arraylist
ArrayList<String> s1= new ArrayList<String>();
s1.add("harshada");
s1.add("Anwesha");
s1.add("Atul");
System.out.println(s1);



	}

}
