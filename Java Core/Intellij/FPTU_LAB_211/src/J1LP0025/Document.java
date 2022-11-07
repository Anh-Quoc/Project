package J1LP0025;

import MainProject.Localized;

import java.io.*;

public class Document {

    public Document(){
        readDataFromFile();
    }

    private void readDataFromFile(){

        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        try {
            fileInputStream = new FileInputStream(Localized.fileInputPath);
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line = bufferedReader.readLine();
            while (line != null) {
                if(line.length() != 0){
                    Localized.lineString.add(new StringBuffer(line));
                }
                line = bufferedReader.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                bufferedReader.close();
                fileInputStream.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void printDataTo(String filePath){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (StringBuffer line : Localized.lineString) {
                writer.write(line.toString() + "\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void processDocument(){
        for(int i = 0; i < Localized.lineString.size(); ++i){
            StringBuffer line = StringProcess.processData(Localized.lineString.get(i));
            Localized.lineString.set(i, line);
        }
    }
}
