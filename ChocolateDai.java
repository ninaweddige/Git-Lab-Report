
public class main {
	
	public static void main(String args[]) {
		System.out.println(makeChocolate(5,1,9));
	}
	public static int makeChocolate(int small, int big, int goal) {
        int highestBig = 0;
        int restGoal = 0;
        for(int i = 1; i <= big; i++) {
           if(i*5 <= goal) {
              highestBig++;
           } 
           restGoal = goal-highestBig*5;
        } if(small < restGoal){
           return -1;
        } return restGoal;
     }
}
