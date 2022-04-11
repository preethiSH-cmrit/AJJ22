package test;
import java.util.Random;

enum Answers {NO,  YES, MAYBE, LATER, SOON, NEVER}
public class Question {
	int pr;
	
	public String ask(String question) {
		Random rand = new Random();
		Answers ans =Answers.NO;
		pr=(int)(100*rand.nextDouble());
		System.out.println(question);
		System.out.println("Value of pr "+pr);
		if (pr>0 && pr<15) {
			ans = Answers.MAYBE;
		}else if (pr <30) {
			ans = Answers.NO;
		}else if (pr <60) {
			ans = Answers.YES;
		}else if(pr <75) {
			ans = Answers.LATER;
		}else if(pr <98) {
			ans = Answers.SOON;
		}else if(pr <100) {
			ans = Answers.NEVER;
		}
		switch(ans) {
		case MAYBE:
			return "Just Maybe";
		case NO:
			return "Definitely Not";
		case YES:
			return "Of course";
		case LATER:
			return "Maybe sometime later";
		case SOON:
			return "Soon perhaps";
		case NEVER:
			return "Probably never";
		}
		return "Invalid";
	}
	public Question() {
		
	
	}

}
