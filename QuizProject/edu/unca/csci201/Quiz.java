package edu.unca.csci201;

import java.util.Scanner;

public class Quiz {
	
	private Question[] Prompts;
	
	
	public void addQuestion() {
		
		String qst1 ="What was the top grossing film made in the 1980's?\n"
				+ "(a)Star Wars, The Empire Strikes Back\n(b)ET\n(c)Back to the Future";
		String qst2 = "In which installment of the Indianna Jones trilogy does our hero battle hiltler and the Nazis?\n"
				+ "(a)Last Crusade\n(b)Temple of Doom\n(c)Raiders of the Lost Ark";
		
		Prompts = new Question[15];
		Prompts[0]= new MultipleChoice (qst1, "b");
		Prompts[1]= new MultipleChoice (qst2, "c");
				
		
	}
	
	public double giveQuiz(Question[] q) {
		double score=0;
		
		Scanner userInput = new Scanner(System.in);
		//String answer = userInput.nextLine();
		
		for (int i =0; i < q.length; i++) {
			System.out.println(q[i].getTheQuestionText());
			String answer = userInput.nextLine();
			if (answer.equals(q[i].getCorrectAnswer())){
				
			score++;
			}
			System.out.println("You got " + score + " out of " + q.length + " possible" );
			
		}
		return score;
		
		
	}	
		
		
		
	}
	


