package Work2;

public class Main {

	public static void main(String[] args) {
		
		SumInter inter = (a,b)->{
			
			return a+b;
			
		};
		System.out.println(inter.sum(5, 10));
		System.out.println(inter.sum(10, 30));
		
		LenthInter inter2 =(str -> str.length());
		
		System.out.println("Lenth is : "+inter2.getLenth("Ajit Patil"));

	}

}
