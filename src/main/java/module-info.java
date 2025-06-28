module com.samir.mp3player.mp3_player {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.samir.mp3player.mp3_player to javafx.fxml;
    exports com.samir.mp3player.mp3_player;
}