import java.util.Scanner;
class Binary{
	int b[]=new int[10];
	int n,key;
	Binary(int b[],int n,int key){
		this.b=b;
		this.n=n;
		this.key=key;
	}
	void binary() {
		int lb=0,ub=n-1,mid;
		while(lb<=ub){
			mid=(lb+ub)/2;
			if(key==b[mid]) {
				System.out.println("key is found at:"+mid);
				System.exit(0);
			}
			else {
				if(b[mid]<key)
					lb=mid+1;
				else
					ub=mid-1;
			}}
		System.out.println("our searching element is not found!!");}}
public class Lab5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int b[]=new int[10];
	int i,j,key,n;
	System.out.println("enter total number of elements:");
	n=sc.nextInt();
	System.out.println("enter the elements:");
	for(i=0;i<n;i++) 
		b[i]=sc.nextInt();
	System.out.println("enter your searching element:");
	key=sc.nextInt();
	Binary c=new Binary(b,n,key);
	c.binary();
	}
}
