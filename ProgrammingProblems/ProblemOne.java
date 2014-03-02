public class ProblemOne {
    public static void main(String[] args) {
        
    }

    public int checkColors(String str) {
		String[] colors = {" red ", " orange ", " yellow ", " green ", " blue ", " purple ", " brown ", " white ", " black ", " silver ", " gold ", " red.", " orange.", " yellow.", " green.", " blue.", " purple.", " brown.", " white.", " black.", " silver.", " gold.", "Red ", "Orange ", "Yellow ", "Green ", "Blue ", "Purple ", "Brown ", "White ", "Black ", "Silver ", "Gold "};
		int numFound = 0;
		for(int i=0; i < colors.length; i++){
			if(str.contains(colors[i]))
				numFound++;
		}
		return numFound;
    }
}
