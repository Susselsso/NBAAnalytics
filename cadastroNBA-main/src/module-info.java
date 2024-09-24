module LAAnalytics {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.sql;
	
	opens usa.com.nba.atletas to javafx.graphics, javafx.fxml;
}
