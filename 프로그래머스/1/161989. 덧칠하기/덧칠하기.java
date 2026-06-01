class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] wall = new int[n];
        
        for(int i=0; i<section.length; i++){
           wall[section[i]-1] = 1; 
        }
        
        for(int i=0; i<wall.length; i++){
            if(wall[i] == 1){
                if(i+m >= n){
                    for(int j=0; j<n-i; j++){
                        wall[i+j] = 0;
                    }
                }else{
                    for(int j=0; j<m; j++){
                        wall[i+j] = 0;
                    }
                }
                answer++;
            }
        }
        
        return answer;
    }
}