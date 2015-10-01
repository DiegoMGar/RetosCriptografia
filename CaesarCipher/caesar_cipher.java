import java.util.Scanner;

public class caesar_cipher {
	static int codigoMagico = 0;
	public static String caesar_encrypt(String phrase){
		/*
		Función a completar
		*/
		return "";
	}
	public static String caesar_decrypt(String phrase){
		/*
		Función a completar
		*/
		return "";
	}
	
	public static void main(String args[]){
		System.out.println("Caesar cipher - DiegoMGar crypto ex01");
		int num = 0;
		Scanner reader = new Scanner(System.in);
		do{
			num = 0;
			System.out.println("Elige\n\t[1]Encriptar\n\t[2]Desencriptar\n");
			try{
				num = reader.nextInt();
				reader.nextLine();
			}catch(Exception e){
				System.out.println("**Error obteniendo input**");
				reader.nextLine();
				num=0;
			}
		}while(!(num==1||num==2));
		String phrase="";
		int numeroMagico = 0;
		try{
			System.out.print("Introduce la frase a ");
			if(num==1)
				System.out.println("encriptar:");
			else
				System.out.println("desencriptar:");
			phrase = reader.nextLine();
			System.out.println("Introduce el número mágico:");
			numeroMagico = reader.nextInt();
			reader.nextLine();
			caesar_cipher.codigoMagico=numeroMagico;
		}catch(Exception e){
			System.out.println("Error obteniendo input.");
			return;
		}finally{
			reader.close();
		}
		String resultado = "";
		if(num==1)
			resultado = caesar_encrypt(phrase);
		else
			resultado = caesar_decrypt(phrase);
		System.out.println("Resultado:");
		System.out.println("\""+resultado+"\"");
		System.out.println("END**");
	}
}
