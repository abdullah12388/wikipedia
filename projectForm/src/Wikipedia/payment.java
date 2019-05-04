
package Wikipedia;

import java.io.*;
import javax.swing.*;


public class payment {
    private String check_f_p;
    private String check_C_G;
    private String Cridit_Name;
    private String Gift_Card_Name;
    private String Cridit_Number;
    private String Gift_Card_Number;

    public void setCheck_f_p(String check_f_p) {
        this.check_f_p = check_f_p;
    }

    public void setCheck_C_G(String check_C_G) {
        this.check_C_G = check_C_G;
    }

    public void setCridit_Name(String Cridit_Name) {
        this.Cridit_Name = Cridit_Name;
    }

    public void setGift_Card_Name(String Gift_Card_Name) {
        this.Gift_Card_Name = Gift_Card_Name;
    }

    public void setCridit_Number(String Cridit_Number) {
        this.Cridit_Number = Cridit_Number;
    }

    public void setGift_Card_Number(String Gift_Card_Number) {
        this.Gift_Card_Number = Gift_Card_Number;
    }

    public String getCheck_f_p() {
        return check_f_p;
    }

    public String getCheck_C_G() {
        return check_C_G;
    }

    public String getCridit_Name() {
        return Cridit_Name;
    }

    public String getGift_Card_Name() {
        return Gift_Card_Name;
    }

    public String getCridit_Number() {
        return Cridit_Number;
    }

    public String getGift_Card_Number() {
        return Gift_Card_Number;
    }
    
    public void Check_Free_premium()
    {
        if(getCheck_f_p().equals("premium"))
        {
            if(getCheck_C_G().equals("credit"))
            {
                Credit_Debit_Card();
            }
            else
            {
                Gift_Card();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "You have 30 articles per month.");
        }
    }
    
    private void Credit_Debit_Card()
    {
        try {
            File pay = new File("Payment");
            pay.mkdir();
            File cr = new File(pay,"Cridit.txt");
            BufferedWriter bfwC = new BufferedWriter(new FileWriter(cr,true));
            bfwC.write(getCridit_Name());
            bfwC.write("^");
            bfwC.write(getCridit_Number());
            bfwC.newLine();
            bfwC.write("####################################################################");
            bfwC.newLine();
            bfwC.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
    private void Gift_Card()
    {
        try {
            File pay = new File("Payment");
            pay.mkdir();
            File gf = new File(pay,"Gift.txt");
            BufferedWriter bfwG = new BufferedWriter(new FileWriter(gf,true));
            bfwG.write(getGift_Card_Name());
            bfwG.write("^");
            bfwG.write(getGift_Card_Number() );
            bfwG.newLine();
            bfwG.write("####################################################################");
            bfwG.newLine();
            bfwG.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}

