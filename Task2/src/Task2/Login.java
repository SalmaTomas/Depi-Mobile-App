package Task2;

import java.util.Scanner;

public class Login {
    public void login()
    {
        Scanner scanner=new Scanner(System.in);
        int chances=3;
        System.out.println("Welcome to the course center application");
        while(chances>0)
        {
            System.out.print("Enter your username: ");
            String username= scanner.nextLine();

            System.out.print("Enter your password: ");
            String password= scanner.nextLine();

            if (ValidatingCredentials.isValidCredentials(Instructors.instructors, username, password))
            {
                System.out.println("Login Successful!! List of Students:");
                for(String student: Instructors.forInstructors)
                {
                    System.out.println(student);
                }
                break;
            }
            else if(ValidatingCredentials.isValidCredentials(Students.students, username, password))
            {
                System.out.println("Login Successful!! List of Courses: ");
                for(String course: Students.forStudents)
                {
                    System.out.println(course);
                }
                break;
            }
            else
            {
                chances--;
                System.out.println("Invalid username or password. " + chances + " attempts remaining.");
            }
            if (chances == 0)
            {
                System.out.println("Exceeded maximum number of attempts. Login failed.");
            }
            //scanner.close();
        }
    }
}
