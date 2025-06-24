public class User {
    private int user_id;
    private String name;
    private String email;
    private String password;
    private String mobile_no;

    public User(int user_id,String name, String email, String password, String mobile_no) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobile_no = mobile_no;
    }
    public int getUser_id() {
        return user_id;
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
    public String getMobile_no() {
        return mobile_no;
    }
    @Override
    public String toString() {
        return "User [user_id=" + user_id + ", name=" + name + ", email=" + email + ", password=" + password
                + ", mobile_no=" + mobile_no + "]";
    }
    
    
    
}
