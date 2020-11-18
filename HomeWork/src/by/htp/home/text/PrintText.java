package by.htp.home.text;

public class PrintText {
	
	public void printText(Text text) {
		System.out.println(text.getHead());
		
		for(Sentence sent : text.getSentenses()) {
			for(Word w : sent.getWords()) {
				System.out.print(w + " ");
			}
			System.out.println();
		}
	}
}
