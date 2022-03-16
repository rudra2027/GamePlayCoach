package assignment2;

import javax.annotation.PostConstruct;

public class Question {
	private int questionId;
	private String question;
	private Answers answers;
	public Question() {};
	public Question(int questionId, String question, Answers answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answers getAnswers() {
		return answers;
	}
	public void setAnswers(Answers answers) {
		this.answers = answers;
	}
	
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("Question Id:"+getQuestionId()+"\n"+"Question:"+getQuestion()+"\n"+"Answer:"+getAnswers().getAnswerlist()+","+getAnswers().getAnswermap()+" , "+getAnswers().getAnswerset());

	} 
	@PostConstruct
	   public void init(){
	      System.out.println("Bean is going through init.");
	   }
	
}
