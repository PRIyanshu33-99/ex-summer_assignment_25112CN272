import java.util.Scanner;

public class day30_assignment {

    static Scanner sc = new Scanner(System.in);

    // -------------------- Q117 --------------------
    static void studentRecordSystem() {
        System.out.println("\n===== Q117 Student Record System =====");

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];
        int[] age = new int[n];
        double[] marks = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Age: ");
            age[i] = sc.nextInt();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\nStudent Records");
        System.out.println("--------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("Name : " + name[i]);
            System.out.println("Age  : " + age[i]);
            System.out.println("Marks: " + marks[i]);
            System.out.println();
        }
    }

    // -------------------- Q118 --------------------
    static void miniLibrarySystem() {
        System.out.println("\n===== Q118 Mini Library System =====");

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] books = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Book Name " + (i + 1) + ": ");
            books[i] = sc.nextLine();
        }

        System.out.println("\nAvailable Books:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }

        System.out.print("\nEnter book name to search: ");
        String search = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (books[i].equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Book Found.");
        else
            System.out.println("Book Not Found.");
    }

    // -------------------- Q119 --------------------
    static void miniEmployeeSystem() {
        System.out.println("\n===== Q119 Mini Employee Management System =====");

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] empName = new String[n];
        int[] empId = new int[n];
        double[] salary = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter Employee ID: ");
            empId[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            empName[i] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\nEmployee Details");
        System.out.println("---------------------------");

        for (int i = 0; i < n; i++) {
            System.out.println("ID     : " + empId[i]);
            System.out.println("Name   : " + empName[i]);
            System.out.println("Salary : " + salary[i]);
            System.out.println();
        }
    }

    // -------------------- Q120 --------------------
    static void miniProject() {
        int choice;

        String[] students = new String[20];
        int count = 0;

        do {
            System.out.println("\n===== Q120 Complete Mini Project =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count < students.length) {
                        System.out.print("Enter Student Name: ");
                        students[count] = sc.nextLine();
                        count++;
                        System.out.println("Student Added Successfully.");
                    } else {
                        System.out.println("Array Full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Students Available.");
                    } else {
                        System.out.println("\nStudent List");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + students[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].equalsIgnoreCase(search)) {
                            found = true;
                            break;
                        }
                    }

                    if (found)
                        System.out.println("Student Found.");
                    else
                        System.out.println("Student Not Found.");
                    break;

                case 4:
                    System.out.println("Exiting Mini Project...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);
    }

    // -------------------- Main --------------------
    public static void main(String[] args) {

        studentRecordSystem();      // Q117

        miniLibrarySystem();        // Q118

        miniEmployeeSystem();       // Q119

        miniProject();              // Q120
    }
}