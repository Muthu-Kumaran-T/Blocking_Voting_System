public class Admin {
    private int admin_id;
    private String name;
    private String email;
    private String password;
    public Admin(int admin_id, String name, String email, String password) {
        this.admin_id = admin_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public int getAdmin_id() {
        return admin_id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    @Override
    public String toString() {
        return "Admin [admin_id=" + admin_id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
    }
}
