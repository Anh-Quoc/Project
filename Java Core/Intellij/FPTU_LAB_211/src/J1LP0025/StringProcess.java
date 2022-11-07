package J1LP0025;


import MainProject.Localized;

import java.util.regex.*;


public class StringProcess {

    public static StringBuffer processData(StringBuffer data){
        data = uppercaseFirstWord(data);
        data = processWithComma(data);
        data = processWithDot(data);
        data = processWithColon(data);
        data = processWithQuotes(data);
        data = deleteTwoSpaceClose(data);
        data = addDotAtTheEnd(data);
        return data;
    }

    private static StringBuffer deleteTwoSpaceClose(StringBuffer data){
        String newData = data.toString();
        newData = newData.replaceAll(Localized.regexSelectMultiSpace, Localized.whileSpace);
        return new StringBuffer(newData);
    }

    private static StringBuffer uppercaseFirstWord(StringBuffer data){
        String firstWord = String.valueOf(data.charAt(0));
        String newData = firstWord.toUpperCase() + data.substring(1);
        return new StringBuffer(newData);
    }

    private static StringBuffer addDotAtTheEnd(StringBuffer data){
        if(!data.toString().endsWith(Localized.dotPunctuation)){
            data.append(Localized.dotPunctuation);
        }
        return data;
    }

    private static StringBuffer processWithComma(StringBuffer data){
        String newData = data.toString();
        newData = newData.replaceAll(Localized.regexSelectCommaAndSpace, Localized.commaPunctuation + Localized.whileSpace);
        return new StringBuffer(newData);
    }

    private static StringBuffer processWithDot(StringBuffer data){
        String[] dataSplitArr = data.toString().split(Localized.dotPunctuation_Regex);

        StringBuffer newData = new StringBuffer();
        for(int i = 0; i < dataSplitArr.length; ++i){
            String sentence = dataSplitArr[i].trim();
            sentence = String.valueOf(sentence.charAt(0)).toUpperCase() + sentence.substring(1);
            if(i < dataSplitArr.length - 1){
                newData.append(sentence).append(Localized.dotPunctuation).append(" ");
            } else {
                newData.append(sentence);
            }
        }
        return newData;
    }

    private static StringBuffer processWithColon(StringBuffer data){
        String newData = data.toString();
        newData = newData.replaceAll(Localized.regexSelectColonAndSpace, Localized.colonPunctuation + Localized.whileSpace);
        return new StringBuffer(newData);
    }


    private static StringBuffer processWithQuotes(StringBuffer data){
        String newData = data.toString();
        newData = newData.replaceAll(Localized.quotesPunctuation, " \" ");

        Pattern pattern = Pattern.compile(Localized.regexSelectMultiQuotes);
        Matcher matcher = pattern.matcher(data);

        while (matcher.find()) {
            newData = newData.substring(0, matcher.start() + 1) + deleteSpaceInQuote(matcher.group()) + newData.substring(matcher.end() + 3);
        }

        return new StringBuffer(newData);
    }

    public static String deleteSpaceInQuote(String quote){
        String regexSelectQuote = "(\"\\s{1,})|(\\s{1,}\")";
        quote = quote.replaceAll(regexSelectQuote, "\"");
        return quote;
    }
}
