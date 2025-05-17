using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using PetGroomerAPI.Data;
using PetGroomerAPI.Models;

namespace PetGroomerAPI.Controllers;

// [controller] parses the name of the class by removing "Controller" to get "Clients".
// So this route is "/api/clients"
[Route("api/[controller]")]
[ApiController]
public class ClientsController : ControllerBase
{

    private readonly DatabaseContext context;

    // Injecting our database context.
    public ClientsController(DatabaseContext context)
    {
        this.context = context;
    }

    // Get all clients.
    [HttpGet]
    public async Task<ActionResult<List<Client>>> GetClients()
    {
        return await context.Clients.ToListAsync();
    }

    // Get client by id.
    [HttpGet("{id}")]
    public async Task<ActionResult<Client>> GetClientById(long id)
    {
        Client client = await context.Clients.FindAsync(id);

        if (client is null)
        {
            return NotFound();
        }
        return client;
    }

    // Create a client.
    /* 
     * How the JSON Deserializer and EF Core works here since we aren't receiving an Id property from the client:
     * We expect a request from the client with every property that Client has except for Id. Since Id was not provided it will 
     * create a Client object with an id of 0 as a filler (since a `long` type can’t be null). When we go to add this the database, 
     * EF Core doesn't even bother with the Id value since the database is supposed to deal with it. (You can see the SQL statement
     * that it generates in the console, it doesn't try to add an Id).
    */
    [HttpPost]
    public async Task<ActionResult<Client>> CreateClient(Client client)
    {
        if (client is null)
        {
            return BadRequest();
        }

        // Add() methods tells EF Core to track the entity, it doesn't actually insert it to the db.
        // It should be inserted into the database on the next SaveChanges() call.
        context.Clients.Add(client);
        // When we are ready to save the changes, we need to call this:
        await context.SaveChangesAsync();

        /* 
         * CreatedAtAction returns a '201 Created' status code WITH:
         * 1. The location of the item (the api endpoint that you can find it at). It returns this in the "Location" response header.
         * 2. The newly created object itself.
         * (It's convention to return this information).
         * 
         * Explaining the routeValues parameter: 
         * The section parameter is the route values to go along with the location you're sending. So we are creating a new object with 
         * an 'Id' property and it's value being the object's Id that we just created. This is because our GetClientById() method, which
         * is the location that we described in the first parameter, takes in an Id parameter (route value).
         * 
         * Side note: How does it know the Id of the client? Didn't the db create that?
         * Yes. EF Core also retrieves the id of the newly added entity. (Ex. With MySQL it uses LAST_INSERT_ID()).
        */
        return CreatedAtAction(nameof(GetClientById), new {id = client.Id}, client);
    }

    // Update client.
    [HttpPut("{id}")]
    public async Task<ActionResult<Client>> UpdateClient(long id, Client updatedClient)
    {
        // Get the client.
        // EF Core starts tracking the object.
        Client client = await context.Clients.FindAsync(id);

        if (client is null) 
        {
            return NotFound();
        }

        // Update the client.
        // Since EF Core started tracking this client object the moment we retrieved it, 
        // it'll keep track of any changes we make to it.
        client.FirstName = updatedClient.FirstName;
        client.LastName = updatedClient.LastName;
        client.PhoneNumber = updatedClient.PhoneNumber;

        // EF Core knows that the client object above has been changed and updates i
        await context.SaveChangesAsync();

        return NoContent();
    }

    // Delete client.
    [HttpDelete("{id}")]
    public async Task<ActionResult> DeleteClient(long id)
    {
        // Get the client.
        Client client = await context.Clients.FindAsync(id);

        if (client is null)
        {
            return NotFound();
        }

        // Delete the client.
        // Again, like Add(), the Remove() method tracks the entity.
        // So since we are making a change, we need to save the changes to implement it.
        context.Clients.Remove(client);
        await context.SaveChangesAsync();

        return NoContent();
    }
}