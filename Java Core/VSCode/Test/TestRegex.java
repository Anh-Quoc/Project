import java.util.regex.*;

class TestRegex {
    public static void main(String[] args) {
        // String data = "A lo\"t of ali\"zing in the   \"  second row   \"   is for the initialization of buffers. The cost of which is amortized";
        // String regexSelectMultiQuotes = "([\"])(?:(?=(\\\\?))\\2.)*?\\1";
        
        // Pattern pattern = Pattern.compile(regexSelectMultiQuotes);
        
        // Matcher matcher = pattern.matcher(data);

        //  while (matcher.find()) {
            
        //     data = data.substring(0, matcher.start()).trim() + deleteSpace(matcher.group()) + data.substring(matcher.end()).trim();
        //     // System.out.println(matcher.group() + matcher.start() + "  "+ matcher.end());
        //     System.out.println(data);
        // }
        String value = "12.1a";
        Double a = Double.parseDouble(value);
    }

    public static String deleteSpace(String quote){
        String regexSelectQuote = "(\"\\s{1,})|(\\s{1,}\")";
        quote = quote.replaceAll(regexSelectQuote, "\"");
        return quote;
    }

    private static boolean checkNumer(String value){
        return value.matches("[+-]?([0-9]*[.])?[0-9]+");
        
    }
}