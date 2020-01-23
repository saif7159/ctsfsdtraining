import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileMethodsTest {
public static void main(String[] args)
{
	File file = new File("TestFile.txt");
	String str;
	
	try {
		if(!file.exists())
		{
			file.createNewFile();
		}
		BufferedReader br = new BufferedReader(new FileReader(file));
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		BufferedReader bcin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("File Name: "+file.getName());
		System.out.println("Enter string to write in file");
		String towrite = bcin.readLine();
		System.out.println("Writing...");
		if(file.canWrite())
		{
		bw.write(towrite);
		bw.flush();
		bw.close();
		System.out.println("Writing completed");
		}
		else
		{
			System.out.println("Failed");
		}
		if(file.canRead())
		{
			System.out.println("File Length: "+file.length());
			while((str=br.readLine())!=null)
			{	
				System.out.println(str);
			}
			br.close();
			System.out.println("Last Modified: "+file.lastModified());
		}
		System.out.println();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
