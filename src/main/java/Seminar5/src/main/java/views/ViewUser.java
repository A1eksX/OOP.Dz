package views;

import controllers.UserController;
import model.User;
import views.validator.NameAndSurnameValidator;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Введите команду: ");
            try {
                com = Commands.valueOf(command.toUpperCase());

            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    createUser();
                    break;
                case READ:
                    readUser();
                    break;
                case LIST:
                    readList();
                    break;
                case UPDATE:
                    updateUser();
                    break;
                case DELETE:
                    deleteUser();
                    break;
            }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    private void deleteUser() throws Exception {
        User userID = getUser(); //получаем (П) для удаления
        userController.deleteUser(userID);
        System.out.println("Пользователь удалён");

    }

    private void updateUser() throws Exception {
        User user = getListUser();
        User updatedUser = getNewUser(); //обновляем пользователя
        updatedUser.setId(user.getId());  // подставили (П) ID
        User savedUser = userController.updateUser(updatedUser);
        System.out.println(savedUser);
    }

    private User getListUser() throws Exception {
        readList();//чтобы обновить пользователей(П), надо сначала дать список текущих (П)
        User user = getUser(); //получаем ID (П), и начинаем редактировать
        return user;
    }

    private void readList() {       // список текущих пользователей(П)
        List<User> listUser = userController.readAllUsers();
        for (User unit: listUser) {
            System.out.println(unit);
        }
    }

    private void readUser() throws Exception {
        User user = getUser();
        System.out.println(user);
    }

    private User getUser() throws Exception {
        String id = prompt("Идентификатор пользователя: ");
        User user = userController.readUser(id);
        return user;
    }

    private void createUser() throws Exception {
        User user = getNewUser();
        userController.saveUser(user);
    }

    private User getNewUser() throws Exception {
        String firstName = prompt("Имя: ");
        new NameAndSurnameValidator(firstName).validate();
        String lastName = prompt("Фамилия: ");
        new NameAndSurnameValidator(lastName).validate();
        String phone = prompt("Номер телефона: ");
        User user = new User(firstName, lastName, phone);
        return user;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
