package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dtos.PersonDTO;
import utils.EMF_Creator;
import facades.FacadeExample;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*

//Todo Remove or change relevant parts before ACTUAL use
@Path("person")
public class PersonResource {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();
       
    private static final FacadeExample FACADE =  FacadeExample.getFacadeExample(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
            
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String demo() {
        return "{\"msg\":\"Hello World\"}";
    }
    @Path("count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String getRenameMeCount() {
        long count = FACADE.personCount();
        //System.out.println("--------------->"+count);
        return "{\"count\":"+count+"}";  //Done manually so no need for a DTO
    }
    
    @Path("{phoneNumber}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String getPerson(@PathParam("phoneNumber") String phoneNumber) {
        PersonDTO pDTO = FACADE.getPerson(phoneNumber);
        return GSON.toJson(pDTO);
    }
    
    @Path("hobbies/{hobby}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String getAllPersonsHobbies(@PathParam("hobby") String hobby){
        PersonDTO pDTO = FACADE.getAllPersonHobbies(hobby);
        return GSON.toJson(pDTO);
    }
    
    @Path("cities/{city}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String getAllPersonsCity(@PathParam("city") String city)  {
        PersonDTO pDTO = FACADE.getAllPersonCity(city);
        return GSON.toJson(pDTO);
    }
    
   
}
*/
