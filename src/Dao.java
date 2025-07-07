package FI_One;

@FunctionalInterface
interface Dao{
    void login();

}
class DaoImpl{
    public static void main(String[] args) {
    /*public void login(){
        System.out.println("login success");
    }*/
    Dao dao=()->{System.out.println("login Success");};
        dao.login();
    }
}