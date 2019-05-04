package Wikipedia;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class stuff {
    
    private String fn;
    private String ln;
    private String email;
    private String password;
    private String mob;
    private String birthday;
    private String bill_type;
    public int bill_count;
    private String path;
    private search s1 = new search();

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
    
    
    
    public String getFn() {
        return fn;
    }
    
    public String getLn() {
        return ln;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getMob() {
        return mob;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getBill_type() {
        return bill_type;
    }

   

    public void setFn(String fn) {
        this.fn = fn;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setBill_type(String bill_type) {
        this.bill_type = bill_type;
    }
        
     public boolean sign_in()
    {
        String arr1[];
        File myfile = new File(getPath());
        boolean b = false;
        try
        {
            Scanner sc = new Scanner(myfile);
            while(sc.hasNext())
            {
                String line = sc.nextLine();
                arr1 = s1.Token(line, '$');
                if(getEmail().equals(arr1[0]) && getPassword().equals(arr1[1]))
                {
                    sc.close();
                    b = true;
                    return b;
                }
            }
            sc.close();
            return b;
        } 
        catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Unable to open file " + getPath());
            }
        return b;
    }
    
    
    
}
