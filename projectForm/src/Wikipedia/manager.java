package Wikipedia;

import java.io.*;
import java.util.*;
import javax.swing.*;
public class manager extends stuff {
    private String dept;
    private String comment;
    private delete_add d1;
    public String path = "Stuff Data\\manager.txt";
    search S = new search();
    File oldfile;
    Scanner sc;
    
        public String getDept() {
            return dept;
        }

        public void setDept(String dept) {
            this.dept = dept;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }
   public String check_dept_m() // Set path --> manager folder
   {
       String arr1[],arr2[];
       S.setPath(getPath());
       arr1 = S.userSearch(getEmail());
       arr2 = S.Token(arr1[0], '@');
       return arr2[0];
   }
   
   
   
   
    public String firstLine(String a,String b)
    {
        oldfile =new File(a+b);
        String line1 = null;
        try 
        {
            sc = new Scanner(oldfile);
            line1 = sc.nextLine();
            sc.close();
        } catch (FileNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Unable to open file '" + oldfile);
        }
        return line1;
    }
    Article A = new Article();
    public void comment(String newmanager, String mmanagerComm,String artName)
    {
        oldfile =new File(newmanager+artName);
        String contant = A.ShowContant(newmanager,artName);
        String line = firstLine(newmanager,artName);
        try 
        {
            File newfile=new File(mmanagerComm+line+"~"+artName);
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(newfile,true))) {
                bw.write(contant);
                bw.write("Manager Comment : "+comment+"\r\n");
            }
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null,"Unable to open file '" + newmanager);
        }
    }
   
    
}
