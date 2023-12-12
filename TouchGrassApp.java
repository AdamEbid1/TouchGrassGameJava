import TouchGrassModel.TouchGrassModel;
import javafx.application.Application;
import javafx.stage.Stage;
import views.TouchGrassView;
import java.io.IOException;

/**
 * Class TouchGrassApp.
 */
public class TouchGrassApp extends  Application {

    TouchGrassModel model;
    TouchGrassView view;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.model = new TouchGrassModel();
        this.view = new TouchGrassView(model, primaryStage);
    }
}
