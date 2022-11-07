class BaiDiscord{
	public static void main(String[] args) {		
		int n = 9;		
		String space = "";
		for(int countLine = 1; countLine <= n; ++countLine){
			String line = String.valueOf(n + 1 - countLine);		
			for(int i = n - countLine; i >= 1; --i){
				line = String.valueOf(i) + line + String.valueOf(i);
			}
			System.out.println(space + line + space);
			space += " ";
		}
	}
}