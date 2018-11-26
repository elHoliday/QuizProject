package edu.unca.csci201;

public class ShortAnswer implements Question{
	
	private String text;
	private String answer;
	
	public ShortAnswer(String text, String answer) {
		this.text = text;
		this.answer = answer;
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
