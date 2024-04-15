import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	    String str = num + "";
	    digitList = new ArrayList<Integer>();
	    for(int i = 0; i < str.size(); i++){
		digitList.add(Integer.parseInt(str.substring(i, i+1)));
	    }
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		int prev = -1;
		for(int i = 0; i < digitList.size(); i++){
			if(digitList.get(i) <= prev){
				return false;
			}
			prev = digitList.get(i);
		}
		return true;

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
