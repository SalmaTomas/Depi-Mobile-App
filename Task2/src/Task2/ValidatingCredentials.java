package Task2;

public class ValidatingCredentials {
    public static boolean isValidCredentials(String[][] users, String username, String password)
    {
        for (String[] user : users)
        {
            if (user[0].equals(username) && user[1].equals(password))
            {
                return true;
            }
        }
        return false;
    }
}
