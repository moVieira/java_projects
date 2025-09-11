package cursojava.aula19;

public class Arrays {
	public static void main(String[] args) {
		
		double  temperaturaDia001 = 31.3;
		double  temperaturaDia002 = 32;
		double  temperaturaDia003 = 33.7;
		double  temperaturaDia004 = 34;
		double  temperaturaDia005 = 33.1;
		
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3; //dia 1
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 33.1;
		temperaturas[4] = 34.3;
		temperaturas[5] = 31.3;
		
		for(int i = 0; i < temperaturas.length; i++) {
		System.out.println("A temperatura do dia "+ (i+1) + "é: " + temperaturas[i]);
		
		}
		
	}

}
