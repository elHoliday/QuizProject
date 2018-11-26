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
		return text;
	}

	@Override
	public boolean isCorrectAnswer(String answer) {
		
		return true;
	}

	@Override
	public String getCorrectAnswer() {
		// TODO Auto-generated method stub
		return answer;
	}

}
