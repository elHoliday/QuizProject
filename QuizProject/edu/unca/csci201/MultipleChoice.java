package edu.unca.csci201;

public class MultipleChoice implements Question {
	
	private String answer;
	private String text;

	public MultipleChoice(String text, String answer) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTheQuestionText() {
		
		//this.text = text;
		
		return text;
	}

	@Override
	public boolean isCorrectAnswer(String answer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getCorrectAnswer() {
		//this.answer = answer;
		return answer;
	}

}
