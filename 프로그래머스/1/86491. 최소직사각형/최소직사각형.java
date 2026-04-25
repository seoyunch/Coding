class Solution {
    public int solution(int[][] sizes) {

        int max_width = 0;
        int max_heigt = 0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if(sizes[i][0] > max_width){
                max_width = sizes[i][0];
            }
            if(sizes[i][1] > max_heigt){
                max_heigt = sizes[i][1];
            }
        }
        return max_heigt*max_width;
    }
}