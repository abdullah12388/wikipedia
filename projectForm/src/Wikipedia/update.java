 package Wikipedia;
public class update extends stuff
{
    private search s1 = new search();
    private delete_add d1 = new delete_add();
    String path = "Stuff Data\\user.txt";
    public void update_user(user u,String answer)
    {
        s1.setPath(path);
        d1.setPath(path);
        String[] arr= s1.userSearch(u.getEmail());
        d1.deleteUser(u.getEmail());
        switch (answer)
        {
            case "G-Mail" :
                arr[0] = getEmail();
                break;
            case "Password" :
                arr[1] = getPassword();
                break;
            case "First Name" :
                arr[2] = getFn();
                break;
            case "Last Name" :
                arr[3] = getLn();
                break;
            case "Birthday" :
                arr[4] = getBirthday();
                break;
            case "Mobile" :
                arr[5] = getMob();
                break;    
            default:
                break;
        }
        String w = arr[0] + "$" + arr[1] + "$" + arr[2] + "$" + arr[3] + "$" + arr[4] + "$" + arr[5] + "$" + arr[6] +"$"+ arr[7] +"$";
        d1.addLine(path, w);
        
    }
}
