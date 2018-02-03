package interfaces;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		char[] chars = s.toCharArray();
		String temp = "";
		String r = "";
		for (int i = 0; i < chars.length; i ++) {
			if(i == 0) {
				temp = chars[i] + "";
				temp = temp.toLowerCase();
				chars[i] = temp.charAt(0);
				temp = "";
			}else if(i % 2 == 1) {
				temp = chars[i] + "";
				temp = temp.toUpperCase();
				chars[i] = temp.charAt(0);
				temp = "";
			}

		}
		for (int i = 0; i < chars.length; i++) {
			r += chars[i];
		}
		System.out.println(r);
		return r;
	}

}
