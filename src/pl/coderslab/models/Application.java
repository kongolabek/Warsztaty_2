package pl.coderslab.models;

public class Application {

    public static void main(String[] args) {
        User user = new User("Konrad", "wariat123@gmail.com", "password555");

        UserDao userDao = new UserDao();

        //---------------WRITE-------------------

        //CHcemy zapisac uzytkownika user do bazy danych
//        System.out.println("Przed zapisem"+ user);
//        user = userDao.create(user);
//        System.out.println("Po zapisie"+ user);


        //----------------READ-------------------

        User user2 = userDao.read(1);
        System.out.println("Istniejacy user w bazie "+user2);
        User user3 = userDao.read(1212);
        System.out.println("Niestniejacy user w bazie "+user3);

        //---------------UPDATE-----------------

        user2.setUserName("Lepszy username");
        userDao.update(user2);

        //---------------DELETE-----------------
        userDao.delete(1);


    }
}
