import java.util.Scanner;

class StudentRecordParser {

    void parseStudentRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String name = fields[0].trim();
        String rollNumber = fields[1].trim();
        String department = fields[2].trim();

        System.out.println("Name: " + name +
                " | Roll No: " + rollNumber +
                " | Dept: " + department);
    }
}

public class StudentRecordMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student record: ");
        String csvLine = sc.nextLine();

        StudentRecordParser obj = new StudentRecordParser();

        obj.parseStudentRecord(csvLine);

        sc.close();
    }
}