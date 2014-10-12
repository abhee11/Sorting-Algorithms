
import java.util.*;




public class Insertion_sort {
	
public static void main(String[] args)
{
	System.out.println("Implementing Insertion sort algorithm..!!");
	System.out.println("Enter the number of numbers that needs to be sorted:");
	
	
	Scanner a = new Scanner(System.in);
	int w = a.nextInt();
	int[] B = new int[w];
	int[] A = new int[w];
	System.out.println("Please enter the numbers to be sorted using Insertion sort scheme\n");
	
	for(int i =0;i<w;i++)
	{
		B[i] = a.nextInt();
	}
	
int p=0,count =0;

for(int i=0;i<w;i++)
{
	for(int j =0;j<w;j++)
	{
		if(p!=j && B[p]>B[j])
		{
			count++;
		}
		
	}
	A[count] = B[p];
	count = 0;
	p+=1;
}

System.out.print("Sorted numbers are:");
for(int i =0;i<B.length;i++)
{
	System.out.print(A[i]);
}
}

}