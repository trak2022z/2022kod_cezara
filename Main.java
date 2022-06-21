import java.util.Scanner;
public class Main {
public static void main(String[] args) {
		System.out.println("Żeby zaszyfrować wpisz 1");
    System.out.println("Żeby rozszyfrować wpisz 2");
		Scanner scan=new Scanner(System.in);
		int s1=scan.nextInt();
		if(s1==1) {
			System.out.println("Wprowadź tekst:");
      scan.nextLine();
			String s=scan.nextLine();
			System.out.println("Podaj klucz:");
			int key=scan.nextInt();
			Encryption(s,key);
		}else if(s1==2) {
			System.out.println("Wprowadź tekst:");
      scan.nextLine();
			String s=scan.nextLine();
			System.out.println("Podaj klucz:");
			int key=scan.nextInt();
			Decrypt(s,key);
		}
	}

	public static void Decrypt(String str, int n) {
		int k=Integer.parseInt("-"+n);
		String string="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c>='a'&&c<='z')
			{
				c+=k%26;
				if(c<'a')
					c+=26;
				if(c>'z')
					c-=26;
			}else if(c>='A'&&c<='Z')
			{
				c+=k%26;
				if(c<'A')
					c+=26;
				if(c>'Z')
					c-=26;
			}
			string +=c;
		}
		System.out.println(str+" po rozszyfrowaniu: "+string);		
	}

	public static void Encryption(String str, int k) {
		String string="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c>='a'&&c<='z')
			{
				c+=k%26;
				if(c<'a')
					c+=26;
				if(c>'z')
					c-=26;
			}else if(c>='A'&&c<='Z')
			{
				c+=k%26;
				if(c<'A')
					c+=26;
				if(c>'Z')
					c-=26;
			}
			string +=c;
		}
		System.out.println(str+" po szyfrowaniu: "+string);
	}
	

}