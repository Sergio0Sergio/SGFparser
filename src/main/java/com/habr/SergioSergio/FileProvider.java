package com.habr.SergioSergio;

import java.io.IOException;
import java.nio.file.Path;

public interface FileProvider {

  String createFromPath(Path path, String charSet);
  String createFromPath(Path path);
}
