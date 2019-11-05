package Q2;

import java.io.*;
import java.util.*;

public class Decode {
	
	public static String decode(String string){
		Stack<Integer> count = new Stack<Integer>();
		Stack<String> code = new Stack<String>();
		String result = "";
		int i = 0;
		
		while(i<string.length()) {
			if(Character.isDigit(string.charAt(i))) {
				int count1 = 0;
				while(Character.isDigit(string.charAt(i))) {
					count1 = count1 * 10 + (string.charAt(i) - '0');
					i = i + 1;
				}
				count.push(count1);
			}
			else if(string.charAt(i) == '[') {
				code.push(result);
				result = "";
				i = i + 1;
			}
			else if(string.charAt(i) == ']') {
				StringBuilder sb = new StringBuilder(code.pop());
				int count2 = count.pop();
				for(int j = 0; j < count2; j++) {
					sb.append(result);
				}
				result = sb.toString();
				i = i + 1;
			}
			else {
				result = result + string.charAt(i);
				i = i + 1;
			}
		}
		return result;	
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
		File file1 = new File("/Users/zhengzhong/eclipse-workspace/Q2-old.txt");
		File file2 = new File("/Users/zhengzhong/eclipse-workspace/Q2-new.txt");
		
		FileOutputStream fos1 = new FileOutputStream(file1);
		String data = "3[a2[c]]";
		fos1.write(data.getBytes());
		fos1.close();

		FileInputStream fis = new FileInputStream(file1);

		String input = readFromStream(fis);
		String finalinput = decode(input);
		FileOutputStream fos2 = new FileOutputStream(file2);
		fos2.write(finalinput.getBytes());
		fos2.close();


	}

}
