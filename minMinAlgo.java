public class minMinAlgo {
	static int [ ] [ ] scores = {   { 13, 79, 23, 71, 60, 27, 2},
            { 31, 13, 14, 94, 60, 61, 57},
            { 17, 1, 0, 23, 36, 8, 86},
            { 19, 28, 10, 4, 58, 73, 40},
            { 94, 75, 0, 58, 0, 68, 46},
            { 8, 24, 3, 32, 4, 94, 89},
            { 10, 57, 13, 1, 92, 75, 29},
            {80, 17, 38, 40, 66, 25, 88}
};

	public static void main(String[] args) {
		int j = 0,i=0;
		  for (  i = 0; i < scores.length; i++) {
			    for (  j = 0; j < scores[i].length; j++) {
			        System.out.print(scores[i][j] + " ");
			    }
			    System.out.println();
			} 
		// TODO Auto-generated method stub
		for(int k=scores.length; k>0; k--)
		{
		
		minMinAlgo m = new minMinAlgo();
	
		int [ ] [ ] minArray = mincol(scores);

	    int minValue =Integer.MAX_VALUE;
	    
	    for ( i = 0; i < minArray.length; i++)
	    {
	        for ( j = 0; j < minArray[i].length; j++)
	        {
	            if (minArray[i][j] >0 && minArray[i][j] < minValue)
	            {
	               minValue = minArray[i][j];
	               
	            }
	           
	        }
	       
	    }
	    m.removeColumnWithValue(minValue);
	    int minIndex=0;
	    for ( i = 0; i < minArray.length; i++)
	    {
	        for ( j = 0; j < minArray[i].length; j++)
	        {
	        		if(minArray[i][j]== minValue)
	        		{
	        			System.out.println("Task with id" +i+"is assigned to machine"+j);
	        			minIndex=j;
	        			for(int i2=0; i2<scores.length; i2++)
	        			{
	        				if(scores[i2][minIndex] != 0) {
	        				scores[i2][minIndex] += minValue;
	        				}else {}
	        				
	        			}

	        		}
	        	
	        }
	    }
	    
	}
		
}
		
	
	public static int [][] mincol (int [][] n) {
	        int[][] result = new int[n.length][n[0].length];
	        int[][] finalResult = new int[n.length][n[0].length];
	        int i,j,indexi=0,indexj=0;
	      
	        for (i = 0; i < n.length; i++) {
	        		
	            int min = n[i][0];
	        
	            for (j = 0; j < n[i].length; j++) {
	           
	                if (n[i][j] > 0 && n[i][j] < min) {
	                	
	                    min = n[i][j];
	                    indexi=i;
	                    indexj=j;
	                    result[i][j] = min;
	                 
	                }
	                
	            }
	            finalResult[indexi][indexj]= result[indexi][indexj];
	           
	        }
			
	        return finalResult;
	    }
	 
	 public int[][] removeColumnWithValue(int value)
	    {
	       
	       for(int i=0; i< scores.length;i++)
	       { 
	    	   	for(int j=0;j<scores[0].length;j++)
	    	   	{
	    	   		if(scores[i][j] == value)
	    	   		{	int indexi =i;
	    	   			for (int k=0;k<scores[0].length;k++)
	    	   				scores[indexi][k]=0;
	    	   		}
	    	   	}
	    	   		
	       }
	     
	        return scores;
	    }
}
