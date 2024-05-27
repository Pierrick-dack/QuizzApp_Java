module com.example.easyquiz {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens com.example.easyquiz to javafx.fxml;
    exports com.example.easyquiz;
}