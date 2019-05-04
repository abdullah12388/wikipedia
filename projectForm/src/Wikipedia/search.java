package Wikipedia;
import java.io.*;
import javax.swing.*;

public class search 
{
    private String path;
    private String folderPath;

    public void setPath(String path) {
        this.path = path;
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public String getPath() {
        return path;
    }

    public String getFolderPath() {
        return folderPath;
    }
    
    
    protected String[] Token(String Line,char sp)
    {
        String [] result =new String[50];
        String word="";
        int crt=0;
        for(int i=0;i<Line.length();i++)
        {
            if(Line.charAt(i)!=sp)
            {
                word+=Line.charAt(i);
            }
            else
            {
                result[crt]=word;
                crt++;
                word=new String();
            }
        }
        return result;
    }
    public String[] userSearch(String email)
    {
        String []arr=null;
        String line = null;
        BufferedReader bufferedReader = null;
        try
        {
            FileReader fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null)
            {
                String [] s = Token(line,'$');
                if(email.equals(s[0]))
                {
                    bufferedReader.close();
                    return s;
                } 
            }
            bufferedReader.close();
            return arr;
        }
        catch (FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,"Unable to open file '" + path + "'");
        }
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null,"Error reading file '" + path + "'");
        }
        return arr;
    }
    public boolean FolderSearch (String x)
    {
        File dir = new File(folderPath);
        String[] file = dir.list();
        for (String file1 : file) {
            if (x.equals(file1)) {
                return true;
            }
        }
        return false;
    }
}
