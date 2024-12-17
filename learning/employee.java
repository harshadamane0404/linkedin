package sample;
//made this chnage in ain branch
//made this chnage from main brach
public class employee {

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
