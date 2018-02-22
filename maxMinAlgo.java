public class maxMinAlgo {
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
		int j = 0, i=0;
		  for (  i = 0; i < scores.length; i++) {
			    for (  j = 0; j < scores[i].length; j++) {
			        System.out.print(scores[i][j] + " ");
			    }
			    System.out.println();
			}
		// TODO Auto-generated method stub
		for(int k=scores.length; k>0; k--)
		{
		
		maxMinAlgo m = new maxMinAlgo();
		  
		int [ ] [ ] maxArray = mincol(scores);
		

	    int maxValue =Integer.MIN_VALUE;
	    int indexToBeRemoved=0;
	    for ( i = 0; i < maxArray.length; i++)
	    {
	        for ( j = 0; j < maxArray[i].length; j++)
	        {
	            if (maxArray[i][j] >0 && maxArray[i][j] > maxValue)
	            {
	            	maxValue = maxArray[i][j];
	            	indexToBeRemoved = i;
	               
	            }
	           
	        }
	       
	    }
	
	    m.removeColumnWithValue(indexToBeRemoved);

	    int minIndex=0;
	    for ( i = 0; i < maxArray.length; i++)
	    {
	        for ( j = 0; j < maxArray[i].length; j++)
	        {
	        		if(maxArray[i][j]== maxValue)
	        		{
	        			System.out.println("Task with id" +i+"is assigned to machine"+j);
	        			minIndex=j;
	        			for(int i2=0; i2<scores.length; i2++)
	        			{
	        				if(scores[i2][minIndex] != 0) {
	        				scores[i2][minIndex] += maxValue;
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
	            		
	                if (n[i][j] > 0 && n[i][j] <= min) {
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
	 
	 public int[][] removeColumnWithValue(int indexValue)
	    {
	       for(int i=0; i< scores.length;i++)
	       { 
	    	   	for(int j=0;j<scores[0].length;j++)
	    	   	{
	    	   				scores[indexValue][j]=0;
	    	   	}
	       }
	        return scores;
	    }
}
