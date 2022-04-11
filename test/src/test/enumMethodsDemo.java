package test;

enum Sub { AJJ, WTA, DAA }
enum course {AJJ, DAA, OS;
	
@Override
public boolean equals(Object o) {
	}
}
public class enumMethodsDemo {
	public static boolean eq_enum(Object o, Object a) {
		if(o==a) {
			return true;
		}
		
		return false;
	}
	
	public enumMethodsDemo() {
		Sub sub_ajj = Sub.AJJ;
		course s_ajj = course.AJJ;
		System.out.println(sub_ajj.equals(s_ajj));
		System.out.println(eq_enum(sub_ajj, s_ajj));
		
		
		for (Sub s: Sub.values()) {
			System.out.println(s + " "+ s.ordinal());
		}
		Sub a = Sub.AJJ;
		Sub b = Sub.DAA;
		if(a.compareTo(b)<0) {
			System.out.println("Ordinal Position of "+" "+a+
					"is less than "+" "+ b);
			
		}else if (a.compareTo(b)>0) {
			System.out.println("Ordinal Position of "+" "+a+
					"is greater than "+" "+ b);
			
		}
		else {
			System.out.println("Ordinal Position of "+" "+a+
					"is equal to "+" "+ b);
		}
		
		
		
	}

}
