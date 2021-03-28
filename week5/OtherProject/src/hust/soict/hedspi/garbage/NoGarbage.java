package hust.soict.hedspi.garbage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoGarbage {
	public static void main(String[] args) throws FileNotFoundException {
		String url = "C:\\Users\\Admin\\Downloads\\10MB.txt";
		FileInputStream fileInputStream = null;
		BufferedReader bufferedReader = null;
		StringBuffer sb = new StringBuffer();
		long start = System.currentTimeMillis();

		try {
			System.out.println("Read file use StringBuffer!!");
			fileInputStream = new FileInputStream(url);
			bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
			String line = bufferedReader.readLine();
			while (line != null) {
				sb.append(line);
				line = bufferedReader.readLine();
			}
			System.out.println("Time: " + (System.currentTimeMillis() - start));
			System.out.println(sb);
		} catch (FileNotFoundException ex) {
			System.out.println("file not found!!");
			ex.printStackTrace();
		} catch (IOException ex) {
			System.out.println("IOE exception!!");
			ex.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
				fileInputStream.close();
				System.out.println("Readfile finished!!!");
			} catch (IOException ex) {
				System.out.println("IOE exception!!");
				ex.printStackTrace();
			}
		}

	}
}
