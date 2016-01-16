package thedoublethisdillema;

class Dillema {
	private int a;			//a=0;
	private int b;
	Dillema() {
		System.out.println("Inside def constr.");
		a=1;
	}
	Dillema(int b) {
		this();
		this.b=b;
		System.out.println("Inside param. constr");
	}
	
	public int getValue() {
		return a+b;
	}
}

class TheDoubleThisDillema {
	public static void main(String[] args) {
			Dillema d1=new Dillema();
			System.out.println(d1.getValue());
			Dillema d2=new Dillema(3);
			System.out.println(d2.getValue());
			
	}
}