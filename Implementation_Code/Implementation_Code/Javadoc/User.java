/**
 * Represents a system user in the Smart Hostel application.
 * This class demonstrates the use of Javadoc comments.
 *
 * @author Shehab Shehata
 * @version 1.0
 */
public class User {

    private int id;
    private String name;
    private String role; // ADMIN or STUDENT

    /**
     * Creates a new User object.
     *
     * @param id user unique identifier
     * @param name full name of the user
     * @param role role of the user
     */
    public User(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    /**
     * Returns the user id.
     *
     * @return user id
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the user name.
     *
     * @return user name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the user role.
     *
     * @return user role
     */
    public String getRole() {
        return role;
    }
}
