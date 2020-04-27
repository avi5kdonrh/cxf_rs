package com.example;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * This Java class with be hosted in the URI path defined by the @Path annotation. @Path annotations on the methods
 * of this class always refer to a path relative to the path defined at the class level.
 * <p/>
 * For example, with 'http://localhost:8181/cxf' as the default CXF servlet path and '/crm' as the JAX-RS server path,
 * this class will be hosted in 'http://localhost:8181/cxf/crm/customerservice'.  An @Path("/customers") annotation on
 * one of the methods would result in 'http://localhost:8181/cxf/crm/customerservice/customers'.
 */

@Path("/service")
public class CustomerService {


    @POST
    @Path("/customers")
    @Consumes({"application/xml" })
    @Produces({"multipart/mixed"})
    public Response process(@HeaderParam("user_id") String userId, User user){
        return  null;
    }

}