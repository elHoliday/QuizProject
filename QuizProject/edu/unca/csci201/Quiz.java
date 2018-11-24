package edu.unca.csci201;

import java.util.Scanner;

 class Quiz {
	
	private Question[] prompts;
	
	public Quiz() {
		
		prompts = new Question[20];
		
		prompts[0]= new MultipleChoice("What was the top grossing film made in the 1980's?\n"
			+ "(a)Star Wars, The Empire Strikes Back\n(b)ET\n(c)Back to the Future", "b");
		prompts[1] = new MultipleChoice ("In which installment of the Indianna Jones trilogy does our hero battle Hiltler and the Nazis?\n"
			+ "(a)Last Crusade\n(b)Temple of Doom\n(c)Raiders of the Lost Ark", "c");
		prompts[2]= new MultipleChoice("In what city is Ferris Buleers Day Off Filmed?\n"
				+"(a)Detroit\n(b)Chicago\n(c)Phillidelphia", "b");
		prompts[3] = new MultipleChoice("What 80's film was the first to air music videos on MTV?"
				+ "(a)Ghostbusters\n(b)Beverly Hills Cop/n(c)Flashdance", "c");
		prompts[4] = new MultipleChoice("In 1987 the immortal words \'Hello, my name is Inigo Montoya. You killed my father. Prepare to die!\'were spoken in which film "
				+ "(a)Princess Bride\n(b)Batman\n(c)The Color Purple", "a");
		prompts[5] = new MultipleChoice("What artist sang the 1986 song “Danger Zone” from Top Gun?\n"
				+ "(a)Boy George\n(b)Bruce Springsteen\n(c)Kenny Loggins", "c");
		prompts[6] = new MultipleChoice("In 'Dirty Dancing' what was Baby's real name?\n" 
				+ "(a)Susan\n(b)Courage\n(c)Frances", "c");
		prompts[7] = new TrueOrFalse("In nightmare on Elm Street Alice kills Freddy by setting him on fire?\n"
				+"true or false","false", "She shows him his own reflection" );
		prompts[8] = new TrueOrFalse("Yoda tells Obi One in Empire Strikes back that there will be another Jedi\n"
				+"true or false","true", "it's Leia" );
		prompts[7] = new TrueOrFalse("Back to the Future was originally called something else\n"
				+"true or false", "true","Spacemen From Pluto" );
		
				
	}
		
	
	public void addQuestion(Question q) {
		

				
		
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
	


