 import java.util.Scanner;
class Pattern2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
        int columns=sc.nextInt();
		for(int i=1;i<=rows;i++){
			
          for(int j=1;j<=columns;j++){
			  if(j%2==0){
		         System.out.print("@" +" ");
			  }else{
			      System.out.print("*"+" ");
			  }
		}
		
		System.out.println();
		}
	}
}

