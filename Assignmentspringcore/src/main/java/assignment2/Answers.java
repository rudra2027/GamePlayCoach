package assignment2;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class Answers {
	

private List<String> Answerlist;
private Set<String>Answerset;
private Map<Integer, String>Answermap;

public Answers() {};

public Answers(List<String> answerlist, Set<String> answerset, Map<Integer, String> answermap) {
	super();
	Answerlist = answerlist;
	Answerset = answerset;
	Answermap = answermap;
}
public List<String> getAnswerlist() {
	return Answerlist;
}
public void setAnswerlist(List<String> answerlist) {
	Answerlist = answerlist;
}
public Set<String> getAnswerset() {
	return Answerset;
}
public void setAnswerset(Set<String> answerset) {
	Answerset = answerset;
}
public Map<Integer, String> getAnswermap() {
	return Answermap;
}
public void setAnswermap(Map<Integer, String> answermap) {
	Answermap = answermap;
}

}
