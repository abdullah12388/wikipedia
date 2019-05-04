package Wikipedia;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class Article{
    
    
    private String article_Name;
    private String article_Content;
        public void setArticle_Name(String article_Name) {
            this.article_Name = article_Name + ".txt";
        }

        public void setArticle_Content(String article_Content) {
            this.article_Content = article_Content;
        }
        public String getArticle_Name() {
            return article_Name;
        }

        public String getArticle_Content() {
            return article_Content;
        }
    public String ShowContant(String path,String fileName)
   {
        File oldfile = new File (path+fileName);
        String contant = "";
        try {
            Scanner sc = new Scanner(oldfile);
            while(sc.hasNext())
            {
                contant+= sc.nextLine()+"\r\n";
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Can't open this file " + oldfile);
        }
        return contant;
   }
        
    public void add (user s,String newpath,String oldpath)
    {
            
        search s1 = new search();
        try 
        {
            
            s1.setFolderPath(newpath);
            boolean b1 = s1.FolderSearch(getArticle_Name());
            s1.setFolderPath(oldpath);
            boolean b2 = s1.FolderSearch(getArticle_Name());
            if(b1==false&&b2==false)
            {
                Date dt = new Date();
                String date = String.valueOf(dt);
                File newfile = new File( newpath + getArticle_Name());
                BufferedWriter bfwR = new BufferedWriter(new FileWriter(newfile)) ;
                bfwR.write(s.getEmail());
                bfwR.newLine();
                bfwR.write(date);
                bfwR.newLine();
                bfwR.write(getArticle_Content());
                bfwR.newLine(); 
                bfwR.write("#0#0#0#$");
                bfwR.newLine();
                bfwR.write("$");
                bfwR.close();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"This Name Of Article is used");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    public String[] show(String path)
    {
        
        File dir = new File(path);
        String[] list = dir.list(new FilenameFilter()
        {
            @Override
            public boolean accept(File dir, String name)
            {
                return name.toLowerCase().endsWith(".txt");
            }
        });
        return list;
    }
    
}

