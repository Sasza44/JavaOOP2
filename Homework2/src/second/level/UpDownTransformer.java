package second.level;

public class UpDownTransformer extends TextTransformer {
	@Override
	public String transform(String text) {
		char[] a1 = text.toCharArray();
		for(int i = 0; i < a1.length; i++) {
			if(i % 2 == 0) {
				a1[i] = Character.toUpperCase(a1[i]);
			}
		}
		String string = new String(a1);
		return string;
	}
}