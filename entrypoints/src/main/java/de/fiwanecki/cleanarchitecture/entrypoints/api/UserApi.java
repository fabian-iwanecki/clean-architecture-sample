package de.fiwanecki.cleanarchitecture.entrypoints.api;

import de.fiwanecki.cleanarchitecture.data.model.user.UserData;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public interface UserApi {
    @GET
    @Path("/user/{id}")
    UserData getUser(@PathParam("id") String id);
}
