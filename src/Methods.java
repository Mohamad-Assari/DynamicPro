
public class Methods {
	int k=3;//cities
	int n=12;//months
	int [][]cim=new int[k][n];
	int [][]fij=new int[k][k];
	
	String []OldSequence=new String[k];
	String []NewSequence=new String[k];
	
	int []newLocal=new int[k];
	
	
	
	
	public Methods(){
		
		
		cim[0][0]=8;
		cim[1][0]=18;
		cim[2][0]=40;

		cim[0][1]=3;
		cim[1][1]=1;
		cim[2][1]=5;
		
		cim[0][2]=10;
		cim[1][2]=35;
		cim[2][2]=8;
		
		cim[0][3]=43;
		cim[1][3]=18;
		cim[2][3]=13;
		
		cim[0][4]=15;
		cim[1][4]=10;
		cim[2][4]=21;
		
		cim[0][5]=48;
		cim[1][5]=19;
		cim[2][5]=12;
		
		cim[0][6]=5;
		cim[1][6]=18;
		cim[2][6]=4;
		
		cim[0][7]=40;
		cim[1][7]=10;
		cim[2][7]=27;
		
		cim[0][8]=20;
		cim[1][8]=8;
		cim[2][8]=25;
		
		cim[0][9]=30;
		cim[1][9]=5;
		cim[2][9]=10;
		
		cim[0][10]=28;
		cim[1][10]=8;
		cim[2][10]=5;
		
		cim[0][11]=24;
		cim[1][11]=20;
		cim[2][11]=15;

		
		

		
		fij[0][0]=0;
		fij[0][1]=20;
		fij[0][2]=15;
		
		fij[1][0]=20;
		fij[1][1]=0;
		fij[1][2]=10;

		fij[2][0]=15;
		fij[2][1]=10;
		fij[2][2]=0;
		
		thi();
		result();
	}
	public void thi(){
		
		
		
		int []oldLocal=new int[k];
		for(int i=0;i<k;i++){
			oldLocal[i]=cim[i][0];
			OldSequence[i]=Integer.toString(i);
		}
		
		
		for(int m=0;m<n-1;m++){

		
		int tempMin=Integer.MAX_VALUE;

		for(int e=0;e<k;e++){
			tempMin=Integer.MAX_VALUE;
			
		int finalI=0;
		for(int i=0;i<k;i++){
			if((oldLocal[i]+fij[i][e])<tempMin){
				tempMin=oldLocal[i]+fij[i][e];
				finalI=i;
			}
		}
		NewSequence[e]=OldSequence[finalI];
		NewSequence[e]+=Integer.toString(e);
		
		tempMin+=cim[e][m+1];
		newLocal[e]=tempMin;
		}
		
		for(int u=0;u<k;u++){
			OldSequence[u]=NewSequence[u];
		}
		
		for(int o=0;o<k;o++){
			oldLocal[o]=newLocal[o];
		}
		
		}
	
	}
	
	public void result(){
		int finalIndex=0;
		int temp=Integer.MAX_VALUE;
		//find the minimum of oldLoc[i]+f[i][0]
		for(int e=0;e<k;e++){
			if(newLocal[e]<temp){
				temp=newLocal[e];
				finalIndex=e;
			}
		}
		
		System.out.println(newLocal[finalIndex]);
		System.out.println(NewSequence[finalIndex]);
		
	}
	
	
	
	

}
