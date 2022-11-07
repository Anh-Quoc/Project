class Test1 {

	public static void main(String[] args) {
		String data = " -          Only   .one  \"  sxgsdd\" space    ,       between words";		
		String newData = "";
		Boolean needUpCase = false;
		int numberQuotes  = 0;
	 	
	 	data = data.trim();
		for(int i = 0; i < data.length(); ++i){
			String charAtIndex = String.valueOf(data.charAt(i));

			if (charAtIndex.equals(" ") || charAtIndex.equals(",")){
				newData = newData.trim();
			} else if(charAtIndex.equals(".") || charAtIndex.equals(":")){
				newData = newData.trim();
				needUpCase = true;
			} else if(needUpCase && !charAtIndex.equals(" ")) {
				needUpCase = false;
				if (!String.valueOf(data.charAt(i - 1)).equals(" ")) {
					newData += " ";
				}
				charAtIndex = charAtIndex.toUpperCase();
			} else if (charAtIndex.equals("\"")) {
				numberQuotes += 1;
			}

			newData += charAtIndex;
			if (numberQuotes != 0 && numberQuotes % 2 != 0 && String.valueOf(data.charAt(i - 1)).equals("\"")) {
				System.out.println(newData+"|");
				newData = newData.trim();
				System.out.println(newData+"|");
			} else if  (numberQuotes != 0 && numberQuotes % 2 == 1) {
				//newData =  newData.replace("\" ", "\"");
			} 
		}

		System.out.println(newData);
	}
}