package org.uddalak.apps.messenger;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class HelpMeExceptionMapper implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception e) {
        e.printStackTrace();
        return Response
                    .status(Status.INTERNAL_SERVER_ERROR)
                    .type(MediaType.APPLICATION_XML)
                    .entity(e.getCause())
                    .build();
    }

}