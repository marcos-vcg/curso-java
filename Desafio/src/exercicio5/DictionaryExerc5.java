package exercicio5;

import java.util.HashMap;

public class DictionaryExerc5 {
	
	public HashMap<Integer, String> getDictionary() {
		HashMap<Integer, String> dictionary5 = new HashMap<Integer, String>();
		
		dictionary5.put(4, "a");
		dictionary5.put(3, "e");
		dictionary5.put(1, "i");
		dictionary5.put(5, "s");
		
		return dictionary5;
	}
	
	//função recebe uma string e retorna a string com a substituição da chave pelo valor do DictionaryExerc5
	public String ReplaceKeyByValues(String pString) {
		HashMap<Integer, String> dictionary5 = getDictionary();
		
		for(Integer key: dictionary5.keySet()) {
			pString = pString.replaceAll(key.toString(), dictionary5.get(key));
		}
		
		return pString;
	}

}
