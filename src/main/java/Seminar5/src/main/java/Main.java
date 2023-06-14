/*
Сделать удаление из справочника пользователей
* Сделать сохранение в другом формате, например, не через запятую,
а через точку с запятой, и разделителем - пустой строкой. Предусмотреть сохранение в старом формате.
 */
import controllers.UserController;
import model.FileOperation;
import model.FileOperationImpl;
import model.Repository;
import model.RepositoryFile;
import views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
