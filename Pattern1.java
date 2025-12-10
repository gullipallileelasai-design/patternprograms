import java.util.Scanner;
class Pattern1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//int num=1;

		int rows=sc.nextInt();
        int columns=sc.nextInt();
		for(int i=1;i<=rows;i++){
			//char ch='a';
          for(int j=1;j<=columns;j++){
			  if(i%2==0){
		         System.out.print("*" +" ");
			  }else{
			      System.out.print("@"+" ");
			  }
		}
		
		System.out.println();
		}
	}
}
