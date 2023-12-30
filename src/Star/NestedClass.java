package Star;

class Outer {
	void run() {
		System.out.println("Outer class");
	}

	class inner {
		void disp() {
			System.out.println("Inneer class");
			run();
		}
	}

}

public class NestedClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.inner i = o.new inner();
		i.disp();
		
	}
}
