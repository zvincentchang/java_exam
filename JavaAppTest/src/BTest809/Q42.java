package BTest809;
class UserException extends Exception{
    
}
class AgeOutOfLimitException extends UserException{
    
}

public class Q42 {
    public void doRegister(String name,int age) throws UserException,AgeOutOfLimitException{
        if(name.length()<6)
            throw new UserException();
        else if(age>=60)
            throw new AgeOutOfLimitException();
        else
            System.out.println("User is Registered");
    }
    public static void main(String[] args) throws UserException {
       Q42 t=new Q42();
       t.doRegister("Mathew", 60);
    }

}
