package Wikipedia;

import java.io.*;
import java.util.*;
import javax.swing.*;

public class admin extends stuff{

    public int bill = 0;
    public String comment;
    search s = new search();
    delete_add d1 = new delete_add();
    manager M = new manager();
    String path1 = "Stuff Data\\user.txt";
    File myfile = new File(path1);

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }
    
        
    
    
    public void bill_decrease(String e_mail)
    {
        
        String arr1[];
        String[] a = new String[8];
        try
        {
            Scanner sc = new Scanner(myfile);
            while(sc.hasNext())
            {
                String line = sc.nextLine();
                arr1 = s.Token(line,'$');
                if(e_mail.equals(arr1[0]))
                {
                    bill = Integer.parseInt(arr1[7]);
                    bill = bill-1;
                    for(int i=0;i<8;i++)
                        a[i] = arr1[i];
                    d1.setPath(path1);
                    d1.deleteUser(e_mail);
                    
                }
            }
            sc.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null," Unable to open file " + myfile);
        }
        String w = a[0] + "$" + a[1] + "$" + a[2] + "$" + a[3] + "$" + a[4] + "$" + a[5] + "$" + a[6] +"$"+ bill +"$";
        d1.addLine(path1, w);
    }
    public boolean accept (String oldPath,String newPath,String filename) 
    {
        String[] arr ;
        arr = s.Token(filename+"~", '~');
        File newFile=new File (newPath + arr[0] + "\\really_show\\" + arr[2]);//  C:\Users\TEha\Downloads\part_1\Articles\art\really_show
        File oldFile=new File (oldPath + filename);
        try
        {
            Scanner sc = new Scanner(oldFile);
            String contant = "";
            while(sc.hasNext())
            {
                contant+= sc.nextLine()+"\r\n";
            }
            sc.close();
            BufferedWriter bfwR = new BufferedWriter(new FileWriter(newFile));
            bfwR.write(contant);
            d1.setPath(oldPath+filename);
            boolean deleteFile = d1.deleteFile();
            bfwR.close();
            return deleteFile;
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Unable to open file '" + oldPath + filename);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Unable to write in file '" + newPath+ "'");
        }
        return false;
    }
    public void A_Comment (String article_name)
    {
        String G_mail = M.firstLine("Articles\\Admin\\", article_name);
        File file = new File("Articles\\Admin\\Admin_comment\\"+ G_mail +".txt");
        bill_decrease(G_mail);
        try 
        {
            BufferedWriter br = new BufferedWriter(new FileWriter(file,true));
            br.write(article_name+":"+comment+"\r\n");
            br.close();
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null," Unable to open file " + file);
        }
      
    }
    
}
