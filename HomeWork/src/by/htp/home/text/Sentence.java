package by.htp.home.text;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

	private List<Word> words;
	
	public Sentence() {
		this.words = new ArrayList<>();
	}
	
	public List<Word> getWords() {
		return words;
	}
	
	public void setWords(List<Word> words) {
		this.words = words;
	}
	
	public void addWord(Word word) {
		words.add(word);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((words == null) ? 0 : words.hashCode());
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
		Sentence other = (Sentence) obj;
		if (words == null) {
			if (other.words != null)
				return false;
		} else if (!words.equals(other.words))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sentence [words=" + words + "]";
	}
	
}
