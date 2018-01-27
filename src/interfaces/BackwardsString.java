package interfaces;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		char[] chars = s.toCharArray();
		String temp = "";
		for (int i = chars.length - 1; i >= 0; i--) {
			temp += chars[i];
		}
		return temp;
	}

}
