package Day1;

public class ArrayDemo {
  public static void main(String[] args) {
	int j=11;
	int []ar= new int[3];
	
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=i;
		j++;
	}
	
	for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+" ");
	System.out.println();
	}
}
}
