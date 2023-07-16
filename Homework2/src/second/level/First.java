package second.level;
import java.io.File;

public class First {

	public static void main(String[] args) {
		TextTransformer t1 = new TextTransformer();
		System.out.println(t1.transform("bebebe")); // переведення тексту, що в дужках, у верхній регістр
		InverseTransformer i1 = new InverseTransformer();
		System.out.println(i1.transform("dog")); // реверс тексту, що в дужках
		UpDownTransformer u1 = new UpDownTransformer();
		System.out.println(u1.transform("hedgehog")); // переведення непарних символів тексту, що в дужках, у верхній регістр
		
		TextTransformer t2 = new TextTransformer();
		File f1 = new File("f1.txt");
		TextSaver ts = new TextSaver(t2, f1);
		ts.saveTextToFile("java"); // запис тексту, що в дужках, у файл, вказаний двома рядками вище
	}
}