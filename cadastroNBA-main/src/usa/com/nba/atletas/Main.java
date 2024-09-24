package usa.com.nba.atletas;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	@Override
	public void start(Stage palcoPrincipal) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("telaUm.fxml"));
			Scene cenario = new Scene(root);
			cenario.getStylesheets().add(getClass().getResource("/usa/com/nba/atletas/estilo.css").toExternalForm());
			palcoPrincipal.setScene(cenario);
			palcoPrincipal.setTitle("LAAnalytics");
			palcoPrincipal.getIcons().add(new Image(getClass().getResourceAsStream("/usa/com/nba/atletas/NBA_logo.png")));
			palcoPrincipal.setMaximized(true);
			palcoPrincipal.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
