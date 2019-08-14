import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			int line1 = Integer.parseInt(br1.readLine());
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			String line2 = br2.readLine();
			String[] typesOfBooks = line2.split(" ");
			if(typesOfBooks.length != line1) {
				System.out.println("Invalid input");
			}
			int leastCount = 0;
			for(String type: typesOfBooks) {
				if(leastCount!= 0) {
					if(charCount(typesOfBooks, type) < leastCount) {
						leastCount = charCount(typesOfBooks, type);
					}
				} else {
					leastCount = charCount(typesOfBooks, type);
				}
			}
			System.out.println(leastCount);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int charCount(String[] typeOfBooks, String c) {
		int count = 0;
		for(String type : typeOfBooks) {
			if(type.equals(c)) {
				count++;
			} else {
				continue;
			}
		}
		return count;
		
	}

}
