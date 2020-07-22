public class ProblemSolution {
    public int solution(int[] A, int N) {
     boolean swapped = true;

      int j = 0;

      int tmp = 0;
      
      int i = 0;

      while (swapped) {

            swapped = false;

            j++;

            for (i = 0; i < N - j; i++) {                                       

                  if (A[i] > A[i + 1]) {                          

                        tmp = A[i];

                        A[i] = A[i + 1];

                        A[i + 1] = tmp;

                        swapped = true;
                        
                        
                  }
                  
            }                

      }
	
     
      return A ;    
        
    }
}
