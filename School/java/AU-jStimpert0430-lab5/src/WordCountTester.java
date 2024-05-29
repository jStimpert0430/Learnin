//Joshua Stimpert - Lab 5

public class WordCountTester {

	public static void main(String[] args) {
		for(String arg: args) {
			WordCount newThread = new WordCount(arg);
			newThread.start();
		}

	}

}
