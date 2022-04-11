package test;

enum Subjects {
	AJJ(4), SSC(3), WTA;
	private int credits;
	
	Subjects() {
		credits =0;
	}
	Subjects(int c){
		credits=c;
	}
	int getCredits() {
		return credits;
	}
	
}

public class enumerationsDemo {
	
	public enumerationsDemo() {
		Subjects s;
		for (Subjects sub: Subjects.values()) {
			System.out.println(sub + " "+sub.getCredits());
		}
	}

}
