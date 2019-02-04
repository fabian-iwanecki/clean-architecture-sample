package de.fiwanecki.cleanarchitecture.entrypoints.api;

import de.fiwanecki.cleanarchitecture.data.entrypoints.user.UserApi;
import de.fiwanecki.cleanarchitecture.data.mappers.UserEntityDataMapper;
import de.fiwanecki.cleanarchitecture.data.model.user.UserData;
import de.fiwanecki.cleanarchitecture.domain.usecases.user.GetUserUseCase;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("user")
@Produces(MediaType.APPLICATION_JSON)
public class UserApiImpl implements UserApi {

    private GetUserUseCase getUserUseCase;
    private UserEntityDataMapper userEntityDataMapper;

    @GET
    @Path("{id}")
    public UserData getUser(@PathParam("id") String id) {
        return userEntityDataMapper.mapFrom(getUserUseCase.getUser(id));
    }
}
