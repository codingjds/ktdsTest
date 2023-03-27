package test0213;

public class Aaaaaaa {
	
    public static int solution(int n, int m, int[] section) {
        int answer = 1;
        for(int i = 0 ; i < section.length; i++) {
        	
            if(section[i] + m - 1  < section[section.length-1]){
                answer = answer + 1;
            } 
            else if(section[i]+ m - 1  > section[section.length-1]) {
            	break;
            }
            i= m*i;
        }
        return answer;
    }
	public static void main(String[] args) {
		int[]list = new int[3];
		list[0]= 2;
		list[1]=3;
		list[2]=6;
		solution(8, 4, list);
		
	}
}
