package mk.finki.ukim;

import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {
    public static int same = 0;

    public static boolean function (User user, List<User> allUsers) {
        if (user==null || user.getPassword()==null || user.getEmail()==null){ //1
            throw new RuntimeException("Mandatory information missing!"); //2
        }

        if (user.getUsername()==null){ //3
            user.setUsername(user.getEmail()); //4
        }

        same = 1; //5
        if (user.getEmail().contains("@") && user.getEmail().contains(".")) { //6
            same = 0; //7
            for (int i=0;i<allUsers.size();i++) { //8
                User existingUser = allUsers.get(i); //9
                if (existingUser.getEmail() == user.getEmail()) {//10
                    same += 1; //11
                }
                if (existingUser.getUsername() == user.getUsername()) { //12
                    same += 1; //13
                }
            }
        }

        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}"; //14
        String password = user.getPassword(); //15
        String passwordLower = password.toLowerCase(); //16

        if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length()<8) { //17
            return false; //18
        }
        else { //19
            if (!passwordLower.contains(" ")) { //20
                for (int i = 0; i < specialCharacters.length(); i++) { //21
                    if (password.contains(String.valueOf(specialCharacters.charAt(i)))) { //22
                        return same == 0; //23
                    }
                }
            }
        }
        return false; //24
    } //25
}