public class MainApplication {
    public static void main(String[] args) {
        // Creating Admin and User objects
        Admin curAdmin = new Admin(1234, "Stephan", "xa1@LW42%3");
        User curUser = new User(4455, "John");

        // Admin performs an Update operation
        System.out.println(curAdmin.getName() + " (Admin) is updating data:");
        curAdmin.performOperation(new Update());

        // User performs a View operation
        System.out.println(curUser.getName() + " (User) is viewing data:");
        curUser.performOperation(new View());

        // Admin performs a Delete operation
        System.out.println(curAdmin.getName() + " (Admin) is deleting data:");
        curAdmin.performOperation(new Delete());
    }
}
