package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Walter", "José", "Santos");
		printList(myStrs);
	}

	public static void printList(List<?> list) {
//		list.add(3);  // Não é possível adicionar itens na lista curinga, pq o compilador não sabe se o que está sendo 
	                 // adicionado é do mesmo tipo da lista.
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}