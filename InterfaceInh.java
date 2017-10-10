interface i1
{
double pi=3.147;
void meth1();
}
interface i2 extends i1
{
void methi2();
}
class Mybase
{
	void myBasemeth()
	{
		System.out.println("call to My.Base meth");
	}
}
public class InterfaceInh extends Mybase implements i2
{
public double circle_circum(double r)
{
	return(2*pi*r);
}
	@Override
	public void meth1() {
		System.out.println("call to meth1");
		}

	@Override
	public void methi2() {
		System.out.println("call to methi2");
		
	}
	public static void main(String a[])
	{
		InterfaceInh obj=new InterfaceInh();
		double ans=obj.circle_circum(4);
		System.out.println("circumfrence="+ans);
	}
	

	}
	
	








	



