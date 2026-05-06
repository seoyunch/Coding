class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int maxx = 0;
        int maxy = 0;
        int minx = 50;
        int miny = 50;
        
        for(int i=0; i<wallpaper.length; i++){
            if(i < minx && wallpaper[i].contains("#")){
                minx = i;
            }
            if( i > maxx && wallpaper[i].contains("#")){
                maxx = i;
            }
            for(int j=0; j<wallpaper[i].length(); j++){
                if((wallpaper[i].charAt(j) == '#') && (j < miny)){
                    miny = j;
                }
                if((wallpaper[i].charAt(j) == '#') && (j > maxy)){
                    maxy = j;
                }
            }
        }
        answer[0] = minx;
        answer[1] = miny;
        answer[2] = maxx + 1;
        answer[3] = maxy + 1;
        
        return answer;
    }
}