package assignmentTwo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class convert {

	public static void main(String args[]) throws IOException {

		FileReader fr = new FileReader("/Users/work/eclipse-workspace/school/src/school/in.txt");
		BufferedReader br = new BufferedReader(fr);

		FileWriter fw = new FileWriter("/Users/work/eclipse-workspace/school/src/school/out.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		String s;
		while ((s = br.readLine()) != null) {

			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);

				if (count < 8 && count > 2 && c == '\t') {
					bw.write('\t');
					count = 0;
				}

				if (c != '\t') {
					count++;

				} else {
					count = 0;
				}
				bw.write(c);
			}
			bw.write('\n');

		}

		bw.flush();
		fr.close();
		fw.close();

	}

}
