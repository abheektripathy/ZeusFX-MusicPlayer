module com.tripathy.zeusfxmp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;



    opens com.tripathy.zeusfxmp to javafx.fxml;
    exports com.tripathy.zeusfxmp;
}