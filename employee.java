package sample;
//made this chnage from main brach
public class employee {


<<<<<<< HEAD
//I am in feat_scheduled branch
=======
//I am in feat_scehduled branch
>>>>>>> main
	int empsalary;
	String empname;
	
	public employee(int empsalary, String empname)
	{
		this.empname = empname;
		this.empsalary=empsalary;
		
	}
	
	public String toString()
	{
		return "["+this.empname+","+this.empsalary+"]";
	
	}
}
