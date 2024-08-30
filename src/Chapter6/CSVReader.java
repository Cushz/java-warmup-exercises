package Chapter6;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CSVReader {
    private String FileName;
    ArrayList<String> Entries = new ArrayList<String>();
    public CSVReader(String FileName)
    {
        this.FileName = FileName;
    }
    public ArrayList<String> importData() throws IOException {
       FileReader fr = new FileReader(FileName); //reading or creating file
       BufferedReader br = new BufferedReader(fr); // for buffering char input stream
       String line;
       while ((line = br.readLine()) != null )
       {
           Entries.add(line);
           System.out.println(line);
       }
       br.close();
       return Entries;
    }
    public int getNumberOfEntries()
    {
        return Entries.size();
    }
    public ArrayList<String> getEntry(int i) {
        String[] splitEntry = Entries.get(i).split("");
        return new ArrayList<>(Arrays.asList(splitEntry));
    }
}
