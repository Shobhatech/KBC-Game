
import java.io.IOException;
import java.util.*;



class KBC
{
	static int count=0;

	public static void main(String[] args)throws IOException 
	{
		Scanner scan=new Scanner(System.in);
System.out.println("***\tWELCOME TO kBC\t\t*****");
System.out.println("***\tYOU HAVE 10 LEVELS\t\t*****");
System.out.println("***\tWRONG ANSWER WILL EXIT THE GAME\t\t*****");
System.out.println("***\tPLAY THE GAMEWISELY\t\t*****");
System.out.println("ALL THE BEST");
level1();
	}



	public static void level1() throws IOException
	{
		System.out.println("YOU HAVE ENTERED IN LEVEL 1");
		Scanner scan=new Scanner(System.in);
		String ans;
		int count=0;
		
		System.out.println("\n1)The brain of computer system  is.");
			System.out.println("A.)ALU\t\t B.)Memory\t");
			System.out.println("C.)CPU\t\t D.)control unit");
			System.out.println("enter your choice:");
			ans=scan.nextLine();

			if(ans.equalsIgnoreCase("C"))
			{
				System.out.println("AAP KA JAWAB BILKUL SAHI HAI");
				System.out.println("CONGRATULATIONS! ABSOUTELY RIGHT ANSWER ");
				System.out.println(" YOU WON 10000  RUPEES");
				level2();
			}
			else
			{
				System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER ");
				System.out.println("THANK YOU FOR BEING PART OF GAME");
				System.out.println("exit(0)");
			}
		}


	public static void level2() throws IOException
	{
		System.out.println("YOU HAVE ENTERED IN LEVEL 2");
		Scanner scan=new Scanner(System.in);
		String ans;
		int count=0;
		
		System.out.println("\n2) Which of the following is NOT operating system");
			System.out.println("A.)Window NT\t B.)Java\t");
			System.out.println("C.)Dos\t\t D.)Unix\t");
			System.out.println("enter your choice:");
			ans=scan.nextLine();

			if(ans.equalsIgnoreCase("B"))
			{
				System.out.println("AAP KA JAWAB BILKUL SAHI HAI");
				System.out.println("CONGRATULATIONS! ABSOUTELY RIGHT ANSWER ");
				System.out.println(" YOU WON 20000  RUPEES");
				level3();
			}
			else
			{
				System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER ");
				System.out.println("THANK YOU FOR BEING PART OF GAME");
				System.out.println("exit(0)");
			}
		}
public static void level3() throws IOException
	{
		System.out.println("YOU HAVE ENTERED IN LEVEL 3");
		Scanner scan=new Scanner(System.in);
		String ans;
		int count=0;
		
		System.out.println("\n3) Which of the following is the most powerful type of computer");
			System.out.println("A.)Super micro\t\tB.)Super computer\t");
			System.out.println("C.)Super conductor\tD.)Megaframe\t");
			System.out.println("enter your choice:");
			ans=scan.nextLine();

			if(ans.equalsIgnoreCase("B"))
			{
				System.out.println("AAP KA JAWAB BILKUL SAHI HAI");
				System.out.println("CONGRATULATIONS! ABSOUTELY RIGHT ANSWER ");
				System.out.println(" YOU WON 40000  RUPEES");
				level4();
			}
			else
			{
				System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER ");
				System.out.println("THANK YOU FOR BEING PART OF GAME");
				System.out.println("exit(0)");
			}
		}
public static void level4() throws IOException
	{
		System.out.println("YOU HAVE ENTERED IN LEVEL 4");
		Scanner scan=new Scanner(System.in);
		String ans;
		int count=0;
		
		System.out.println("\n4) One byte is equivalent to");
			System.out.println("A.)4 bits\t\t B.)32 bits\t");
			System.out.println("C.)8 bits \t\t D.)12 bits\t");
			System.out.println("enter your choice:");
			ans=scan.nextLine();

			if(ans.equalsIgnoreCase("C"))
			{
				System.out.println("AAP KA JAWAB BILKUL SAHI HAI");
				System.out.println("CONGRATULATIONS! ABSOUTELY RIGHT ANSWER ");
				System.out.println(" YOU WON 80000  RUPEES");
				level5();
			}
			else
			{
				System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER ");
				System.out.println("THANK YOU FOR BEING PART OF GAME");
				System.out.println("exit(0)");
			}
		}
public static void level5() throws IOException
	{
		System.out.println("YOU HAVE ENTERED IN LEVEL 5");
		Scanner scan=new Scanner(System.in);
		String ans;
		int count=0;
		
		System.out.println("\n5)A device that converts digital signals to analog signals is");
			System.out.println("A.)A modem\t\t B.)A block\t");
			System.out.println("C.)A packet\t\t D.)Both (A) and (B)\t");
			System.out.println("enter your choice:");
			ans=scan.nextLine();

			if(ans.equalsIgnoreCase("A"))
			{
				System.out.println("AAP KA JAWAB BILKUL SAHI HAI");
				System.out.println("CONGRATULATIONS! ABSOUTELY RIGHT ANSWER ");
				System.out.println(" YOU WON 1,40,000  RUPEES");
				level6();
			}
			else
			{
				System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER ");
				System.out.println("THANK YOU FOR BEING PART OF GAME");
				System.out.println("exit(0)");
			}
		}

public static void level6() throws IOException
	{
		System.out.println("YOU HAVE ENTERED IN LEVEL 6");
		Scanner scan=new Scanner(System.in);
		String ans;
		int count=0;
		
		System.out.println("\n6) The computer that is not considered as a portable computer is");
			System.out.println("A.)Notebook computer\t\t B.)Laptop computer\t");
			System.out.println("C.)Mini computer\t\t D.)None of these)\t");
			System.out.println("enter your choice:");
			ans=scan.nextLine();

			if(ans.equalsIgnoreCase("C"))
			{
				System.out.println("AAP KA JAWAB BILKUL SAHI HAI");
				System.out.println("CONGRATULATIONS! ABSOUTELY RIGHT ANSWER ");
				System.out.println(" YOU WON 3,20,000  RUPEES");
				level7();
			}
			else
			{
				System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER ");
				System.out.println("THANK YOU FOR BEING PART OF GAME");
				System.out.println("exit(0)");
			}
		}
		public static void level7() throws IOException
	{
		System.out.println("YOU HAVE ENTERED IN LEVEL 7");
		Scanner scan=new Scanner(System.in);
		String ans;
		int count=0;
		
		System.out.println("\n7)  ISDN stands for");
			System.out.println("A.)Integrated Service Digital Network\t\t B.)Integrated System Digital Network\t");
			System.out.println("C.)International Standard Digital Network\t\t D.)International Subscriber Dialing Network)\t");
			System.out.println("enter your choice:");
			ans=scan.nextLine();

			if(ans.equalsIgnoreCase("A"))
			{
				System.out.println("AAP KA JAWAB BILKUL SAHI HAI");
				System.out.println("CONGRATULATIONS! ABSOUTELY RIGHT ANSWER ");
				System.out.println(" YOU WON 6,40,000  RUPEES");
				level8();
			}
			else
			{
				System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER ");
				System.out.println("THANK YOU FOR BEING PART OF GAME");
				System.out.println("exit(0)");
			}
		}
		public static void level8() throws IOException
	{
		System.out.println("YOU HAVE ENTERED IN LEVEL 8");
		Scanner scan=new Scanner(System.in);
		String ans;
		int count=0;
		
		System.out.println("\n8)   Full form of TCP is");
			System.out.println("A.)Transmission control protocol\t B.)Transmission control program\t");
			System.out.println("C.)Totalling control program\t\t D.)Total control Protocol)\t");
			System.out.println("enter your choice:");
			ans=scan.nextLine();

			if(ans.equalsIgnoreCase("A"))
			{
				System.out.println("AAP KA JAWAB BILKUL SAHI HAI");
				System.out.println("CONGRATULATIONS! ABSOUTELY RIGHT ANSWER ");
				System.out.println(" YOU WON 12,50,000  RUPEES");
				level9();
			}
			else
			{
				System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER ");
				System.out.println("THANK YOU FOR BEING PART OF GAME");
				System.out.println("exit(0)");
			}
		}


	public static void level9() throws IOException
	{
		System.out.println("YOU HAVE ENTERED IN LEVEL 9");
		Scanner scan=new Scanner(System.in);
		String ans;
		int count=0;
		
		System.out.println("\n9)   Web pages are written using");
			System.out.println("A.)URL\t\t B.)HTTP\t");
			System.out.println("C.FTP\t\t D.)HTML)\t");
			System.out.println("enter your choice:");
			ans=scan.nextLine();

			if(ans.equalsIgnoreCase("D"))
			{
				System.out.println("AAP KA JAWAB BILKUL SAHI HAI");
				System.out.println("CONGRATULATIONS! ABSOUTELY RIGHT ANSWER ");
				System.out.println(" YOU WON 25,00,000  RUPEES");
				level10();
			}
			else
			{
				System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER ");
				System.out.println("THANK YOU FOR BEING PART OF GAME");
				System.out.println("exit(0)");
			}
		}
		public static void level10() throws IOException
	{
		System.out.println("YOU HAVE ENTERED IN LEVEL 10");
		Scanner scan=new Scanner(System.in);
		String ans;
		int count=0;
		
		System.out.println("\n10)  Which command combines the contents of one file with another");
			System.out.println("A.RESTORE\t\t B.)ADD\t");
			System.out.println("C.APPEND\t\t D.)RENAME\t");
			System.out.println("enter your choice:");
			ans=scan.nextLine();

			if(ans.equalsIgnoreCase("C"))
			{
				System.out.println("AAP KA JAWAB BILKUL SAHI HAI");
				System.out.println("CONGRATULATIONS! ABSOUTELY RIGHT ANSWER ");
				System.out.println(" CONGRATULATIONS YOU WON 500000 RUPEES");
				level11();
			}
			else
			{
				System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER ");
				System.out.println("THANK YOU FOR BEING PART OF GAME");
				System.out.println("exit(0)");
			}
		}

		public static void level11() throws IOException
	{
		System.out.println("YOU HAVE ENTERED IN LEVEL 11");
		Scanner scan=new Scanner(System.in);
		String ans;
		int count=0;
		
		System.out.println("\n11)  In which of following form data is stored in computer");
			System.out.println("A.Decimal\t\t B.)Binary\t");
			System.out.println("C.HexaDecimal\t\t D.)octal\t");
			System.out.println("enter your choice:");
			ans=scan.nextLine();

			if(ans.equalsIgnoreCase("B"))
			{
				System.out.println("AAP KA JAWAB BILKUL SAHI HAI");
				System.out.println("CONGRATULATIONS! ABSOUTELY RIGHT ANSWER ");
				System.out.println(" CONGRATULATIONS YOU WON 75,00,000 RUPEES");
				level12();
			}
			else
			{
				System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER ");
				System.out.println("THANK YOU FOR BEING PART OF GAME");
				System.out.println("exit(0)");
			}
		}

public static void level12() throws IOException
	{
		System.out.println("YOU HAVE ENTERED IN LEVEL 12");
		Scanner scan=new Scanner(System.in);
		String ans;
		int count=0;
		
		System.out.println("\n12) who is father of internet");
			System.out.println("A.chares Babbage\tB.)Martin Copper\t");
			System.out.println("C.DenisRichie\t\tD.)Vint Cerf\t");
			System.out.println("enter your choice:");
			ans=scan.nextLine();

			if(ans.equalsIgnoreCase("D"))
			{
				System.out.println("AAP KA JAWAB BILKUL SAHI HAI");
				System.out.println("CONGRATULATIONS! ABSOUTELY RIGHT ANSWER ");
				System.out.println(" CONGRATULATIONS YOU WON 1000000 RUPEES");
				
			}
			else
			{
				System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER ");
				System.out.println("THANK YOU FOR BEING PART OF GAME");
				System.out.println("exit(0)");
			}
		}





				 
}		

