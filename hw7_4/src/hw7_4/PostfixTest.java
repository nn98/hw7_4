package hw7_4;

import java.util.Scanner;
import java.util.Stack;
import java.util.EmptyStackException;

public class PostfixTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("hw7_4: 김윤서\n\n후위표기수식 입력: ");
		Scanner s=new Scanner(System.in);
		Stack<Double> stack=new Stack<Double>();
		try {
		String input=s.nextLine();
		String[] test=input.split(" ");
		for(String text:test) {

			switch(text) {
			case "+":
				double n2=stack.pop();
				double n1=stack.pop();
				stack.push(n1+n2);
				break;
			case "-":
				double n21=stack.pop();
				double n11=stack.pop();
				stack.push(n11-n21);
				break;
			case "*":
				double n211=stack.pop();
				double n111=stack.pop();
				stack.push(n111*n211);
				break;
			case "/":
				double n2111=stack.pop();
				double n1111=stack.pop();
				stack.push(n1111/n2111);
				break;
			default:
				stack.push(Double.parseDouble(text));
			}
		}
		
			double result=stack.pop();
			if(stack.isEmpty())	System.out.print("결과 = "+result);
			else System.out.println("잘못된 수식입니다.");
		}
		catch(EmptyStackException e) {
			System.out.println("잘못된 수식입니다.");
		}
	}

}
