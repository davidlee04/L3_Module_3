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
		for (int i = 0; i <= chars.length - 1; i++) {
			if (i % 2 == 1) {

			}
		}
		return s;
	}
	// fail

}
