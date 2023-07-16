package second.level;

public class InverseTransformer extends TextTransformer {
	@Override
	public String transform(String text) {
		return new StringBuilder(text).reverse().toString();
	}
	
}