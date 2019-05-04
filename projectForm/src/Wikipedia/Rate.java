package Wikipedia;

import java.io.*;
import java.util.*;
import javax.swing.*;

public class Rate extends search
{
    private int rate;
    private String comment;
    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }
    
    public void Rating () throws IOException
    {
        String contant;
        String [] s;
        int x,y,z;
        try {
            contant=new Scanner(new File(getPath())).useDelimiter("\\A").next();
            s = Token (contant,'#');
            x= Integer.parseInt(s[1]);
            y= Integer.parseInt(s[2]);
            x=x+1;
            y=y+rate;
            z=y/x;
            File New = new File(getPath());
            BufferedWriter bfwR = new BufferedWriter(new FileWriter(New));
            bfwR.write(s[0]);
            bfwR.write("#"+String.valueOf(x)+"#"+String.valueOf(y)+"#"+String.valueOf(z)+"#");
            bfwR.write(s[4]+"#");
            bfwR.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Unable to open file '" + getPath()+ "'");
        }
    }
    public int ShowRate()
    {
        String contant;
        String [] s;
        int z;
        try {
            contant=new Scanner(new File(getPath())).useDelimiter("\\A").next();
            s = Token (contant,'#');
            z= Integer.parseInt(s[3]);
            return z;
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Unable to open file '" + getPath()+ "'");
        }
        return -1;
    }
    public void AddComment ()
    {
        String contant;
        String [] s;
        try {
            contant=new Scanner(new File(getPath())).useDelimiter("\\A").next();
            s = Token (contant,'#');
            File New = new File(getPath());
            BufferedWriter bfwR = new BufferedWriter(new FileWriter(New));
            bfwR.write(s[0]);
            bfwR.write("#"+s[1]+"#"+s[2]+"#"+s[3]+"#"+s[4]);
            bfwR.newLine();
            bfwR.write(comment+"#");
            bfwR.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Unable to open file '" + getPath()+ "'");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Unable to read from file '" + getPath()+ "'");
        }
    }
}
