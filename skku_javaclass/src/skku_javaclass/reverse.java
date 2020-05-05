package skku_javaclass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class reverse {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("output.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw); //쓰기 위함.
		
		InputStream fis= new FileInputStream("input.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		//읽기 위함
		ArrayList<String> arrayList = new ArrayList<String>();
		String line ="";
		int line_count = 0;
		while((line = br.readLine()) != null) {
			arrayList.add(line);
			line_count++;
		}
		
		Collections.reverse(arrayList);
		String data;
		for(int i = 0; i < line_count; i++) {
			data = arrayList.get(i);
			bw.write(data);
			bw.write("\n");
		}
		
		bw.close();
		fos.close();
		osw.close();
		br.close();
		fis.close();
		isr.close();
	}
}
