package edu.unca.csci201;

import java.util.Scanner;

 class Quiz {

	private Question[] prompts;
	
	public Quiz() {
		
		prompts = new Question[20];
		
		/*prompts[0]= new MultipleChoice("What was the top grossing film made in the 1980's?\n"
			+ "(a)Star Wars, The Empire Strikes Back\n(b)ET\n(c)Back to the Future", "b");
		prompts[1] = new MultipleChoice ("In which installment of the Indianna Jones trilogy does our hero battle Hiltler and the Nazis?\n"
			+ "(a)Last Crusade\n(b)Temple of Doom\n(c)Raiders of the Lost Ark", "c");
		prompts[2]= new MultipleChoice("In what city is Ferris Buleers Day Off Filmed?\n"
				+"(a)Detroit\n(b)Chicago\n(c)Phillidelphia", "b");
		prompts[3] = new MultipleChoice("What 80's film was the first to air music videos on MTV?\n"
				+ "(a)Ghostbusters\n(b)Beverly Hills Cop\n(c)Flashdance", "c");
		prompts[4] = new MultipleChoice("In 1987 the immortal words \'Hello, my name is Inigo Montoya. You killed my father. Prepare to die!\'were spoken in which film?\n"
				+ "(a)Princess Bride\n(b)Batman\n(c)The Color Purple", "a");
		prompts[5] = new MultipleChoice("What artist sang the 1986 song “Danger Zone” from Top Gun?\n"
				+ "(a)Boy George\n(b)Bruce Springsteen\n(c)Kenny Loggins", "c");
		prompts[6] = new MultipleChoice("In 'Dirty Dancing' what was Baby's real name?\n" 
				+ "(a)Susan\n(b)Courage\n(c)Frances", "c");
		prompts[7] = new TrueOrFalse("In nightmare on Elm Street Alice kills Freddy by setting him on fire?\n"
				+"true or false","false", "She shows him his own reflection" );
		prompts[8] = new TrueOrFalse("Yoda tells Obi One in Empire Strikes back that there will be another Jedi.\n"
				+"true or false","true", "it was Princess Leia" );
		prompts[9] = new TrueOrFalse("Jennifer Beals used a body double for her stripper scenes in Flashdance?\n"
				+"true or false","true", "Marine Jahan was the actress cast as the body double" );
		prompts[10] = new TrueOrFalse("Jennifer Beals used a body double for her stripper scenes in Flashdance?\n"
				+"true or false","true", "Marine Jahan was the actress cast as the body double" );
		prompts[11] = new TrueOrFalse("Jennifer Beals used a body double for her stripper scenes in Flashdance?\n"
				+"true or false","true", "Marine Jahan was the actress cast as the body double" );
		prompts[12] = new TrueOrFalse("Jennifer Beals used a body double for her stripper scenes in Flashdance?\n"
				+"true or false","true", "Marine Jahan was the actress cast as the body double" );
		prompts[13] = new TrueOrFalse("Jennifer Beals used a body double for her stripper scenes in Flashdance?\n"
				+"true or false","true", "Marine Jahan was the actress cast as the body double" );
		prompts[14] = new ShortAnswer("These tiny creatures perform a weird celebration dance at the end of Return Of The Jedi. What are they called?"
				,"Ewoks" );
		prompts[15] = new ShortAnswer("Who played Batman in the 1989 film?"
				,"Michael Keaton" );
		prompts[16] = new ShortAnswer("In 1986 Whoopie Goldberg won the Golden Globe for best actress in this film directed by Steven Speilberg?"
				,"The Color Purple" );
		prompts[17] = new ShortAnswer("The quote, \'Where we\'re going we don\'t need roads.\' is a quote from which 1985 film?"
				,"Back To The Future" );
		prompts[18] = new ShortAnswer("What 1980's film was about, \'a brian, an athlete, a basket case and a crminal\'?"
				,"The Breakfast Club" );
		prompts[19] = new ShortAnswer("Back to the Future was originally called something else. What was this 1985 films original title?"
				,"Spacemen From Pluto" );
		*/
				
	}
		
	
	public Question addQuestion(Question q) {
		
			prompts[0]= new MultipleChoice("What was the top grossing film made in the 1980's?\n"
				+ "(a)Star Wars, The Empire Strikes Back\n(b)ET\n(c)Back to the Future", "b");
			prompts[1] = new MultipleChoice ("In which installment of the Indianna Jones trilogy does our hero battle Hiltler and the Nazis?\n"
				+ "(a)Last Crusade\n(b)Temple of Doom\n(c)Raiders of the Lost Ark", "c");
			prompts[2]= new MultipleChoice("In what city is Ferris Buleers Day Off Filmed?\n"
					+"(a)Detroit\n(b)Chicago\n(c)Phillidelphia", "b");
			prompts[3] = new MultipleChoice("What 80's film was the first to air music videos on MTV?\n"
					+ "(a)Ghostbusters\n(b)Beverly Hills Cop\n(c)Flashdance", "c");
			prompts[4] = new MultipleChoice("In 1987 the immortal words \'Hello, my name is Inigo Montoya. You killed my father. Prepare to die!\'were spoken in which film?\n"
					+ "(a)Princess Bride\n(b)Batman\n(c)The Color Purple", "a");
			prompts[5] = new MultipleChoice("What artist sang the 1986 song “Danger Zone” from Top Gun?\n"
					+ "(a)Boy George\n(b)Bruce Springsteen\n(c)Kenny Loggins", "c");
			prompts[6] = new MultipleChoice("In 'Dirty Dancing' what was Baby's real name?\n" 
					+ "(a)Susan\n(b)Courage\n(c)Frances", "c");
			prompts[7] = new TrueOrFalse("In nightmare on Elm Street Alice kills Freddy by setting him on fire?\n"
					+"true or false","false", "She shows him his own reflection" );
			prompts[8] = new TrueOrFalse("Yoda tells Obi One in Empire Strikes back that there will be another Jedi.\n"
					+"true or false","true", "it was Princess Leia" );
			prompts[9] = new TrueOrFalse("Jennifer Beals used a body double for her stripper scenes in Flashdance?\n"
					+"true or false","true", "Marine Jahan was the actress cast as the body double" );
			prompts[10] = new TrueOrFalse("Jennifer Beals used a body double for her stripper scenes in Flashdance?\n"
					+"true or false","true", "Marine Jahan was the actress cast as the body double" );
			prompts[11] = new TrueOrFalse("Jennifer Beals used a body double for her stripper scenes in Flashdance?\n"
					+"true or false","true", "Marine Jahan was the actress cast as the body double" );
			prompts[12] = new TrueOrFalse("Jennifer Beals used a body double for her stripper scenes in Flashdance?\n"
					+"true or false","true", "Marine Jahan was the actress cast as the body double" );
			prompts[13] = new TrueOrFalse("Jennifer Beals used a body double for her stripper scenes in Flashdance?\n"
					+"true or false","true", "Marine Jahan was the actress cast as the body double" );
			prompts[14] = new ShortAnswer("These tiny creatures perform a weird celebration dance at the end of Return Of The Jedi. What are they called?"
					,"Ewoks" );
			prompts[15] = new ShortAnswer("Who played Batman in the 1989 film?"
					,"Michael Keaton" );
			prompts[16] = new ShortAnswer("In 1986 Whoopie Goldberg won the Golden Globe for best actress in this film directed by Steven Speilberg?"
					,"The Color Purple" );
			prompts[17] = new ShortAnswer("The quote, \'Where we\'re going we don\'t need roads.\' is a quote from which 1985 film?"
					,"Back To The Future" );
			prompts[18] = new ShortAnswer("What 1980's film was about, \'a brian, an athlete, a basket case and a crminal\'?"
					,"The Breakfast Club" );
			prompts[19] = new ShortAnswer("Back to the Future was originally called something else. What was this 1985 films original title?"
					,"Spacemen From Pluto" );
			
		
		Question newQuestion = null;	
		
		for (int i = 0; i < prompts.length; i++) {
			
			newQuestion = prompts[i];
			//System.out.println(newQuestion.getTheQuestionText()+"\n");			
		}
		return newQuestion;	
	}
	
	
	
	public double giveQuiz() {
		
		double score = 0;
		Question askNew = null;
		
		Scanner userInput = new Scanner(System.in);
		String answerAttempt = userInput.nextLine();
		
		askNew = addQuestion(askNew);
		System.out.println(askNew.getTheQuestionText());
		
		/*for (int i =0; i < prompts.length; i++) {
			//Question newQuestion = prompts[i];
			askNew = addQuestion(askNew);
			System.out.println(askNew.getTheQuestionText());
			//System.out.println();
			answerAttempt = userInput.nextLine();
			if (answerAttempt.equals(prompts[i].getCorrectAnswer())){
				
			score++;
			}
			System.out.println("You got " + score + " out of " + prompts.length + " possible" );
			
		}*/
		return score;
		
		
	}	
		

		
	}
	


