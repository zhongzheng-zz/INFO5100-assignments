package Q3;

import java.io.*;

public class CountLine {
	
	public static void countLine(File file) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			int count = 0;
			while(reader.readLine() != null) {
				count= count + 1;
			}
			System.out.println(file.getName() + " has " + count +" line");
			reader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}

	public static void main(String[] args) {
		File file1 = new File("/Users/zhengzhong/eclipse-workspace/Q3-1.txt");
		File file2 = new File("/Users/zhengzhong/eclipse-workspace/Q3-2.txt");
		File file3 = new File("/Users/zhengzhong/eclipse-workspace/Q3-3.txt");
		try {
			BufferedWriter out1 = new BufferedWriter(new FileWriter(file1));
			out1.write("asjkvbsjbvabsefndjsnaisuehf\ndsjncasubvsuivsdncjsdbcajsd\n");
			out1.close();
			BufferedWriter out2 = new BufferedWriter(new FileWriter(file2));
			out2.write("1\n2\n3\n\n4\n");
			out2.close();
			BufferedWriter out3 = new BufferedWriter(new FileWriter(file3));
			out3.write("12342sdfanbanjasdnjbweir\nvscvasdfardsa\n\nqwedvcsdcasrq\n");
			out3.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		countLine(file1);
		countLine(file2);
		countLine(file3);
	}
}
