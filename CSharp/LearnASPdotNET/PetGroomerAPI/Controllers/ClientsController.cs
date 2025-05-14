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

        // CreatedAtLocation returns a '201 Created' status code WITH:
        // 1. The location of the item (the api endpoint that you can find it at).
        // 2. The newly created object itself.
        return CreatedAtAction(nameof(GetClientById), new {id = client.Id}, client);
    }

    // Update client.
    [HttpPut("{id}")]
    public async Task<ActionResult<Client>> UpdateClient(long id, Client updatedClient)
    {
        // Get the client.
        Client client = await context.Clients.FindAsync(id);

        if (client is null) 
        {
            return NotFound();
        }

        // Update the client.
        client.FirstName = updatedClient.FirstName;
        client.LastName = updatedClient.LastName;
        client.PhoneNumber = updatedClient.PhoneNumber;

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
        context.SaveChangesAsync();

        return NoContent();
    }
}