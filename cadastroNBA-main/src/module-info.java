module LAAnalytics {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.sql;
	requires javafx.base;
	
	opens usa.com.nba.atletas to javafx.graphics, javafx.fxml;
}
