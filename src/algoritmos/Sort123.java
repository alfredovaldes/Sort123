package algoritmos;

public class Sort123 {

	public static int[] Return1(int Arreglo1[]){
		int c=0;
		for(int i=1;i<1024;i=i+3){
			Arreglo1[c]=i;
			c++;
		}
		return Arreglo1;
	}
	public static int[] Return2(int Arreglo2[]){
		int c=0;
		for(int i=2;i<1024;i=i+3){
			Arreglo2[c]=i;
			c++;
		}
		return Arreglo2;
	}
	public static int[] Return3(int Arreglo3[]){
		int c=0;
		for(int i=3;i<1024;i=i+3){
			Arreglo3[c]=i;
			c++;
		}
		return Arreglo3;
	}
	public static void main(String Args[]){
		int[] Arreglo1 = new int[342];
		int[] Arreglo3= new int[342];
		int[] Arreglo2 = new int[342];
		Arreglo1=Return1(Arreglo1);
		Arreglo2=Return2(Arreglo2);
		Arreglo3=Return3(Arreglo3);
		for (int i=0;i<341;i++){
			System.out.print(Arreglo1[i]+"	");
			System.out.print(Arreglo2[i]+"	");
			System.out.println(Arreglo3[i]);
		}
		int valor=30;
		for (int i=1;i<342;i++){
			if(valor==Arreglo1[i-1]){
				int res=i;
				System.out.println(res);
			}
			if(valor==Arreglo2[i-1]){
				int res=i;
				System.out.println(res);
			}
			if(valor==Arreglo3[i-1]){
				int res=i;
				System.out.println(res);
			}
		}
	}
}