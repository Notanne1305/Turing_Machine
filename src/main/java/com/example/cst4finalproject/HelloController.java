package com.example.cst4finalproject;

import javafx.fxml.FXML;
import java.io.FileInputStream;
import javafx.scene.text.Font;
import java.io.FileNotFoundException;



public class HelloController {
    private Font Font;

    @FXML

    public void initialize() throws FileNotFoundException {

            String fontPath = "C:\\Users\\Jonathan\\IdeaProjects\\CST4 FINALPROJECT\\src\\main\\resources\\Fonts\\TekturNarrow-Black.ttf";

            // Load the font from the file
            FileInputStream fontStream = new FileInputStream(fontPath);
            Font= Font.loadFont(fontStream, 20);
        }
    }
