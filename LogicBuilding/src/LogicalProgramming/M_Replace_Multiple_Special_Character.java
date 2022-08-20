package LogicalProgramming;

public class M_Replace_Multiple_Special_Character {
	public static void main(String[] args) {
		
		String name = "V@ai@bh#av";
		String CorrectName = name.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(CorrectName);
		
		
		//System.out.println(str.replace("@", "").replace("#", ""));
	}
}
