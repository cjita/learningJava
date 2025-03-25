/******************************************************************************
This is example for generics, Generics is used in a class such that it accepts all types of data like integer, double, float etc without the need to duplicate UnsupportedClassVersionError
while defining the class we usually give <T> which is typic standard notation of generics accepted in java community
*******************************************************************************/

class Printer<T>{
    T variable;
    public Printer(T variable){
        this.variable = variable;
    }
    
    public void print(){
        System.out.println(variable);
    }
}

public class Main
{
	public static void main(String[] args) {
		Printer<String> printer = new Printer("test");
		printer.print();
	}
}
