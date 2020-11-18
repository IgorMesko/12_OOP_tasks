package by.htp.home.text;

import java.util.ArrayList;
import java.util.List;

public class Text {
	
	private String head;
	private List<Sentence> sentenses;
	
	public Text() {
		this.sentenses = new ArrayList<>();
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public List<Sentence> getSentenses() {
		return sentenses;
	}

	public void setSentenses(List<Sentence> sentenses) {
		this.sentenses = sentenses;
	}
	
	public void addSentence(Sentence sentence) {
		sentenses.add(sentence);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((head == null) ? 0 : head.hashCode());
		result = prime * result + ((sentenses == null) ? 0 : sentenses.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		if (head == null) {
			if (other.head != null)
				return false;
		} else if (!head.equals(other.head))
			return false;
		if (sentenses == null) {
			if (other.sentenses != null)
				return false;
		} else if (!sentenses.equals(other.sentenses))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Text [head=" + head + ", sentenses=" + sentenses + "]";
	}
	
}
