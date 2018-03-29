package com.company;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

public class Compose extends Interfata{

  public String sender;

  public String subjectTile;

  public String content;

    public Vector  myInterfata;

  public void save() {
  }

  public void send(String email,String subject) {
  }

  public void attachFiles(String files) {
    try {
      Desktop desktop = Desktop.getDesktop();
      desktop.open(new File(files));
    } catch (IOException e) {
      System.out.println("Opening failed");
    }
    }

  public void formatText() {
  }

}