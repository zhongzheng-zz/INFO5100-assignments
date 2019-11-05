package Q1;

import java.io.*;

public class ReverseWord {
	
	public static String reverse(String string) {
		String[] newSen = string.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = newSen.length-1; i >= 0; i--) {
			sb.append(newSen[i]+ " ");			
		}
		String output = sb.toString();
		return output;
	}
	
	public static String readFromStream(FileInputStream fis) throws IOException {
		StringBuilder sb = new StringBuilder();
		while(true) {
			int x = fis.read();
			if(x == -1) break;
			char c = (char)x;
			sb.append(c);
		}
		fis.close();
		String output = sb.toString();
		return output;
	}

	public static void main(String[] args) throws Exception{
		File file1 = new File("/Users/zhengzhong/eclipse-workspace/Q1-old.txt");
		File file2 = new File("/Users/zhengzhong/eclipse-workspace/Q1-new.txt");
		
		FileOutputStream fos1 = new FileOutputStream(file1);
		String data = "the sky is blue";
		fos1.write(data.getBytes());
		fos1.close();

		FileInputStream fis = new FileInputStream(file1);

		String input = readFromStream(fis);
		String finalinput = reverse(input);
		FileOutputStream fos2 = new FileOutputStream(file2);
		fos2.write(finalinput.getBytes());
		fos2.close();
	}

}
