
package libraryassistant.signup;

/**
 *
 * @author Gabriel
 */
public class adminInfo {
    private int id;
    private String email;
    private String password;
   
    public adminInfo(){
    }

    public adminInfo(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     
    @Override
    public String toString() {
        return "adminInfo{" + "id=" + id + ", email=" + email + ", password=" + password + '}';
    }
    
}
