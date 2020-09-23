package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Walter", "Jos�", "Santos");
		printList(myStrs);
	}

	public static void printList(List<?> list) {
//		list.add(3);  // N�o � poss�vel adicionar itens na lista curinga, pq o compilador n�o sabe se o que est� sendo 
	                 // adicionado � do mesmo tipo da lista.
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}