package org.redhat.janus;

public class UserEntity {
  public String name;
  public String email;
  public String id;

  public UserEntity() {
  }

  public UserEntity(String name, String email) {
    this.name = name;
    this.email = email;
  }
}
