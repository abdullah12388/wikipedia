package Wikipedia;

import java.io.*;
import java.util.*;
import javax.swing.*;
import projectform.*;

public class Part_1 {

    
    public static void main(String[] args) throws IOException {
        // TODO code application logic herestuff Stuff =new stuff();
        
        new proform0().setVisible(true);
        /*String s = "Articles\\art\\manager\\manager_new\\";
        Article a = new Article();
        search r = new search();
        r.setPath(s);
        boolean b = r.FolderSearch("a.txt");
        System.out.println(b);*/
        /*user User = new user();
        manager Manager = new manager();
        admin Admin = new admin();
        Article A = new Article();
        delete_add  Delete = new delete_add();
        search Search = new search();
        String path = "Stuff Data\\user.txt";
        String e_mail = "tteha43@gmail.com";
        
        User.setFn("teha");
        User.setLn("abdo");
        User.setEmail("tteha42@gmail.com");
        User.setPassword("teha01141336724");
        User.setBirthday("28111996");
        User.setMob("01110195639");
        User.setBill_type("free");
        
        Scanner sc = new Scanner(System.in);
        
        String m_comm = "";
        String _new = "" ;
        String _really_show = "" ;
        String _admin = "" ;
        String _manager = "";
        String[] arr;
        String[] list1;
        String ans1 = "";
        int ans2 = 0;
        int ans3 = 0;
        String ans4 = "";
        String answer = "";
        String art_name = "";
        String art_content = "";
        String show_art;
        String test = "";
        System.out.println("user or manager or admin");
        answer = sc.next();
        _admin= "Articles\\Admin";
        // USER
        switch (answer)
        {
            case "user" :
                System.out.println("Enter a part");
                ans1 = sc.next();
                switch (ans1)
                {
                    case "art" : 
                        _new= "Articles\\art\\manager\\manager_new";
                        _really_show = "Articles\\art\\really_show";
                        
                        _manager = "Articles\\art\\manager\\manager_comm";

                        break;
                    case "biology" :
                        _new = "Articles\\biology\\manager\\manager_new";
                        _really_show = "Articles\\biology\\really_show";
                        
                        _manager = "Articles\\art\\manager\\manager_comm";
                        break;
                    default:
                        break;
                }
                System.out.println("Enter a choice :\n 1)add new article\n 2)see manager comment");
                ans2 = sc.nextInt();
                switch (ans2)
                {
                    
                    // Add new Atricle to manager
                    case 1 :
                        System.out.println("Article Name : ");
                        art_name = sc.next();
                        A.setArticle_Name(art_name);
                        System.out.println("Article content : ");
                        art_content = sc.next();
                        A.setArticle_Content(art_content);
                        A.add(User, _new+"\\", _new, _really_show);
                    break;
                    case 2 :
                        // See manager comment
                        System.out.println(" set Article Name : ");
                        art_name = sc.next();
                        User.setArticle_Name(art_name);
                        show_art = User.see_manager_comm(_manager+"\\");
                        System.out.println("your article : \n" + show_art);
                        // add the Article again
                        System.out.println("1)add the Article again\n 2)leave this article ");
                        ans3 = sc.nextInt();
                        if(ans3 == 1)
                        {
                            System.out.print("set Article content : ");
                            art_content = sc.next();
                            A.setArticle_Content(art_content);
                            A.setArticle_Name(ans1 + "~" + User.getEmail() + "~" + art_name + ".txt");
                            A.add(User, _admin+"\\", _new, _new);
                            Delete.setPath(_manager+"\\"+User.getEmail() + "~" + art_name+".txt");
                            Delete.deleteFile();
                        }else if(ans3 == 2)
                        {
                            System.out.println("Enter your article's name : ");
                            art_name = sc.next();
                            delete(_manager + "\\" + User.getEmail() + "~" + art_name+".txt");
                        }
                    break;
                    default:
                        break;
                }
            break;
            ////////////////////////////////////////////////////
            
            // Manager
            case "manager" :
                System.out.println("choose a part");
                ans1 = sc.next();
                switch (ans1)
                {
                    case "art" :
                        _new= "Articles\\art\\manager\\manager_new";
                        _really_show = "Articles\\art\\really_show";
                        
                        _manager = "Articles\\art\\manager\\manager_comm";
                        
                        break;
                    case "biology" :
                        _new = "Articles\\biology\\manager\\manager_new";
                        _really_show = "Articles\\biology\\really_show";
                        
                        _manager = "Articles\\art\\manager\\manager_comm";
                        break;
                    default:
                        break;
                }
                // Manager Comment
                list1 = A.show(_new);
                System.out.println("all added articles :\n");
                for(String list : list1)
                    System.out.println(list);
                        
                show_art = Manager.ShowContant(_new+"\\", list1[0]);
                System.out.println(show_art);

                System.out.println("Manager comment : ");
                m_comm = sc.next();
                Manager.setComment(m_comm);
                
                System.out.println("Delete Old : ");
                test = sc.next();
                switch(test)
                {
                    case "delete" :
                        boolean b;
                        b = Manager.comment(_new+"\\", _manager+"\\", list1[0]);
                        System.out.println(b);
                    break;
                }
            break;
            ///////////////////////////////////////////////////////////
            
            //Admin
            case "admin" :
                System.out.println("add or delete or see payss");
                        ans4 = sc.next();
                switch(ans4)
                {
                    
                        
                    case "add" :
                        list1 = A.show(_admin);
                        show_art = list1[0];
                        Search.setFolderPath(_admin);
                        boolean b = Search.FolderSearch(show_art);
                        if(b == true)
                        {
                            boolean b1;
                            b1 = Admin.accept(_admin+"\\", "Articles\\",show_art);
                            System.out.println(b1);
                        }
                        else
                            JOptionPane.showMessageDialog(null,"there's no articles yet");
                        break;
                    
                    case "see" :
                        int s;
                        s = User.collect_bill();
                        System.out.println("all pays value = " + s);
                        break;
                    default :
                        break;
                }
            break;
            default:
                break;
                
                
        }
        
        Rate r = new Rate();
        r.setPath("Articles\\art\\manager\\manager_new\\A.txt");
        r.setRate(6);
        r.Rating();
        r.setComment("zzzzz");
        r.AddComment();
        int show;
        show = r.ShowRate();
        System.out.println(show);
    }
    
    
    
    */
    }    
/*public static  void delete(String path)
    {
        File file = new File(path);
        try{
    		if(file.delete()){
    			System.out.println(file.getName() + " is deleted!");
    		}else{
                        JOptionPane.showMessageDialog(null,"Delete operation is failed.");
    		}

    	}catch(Exception e){

    		e.printStackTrace();

    	}
    }
    public static  void move_to_admin()
    {
        user U = new user();
        manager M = new manager();
        Article A = new Article();
        String m_comm = "";
         U.setEmail("tteha42@gmail.com");
                U.setArticle_Name("A");
                m_comm = U.see_manager_comm("Articles\\biology\\manager\\manager_comm\\");
                if(m_comm == null)
                    JOptionPane.showMessageDialog(null,"not found");
                else
                    System.out.println(m_comm);
                U.setFn("teha");
                A.setArticle_Content("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
                A.setArticle_Name("A");
                A.add(U,"Articles\\Admin\\",
                        "Articles\\biology\\manager\\manager_new",
                        "Articles\\biology\\really_show");
    }*/
    
    
}
