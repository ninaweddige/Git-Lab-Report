public class roundSum {
	
	public static void main(String[] args) {
		roundSum round = new roundSum();
		int a = 14;
		int b = 13;
		int c = 26;
		
		System.out.println(round.roundSum(a, b, c));
	}
	
	public int roundSum(int a, int b, int c) {
		  int sum = round10(a) + round10(b) + round10(c);// Your turn: the sum of the rounded integers
		  return sum;
		}

		public int round10(int num){ //a helper to avoid repetition in the code before
		  if(num % 10 >= 5){ //Your turn: round up if rightmost number is 5 or greater 
		    return num + (10 - (num % 10)); //Your turn: how do we get the next multiple of 10 from num
		  }else{ // if we do not round up we do else ->
		    return num - (num % 10);// Your turn: how do we get the multiple of 10 before num
		  }
		}

}

