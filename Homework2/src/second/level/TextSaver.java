package second.level;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextSaver {
	private TextTransformer transformer;
	private File file;
	public TextSaver() {};
	public TextSaver(TextTransformer transformer, File file) {
		super();
		this.transformer = transformer;
		this.file = file;
	}

	public TextTransformer getTransformer() {
		return transformer;
	}

	public void setTransformer(TextTransformer transformer) {
		this.transformer = transformer;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	public void saveTextToFile(String text) {
		String text1 = this.transformer.transform(text);
		try(FileWriter fw = new FileWriter(this.file)) {
			fw.write(text1);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}