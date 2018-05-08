package model;
import java.io.IOException;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.result.WordResult;
public class Snippet {

	public static void main(String s[]) {
		Configuration configuration = new Configuration();

		// Set path to acoustic model.
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		// Set path to dictionary.
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		// Set language model.
		configuration.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");
		
		LiveSpeechRecognizer recognizer = null;
		try {
			recognizer = new LiveSpeechRecognizer(configuration);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Start recognition process pruning previously cached data.
		SpeechResult result = null;
		while(true) {
			recognizer.startRecognition(true);
			result = recognizer.getResult();
			System.out.println("============="+result.getHypothesis());
			// Get individual words and their times.
			for (WordResult r : result.getWords()) {
			    System.out.println(r);
			}
			recognizer.stopRecognition();
		}
		// Pause recognition process. It can be resumed then with startRecognition(false).
		//
	}
}
