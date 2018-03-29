package com.company;

import java.nio.file.Path;
import java.util.Vector;

public class Inbox extends Interfata{

  public Message messageList;

    public Vector  myInterfata;

  public void refresh() {
  }

  public void move(Path folder,String message) {
  }

  public String delete(String message) {
    return message;
  }

  public int markAsRead(String message) {
    return 1;
  }

}