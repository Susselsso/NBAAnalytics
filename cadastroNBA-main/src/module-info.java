module LAAnalytics {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens usa.com.nba.atletas to javafx.graphics, javafx.fxml;
}
