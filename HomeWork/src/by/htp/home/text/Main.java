/* Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить
текст, вывести на консоль текст, заголовок текста. */

package by.htp.home.text;

public class Main {

	public static void main(String[] args) {
		
		Word w = new Word("Hello");
		Word w1 = new Word("my");
		Word w2 = new Word("dear");
		Word w3 = new Word("friend.");
		
		Word w01 = new Word("How");
		Word w02 = new Word("are");
		Word w03 = new Word("your");
		Word w04 = new Word("doing?");

		Sentence sent = new Sentence();
		sent.addWord(w);
		sent.addWord(w1);
		sent.addWord(w2);
		sent.addWord(w3);
		
		Sentence sent1 = new Sentence();
		sent1.addWord(w01);
		sent1.addWord(w02);
		sent1.addWord(w03);
		sent1.addWord(w04);
		
		Text text = new Text();
		text.setHead("The best friend!");
		text.addSentence(sent);
		text.addSentence(sent1);
		
		PrintText pt = new PrintText();
		pt.printText(text);
	}

}
