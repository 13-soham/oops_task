package Oops;

public class client {
    static class about{
        String name = "Raunak";
        int id = 225;
        double balance = 53690;
    }
     static class details{
        private int password;
        void setPassword(int password){

            this.password = password;
        }
        int getPassword(){

            return password/10000;
        }
        int checkPassword(){

            return password;
        }
    }
}
