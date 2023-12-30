package Star1;

class Outer {
	void run() {
		System.out.println("Outer class");
	}

	static class inner {
		static void disp() {
			System.out.println("Inneer class");
			
		}

		void run() {
		
			System.out.println("Outer class");
			
		}
	}

}

public class StaticNestedClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.inner i = new Outer.inner();
		Outer.inner.disp();
		i.run();
		o.run();
	}
}
