package Application;

import java.util.Scanner;

public class QuestionService {

	Question[] questions=new Question[5];
	
	String selection[]=new String[5];
	
	public QuestionService() {
		questions[0]=new Question(1,"Full form of oops","object oriented programming system","Outrageously Overhyped Programming Syntax","object overreacted programming system","object overhyped programming system","object oriented programming system");
		questions[1]=new Question(2,"What is the main difference between == and the equals() method in Java when comparing objects?","Reference comparison, content comparison","Same type of comparison","Primitive types, objects","NonPrimitive types, objects","Reference comparison, content comparison");
		questions[2]=new Question(3,"Explain the concept of method overloading in Java","Belong to more than one class","Same name, different parameters","Call itself","Not supported","Same name, different parameters");
		questions[3]=new Question(4,"What is the purpose of the super keyword in Java?","Access superclass","Create instance","Declare variable","Invoke subclass constructor","Access superclass");
		questions[4]=new Question(5,"Which of the following is not a valid access modifier in Java?","public","protected","private","package","package");
	}
	
	
	public void playQuiz() {
		int i=0;
		for(Question q:questions) {
		System.out.println("Question:"+q.getId());
		System.out.println(q.getQuestion());
		System.out.println(q.getOpt1());
		System.out.println(q.getOpt2());
		System.out.println(q.getOpt3());
		System.out.println(q.getOpt4());
		Scanner sc=new Scanner(System.in);
		selection[i]=sc.nextLine();
		i++;
	}
		for(String s:selection) {
			System.out.println(s);
		}
	}


public void printScore()
{
	int score=0;
	for(int i=0;i<questions.length;i++) {
		Question que= questions[i];
		String actualAnswer=que.getAnswer();
		
		String userAnswer=selection[i];
		
		if(actualAnswer.equals(userAnswer)) {
			score++;
		}
	}
	System.out.println("score:"+score);
}
}