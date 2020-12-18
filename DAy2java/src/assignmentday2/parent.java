package assignmentday2;

public class parent {
	void teaches() {
		System.out.println("teaching");
	}
}

class child1 extends parent {
	void listen() {
		System.out.println("child is sincere");
	}

}

class child2 extends parent {
	void dontlisten() {
		System.out.println("naughty child");
	}
}

class testinheritance {
	public static void main(String args[]) {
					child1 c1 = new child1();
					child2 c2 = new child2();
					c1.listen();
					c2.dontlisten();}
}


