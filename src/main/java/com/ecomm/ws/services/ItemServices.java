package com.ecomm.ws.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.ecomm.ws.servicelines.ServicePaths;
import com.ecomm.wsentity.Order;

@Path(ServicePaths.ITEM_SERVICE_BASE_URI)
public interface ItemServices {

	@GET
	@Path(ServicePaths.LIST_ALL_ITEMS)
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Response listAllItems();

	@GET
	@Path(ServicePaths.LIST_ITEM_BY_ID)
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Response listItemByItemId(@PathParam("itemId") String itemId);

/*		
	@GET
	@Path(ServicePaths.LIST_ORDER_BY_EMAIL)
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Response listOrderByEmail(@PathParam("email") String email);
	
	@GET
	@Path(ServicePaths.LIST_ORDER_BY_MOBILE_NO)
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Response listOrderByMobileNumber(@PathParam("mobileNo") String mobileNumber);

	@POST
	@Path(ServicePaths.ADD_ORDER)
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response addOrder(Order wsorder, @Context UriInfo uriInfo);
	
	@PUT
	@Path(ServicePaths.UPDATE_ORDER)
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response updateOrder(Order wsorder, @Context UriInfo uriInfo);
	*/
}