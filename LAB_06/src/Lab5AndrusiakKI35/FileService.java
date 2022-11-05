package Lab5AndrusiakKI35;

import java.io.*;
import java.util.Scanner;

public class FileService {
    private double result;
    private Double this_x;

    public void writeResTxt(String fName) throws FileNotFoundException {

        PrintWriter f = new PrintWriter(fName);
        f.printf("y = %f  x = %f", result, this_x);
        f.close();
    }

    public String readFromFile(String fileName) {
        String res = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                String value = bufferedReader.readLine();
                builder.append(value).append("\n");
            }
            res = builder.toString();
        } catch (IOException e) {
            throw new RuntimeException("Can't read file", e);
        }

        return res;
    }

    public void writeToFile(String toFile) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(toFile, true))) {
            bufferedWriter.write("x = " + this_x + " y = " + result + System.lineSeparator());
        } catch (IOException e) {
            throw new RuntimeException("Can't write data to file " + toFile, e);
        }
    }

    public String readResTxt(String fName) {
        String strResult = "";
        try
        {
            File f = new File(fName);
            if (f.exists())
            {
                Scanner s = new Scanner(f);
                strResult = s.toString();
                s.close();
            }
            else
            throw new FileNotFoundException("File " + fName + "not found");
        }
        catch (FileNotFoundException ex)
        {
            System.out.print(ex.getMessage());
        }
        return strResult;
    }

    public void writeResBin(String fName) throws IOException {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();
    }

    public void readResBin(String fName) throws IOException {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }

    public void calcTg(Double x) {
        this_x = x;
        CalcTg obj = new CalcTg();
        result = obj.calc(x);
    }

    public double getThisX() {
        return this_x;
    }


    public double getResult() {
        return result;
    }

}
