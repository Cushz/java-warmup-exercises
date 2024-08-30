package Chapter6;
import java.io.*;

public class SaveRestoreObjFromFile implements Serializable{
    public static void saveToFile(String outputFile, Object object) throws IOException {
        FileOutputStream save = new FileOutputStream(outputFile); //Creates stream
        ObjectOutputStream out = new ObjectOutputStream(save); // uses stream to write to a file
        out.writeObject(object); // Writes specified object to a file
        out.close();

    }
    public static Object restoreFromFile(String inputFile) throws IOException, ClassNotFoundException {
        FileInputStream open = new FileInputStream(inputFile); // creates stream
        ObjectInputStream read = new ObjectInputStream(open); // uses stream to read file
        Object oo = read.readObject(); //reads as objects
        return oo;

    }
}
