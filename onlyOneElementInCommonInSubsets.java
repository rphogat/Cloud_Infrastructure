import java.util.Scanner;
public class onlyOneElementInCommonInSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter the total Number of Nodes");
		int N = reader.nextInt();
		reader.close(); 
		int sizeOfVotingSet = (int) (2* Math.sqrt(N) -1);
		System.out.println("size Of Voting Set"+sizeOfVotingSet);
		double noOfVotingSet = Math.round((float)N/sizeOfVotingSet);
		System.out.println("no Of Voting Sets"+ noOfVotingSet);
//		while(noOfVotingSet>0)
//		{
		int count=1;
		int j=0;
		int m;
			for(int i=1;i<=noOfVotingSet;i++)
			{
				//int[] V = new int[sizeOfVotingSet];
				System.out.println("The process that lie in voting set"+i+"are");
//				if(count == 0) {
//					for( j=1;j<=sizeOfVotingSet;j++) {
//						System.out.println("Process ID"+j);
//					}
//				}else
//				{	j=sizeOfVotingSet;
					if(count==1) {
						m=1;
					}else {
						m = j-1;
//						System.out.println("m"+m);
					} 
					int k = sizeOfVotingSet*count;
					if(count == noOfVotingSet) {
						while(k<N) {
							k++;
						}
					}
					//System.out.println("k"+k);
					for( j=m;j<=k;j++) {
						if(j==N+1) {
							//System.out.println("did I Break");
							break;
						}
						System.out.println("Process ID"+j);
					}
//				}
				
				count++;
			}
			
			
//			N--;
//		}
		
	}

}
