package edu.unca.csci201;

public class TrueOrFalse implements Question {
	
	private String text;
	private String answer;
	private String correctAnswer;
	
	public TrueOrFalse(String text, String answer, String correctAnswer) {
		this.text = text;
		this.answer = answer;
		this.correctAnswer = correctAnswer;
	}


	@Override
	public String getTheQuestionText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCorrectAnswer(String answer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getCorrectAnswer() {
		// TODO Auto-generated method stub
		return null;
	}

}
