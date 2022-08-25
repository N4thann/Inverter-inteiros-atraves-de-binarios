package DesafioMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class TransformarBinarios {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		Scanner teclado = new Scanner(System.in);
		int resposta = 0;
			
		do{
			System.out.println("Digite o número que deseja inverter: ");
			int b2 = teclado.nextInt();
			nums.add(b2);
			System.out.println("Deseja continuar? (1) Sim (0) Não");
			resposta = teclado.nextInt();
			
		}while(resposta != 0);
		
		UnaryOperator<String> inverter = 
				s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> binarioParaInt =
				s -> Integer.parseInt(s, 2);
		
		System.out.println("\nNúmeros digitados: ");
		nums.forEach(System.out::println);
		
		
		System.out.println("\nNúmeros transformados: ");
		nums.stream()
			.map(Integer::toBinaryString)//O próprio Java já tem uma função de passar inteiro para String
			.map(inverter)
			.map(binarioParaInt)
			.forEach(System.out::println);
		
		teclado.close();
		
	}
	
}
