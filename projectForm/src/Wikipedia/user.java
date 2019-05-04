
package Wikipedia;

import java.util.*;
import java.io.*;
import javax.swing.*;

public class user extends stuff
{    
    private String Article_Name;

    public void setArticle_Name(String Article_Name) {
        this.Article_Name = Article_Name;
    }

    public String getArticle_Name() {
        return Article_Name;
    }
    
    search s1 = new search();
    String path="Stuff Data\\user.txt";
    File myfile = new File(path);
    public void signUp()
    {
        search s = new search();
        s.setPath(path);
        String[] i=s.userSearch(getEmail());
        if(i==null)
        {
            bill_count = check_pay();
            BufferedWriter r;
            try 
            {
                r = new BufferedWriter (new FileWriter(myfile, true));
                r.write(getEmail() + "$" + getPassword() + "$" + getFn() + "$" + getLn() + "$" + getBirthday() + "$" + getMob() + "$" + getBill_type() + "$" + bill_count +"$" + "\r\n");
                r.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,"Unable to open file '" + path + "'");            }        
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"This E-mail is used");
        }
       
    }
      
    protected int check_pay()
    {
        int a = 0;
        switch(getBill_type())
        {
            case "free" :
                a =  30;
                break;
            case "premium" :
                a = 90;
                break;
        }
        return a;
    }
    public int collect_bill()
    {
        File myfile = new File(path);
        String[] arr;
        String line;
        int sum = 0;
        try 
        {
            Scanner sc = new Scanner(myfile);
            while(sc.hasNext())
            {
                line = sc.nextLine();
                arr = s1.Token(line, '$');
                if(arr[6].equals("premium"))
                    sum+=90;
            }
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Can't open "+ myfile);
        }
        return sum;
    }
    
    
    public String see_manager_comm(String oldpath)
    {
        manager M = new manager();
        Article A = new Article();
        String show_art = "";
        String s3 = getEmail()+ "~" + getArticle_Name()+ ".txt";// A.getArticle_Name()
        String[] articles = null;
        articles = A.show(oldpath);
        
        for(int i=0;i<articles.length;i++)
        {
            
            if(s3.equals(articles[i]))
            {  
                show_art = A.ShowContant(oldpath, s3);
                return show_art;
            } 
            else 
                JOptionPane.showMessageDialog(null,"not found OR sent to Admin");
        }
        return null;
    }
    
}









