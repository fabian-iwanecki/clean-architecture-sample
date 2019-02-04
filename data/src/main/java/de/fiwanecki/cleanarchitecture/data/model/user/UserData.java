package de.fiwanecki.cleanarchitecture.data.model.user;

import java.io.Serializable;

public class UserData implements Serializable {
    private String uuid;
    private String username;
    private String email;

    public UserData() {
    }

    public UserData(String uuid, String username, String email) {
        this.uuid = uuid;
        this.username = username;
        this.email = email;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
