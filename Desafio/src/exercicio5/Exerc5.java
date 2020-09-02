package exercicio5;

public class Exerc5 {

	public static void main(String[] args) {

		String word = "T35t3 d3 35t4g1o";
		DictionaryExerc5 dict = new DictionaryExerc5();
		
		word = dict.ReplaceKeyByValues(word);
		
		System.out.println(word);
		
		}

}