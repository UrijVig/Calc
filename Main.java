
import Presenter.UserPresenter;
import View.UserView;

public class Main {
    public static void main(String[] args) {
        UserPresenter userPresenter = new UserPresenter();
        UserView userView = new UserView(userPresenter);
        userView.run();
    }
}
