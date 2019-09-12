class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
           for(int i=0;i<T.length-1;i++){
               int next = Integer.MIN_VALUE;
               int count = 0;
               for(int j=i+1;j<T.length;j++){
                   if(T[i] < T[j]){
                       count = j-i;
                       //count++;
                       break;
                    }
                   
               }
               
              result[i] = count;
           }
       // System.out.println(Arrays.toString(result));
        return result;
    }
}