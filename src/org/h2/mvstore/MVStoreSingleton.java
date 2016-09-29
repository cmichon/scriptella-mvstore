package org.h2.mvstore;

public class MVStoreSingleton {

  private MVStoreSingleton() {}

  private static class MVStoreSingletonHolder {
    private static final MVStore INSTANCE = MVStore.open("db");
  }

  public static MVStore getInstance() {
    MVStore INSTANCE = MVStoreSingletonHolder.INSTANCE;
    return MVStoreSingletonHolder.INSTANCE;
  }

}
