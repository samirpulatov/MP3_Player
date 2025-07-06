package com.samir.mp3player.mp3_player.services;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class ImageViewService {

    public static ImageView getBackGroundImage(){
        Image image = new Image(String.valueOf(ImageViewService.class.getResource("/images/Background.jpg")),true); // true for background loading
        ImageView imageView = new ImageView(image);


        return imageView;
    }

}
