import java.io.*;


public class SchoolResultPortal {

    public static void main(String[] args) {

        String inputFile = "students.txt";
        String outputFile = "reportcard.txt";

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, true))
        ) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];
                int m1 = Integer.parseInt(data[1]);
                int m2 = Integer.parseInt(data[2]);
                int m3 = Integer.parseInt(data[3]);

                double average = (m1 + m2 + m3) / 3.0;

                bw.write("Student: " + name);
                bw.newLine();
                bw.write("Marks: " + m1 + ", " + m2 + ", " + m3);
                bw.newLine();
                bw.write("Average: " + average);
                bw.newLine();
                bw.write("---------------------------");
                bw.newLine();
            }

            System.out.println("Report cards generated successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Student data file not found.");
        } catch (IOException e) {
            System.out.println("Error while reading or writing file.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid marks format in file.");
        }
    }
}