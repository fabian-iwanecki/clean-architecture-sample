package de.fiwanecki.cleanarchitecture.data.entrypoints.user;

import de.fiwanecki.cleanarchitecture.data.model.user.UserData;

public interface UserApi {

    UserData getUser(String id);
}
