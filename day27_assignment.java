import java.util.Scanner;

public class day27_assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ================= Q105 Student Record Management System =================
        System.out.println("===== Student Record Management System =====");

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Student Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();

        System.out.println("\nStudent Record");
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + studentName);
        System.out.println("Course     : " + course);
        System.out.println("Age        : " + age);

        // ================= Q106 Employee Management System =================
        System.out.println("\n===== Employee Management System =====");

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double empSalary = sc.nextDouble();

        System.out.println("\nEmployee Record");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + empName);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + empSalary);

        // ================= Q107 Salary Management System =================
        System.out.println("\n===== Salary Management System =====");

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        double da = sc.nextDouble();

        System.out.print("Enter Other Allowance: ");
        double allowance = sc.nextDouble();

        double totalSalary = basic + hra + da + allowance;

        System.out.println("\nSalary Details");
        System.out.println("Basic Salary    : " + basic);
        System.out.println("HRA             : " + hra);
        System.out.println("DA              : " + da);
        System.out.println("Allowance       : " + allowance);
        System.out.println("Total Salary    : " + totalSalary);

        // ================= Q108 Marksheet Generation System =================
        System.out.println("\n===== Marksheet Generation System =====");

        System.out.print("Enter Student Name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Enter Marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter Marks of Subject 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter Marks of Subject 5: ");
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 5.0;

        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 40)
            grade = "D";
        else
            grade = "Fail";

        System.out.println("\n===== Marksheet =====");
        System.out.println("Student Name : " + name);
        System.out.println("Subject 1    : " + m1);
        System.out.println("Subject 2    : " + m2);
        System.out.println("Subject 3    : " + m3);
        System.out.println("Subject 4    : " + m4);
        System.out.println("Subject 5    : " + m5);
        System.out.println("Total Marks  : " + total);
        System.out.println("Percentage   : " + percentage + "%");
        System.out.println("Grade        : " + grade);

        sc.close();
    }
}
