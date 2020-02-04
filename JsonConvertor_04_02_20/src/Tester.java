import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Tester {
public static void main(String[] args)
{
	ObjectMapper mapper = new ObjectMapper();
	try {
		Student s = mapper.readValue(new File("student.json"), Student.class);
		System.out.println(s);
		
		mapper.writeValue(new File("newstudent.json"),s);
	} catch (JsonParseException e) {
		
		e.printStackTrace();
	} catch (JsonMappingException e) {
	
		e.printStackTrace();
	} catch (IOException e) {

		e.printStackTrace();
	}
}
}
