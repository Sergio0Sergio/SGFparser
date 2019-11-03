package com.habr.SergioSergio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProviderSimple implements FileProvider {

  private String gameAsString;

  public FileProviderSimple(){}

  @Override
  public String createFromPath(Path path, String charSet) {
    try {
      String gameAsString = new String(Files.readAllBytes(path), charSet);
    } catch (IOException e) {
      System.err.println("Can't read a sgf file");
      e.printStackTrace();
    }
    return gameAsString;
  }

  @Override
  public String createFromPath(Path path) {

    try {
      String gameAsString = new String(Files.readAllBytes(path), "UTF-8");
    } catch (IOException e) {
      System.err.println("Can't read a sgf file");
      e.printStackTrace();
    }

    return gameAsString;
  }
}
