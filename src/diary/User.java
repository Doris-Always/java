package diary;

public class User {
    private String userName;

    private String password;

    private int userId;

    private String userEmail;

    public String getUserName() {
        return userName;

    }

    public void setUserName(String nameOfUser){
        userName = nameOfUser;
    }



    public String getPassword(String password){

        return password;
    }

    public int getUserId(){
        return userId;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }

    public String getUserEmail(){
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
