package sample;
public class employee {
=======
//made this chnage from main brach
public class employeefromFeat_scheduled {
//this is in feat_scheduled brancb
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
