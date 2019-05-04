    
package Wikipedia;

import java.io.*;
import java.util.*;
import javax.swing.*;


public class delete_add extends search
{
    File myfile;
    
    public void deleteUser(String e_mail)
    {
        myfile = new File(getPath());
        String[] a = userSearch(e_mail);
        if(a!=null)
        {
            String lineToRemove = a[0] + "$" + a[1] + "$" + a[2] + "$" + a[3] + "$" + a[4] + "$" + a[5] + "$" + a[6] +"$"+ a[7] +"$";
            ArrayList <String> list = new ArrayList();
            
            try
            {
                Scanner sc = new Scanner(myfile);
                while(sc.hasNext())
                {
                    String line = sc.nextLine();
                    list.add(line);
                }

            } 
            catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null," Unable to open file " + myfile);
            }
            for(int i=0;i<list.size();i++)
                if(list.get(i).equals(lineToRemove))
                    list.remove(lineToRemove);
            try {
                PrintWriter pw = new PrintWriter(new FileWriter(myfile));
                for(int i=0;i<list.size();i++)
                    pw.println(list.get(i));
                pw.close();
            } 
            catch (IOException ex) {
                JOptionPane.showMessageDialog(null,"Unable to open file '" + myfile + "'");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"This user not found");
        }
    
    }
    public boolean deleteFile()
    {
        File myfile =  new File(getPath());
        boolean b = myfile.delete();
        return b;
    }
    public void addLine(String path, String lineToAdd)
    {
        myfile = new File(path);
        String a[];
        
        ArrayList<String> list=new ArrayList();
        try 
        {
            Scanner sc = new Scanner(myfile);
            while(sc.hasNext())
            {
                String line = sc.nextLine();
                list.add(line);
            }
            list.add(lineToAdd);
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null," Unable to open file " + myfile);
        }
        
        try {
            PrintWriter pr1 = new PrintWriter(myfile);
            for(int i=0;i<list.size();i++)
                pr1.println(list.get(i));
            pr1.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Unable to open file " + path);
        }
    }

  
    
    
}
