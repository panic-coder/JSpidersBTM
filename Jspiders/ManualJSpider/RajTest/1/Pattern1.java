class Pattern1{
	public static void main(String args[]){
		int m=1;
		for(int i=1;i<=5;i++){
			for(int j=5-i;j>0;j--){
				System.out.print("   ");
			}
			for(int k=i;k>0;k--){
				if(m>10)
					System.out.print(m+" ");
				else
					System.out.print(m+"  ");
				m++;
			}
			System.out.println();
			
		}
	}
}