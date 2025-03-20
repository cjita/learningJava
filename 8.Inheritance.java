//inheritance concept using simple calculator

class Calc{
    
    public int add(int a,int b)
    {
        return a+b;
    }
    
    public int sub(int a,int b)
    {
        return a-b;
    }
}

class AdvCalc extends Calc{
    
    public int mul(int a,int b)
    {
        return a*b;
    }
    
    public int div(int a,int b)
    {
        return a/b;
    }
}


public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		AdvCalc obj = new AdvCalc();
		System.out.println(obj.add(6,3));
		System.out.println(obj.sub(6,3));
		System.out.println(obj.mul(6,3));
		System.out.println(obj.div(6,3));
		
		
	}
}
