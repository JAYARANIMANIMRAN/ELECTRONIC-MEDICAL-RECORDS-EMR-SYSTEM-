package newhospital;
import java.io.*;
import java.util.ArrayList;
public class FileHandler {
	public void saveData(ArrayList<Medicalrecord> records, String filename) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(records);
        }
    }

    public ArrayList<Medicalrecord> loadData(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (ArrayList<Medicalrecord>) in.readObject();
        }
    }
}
