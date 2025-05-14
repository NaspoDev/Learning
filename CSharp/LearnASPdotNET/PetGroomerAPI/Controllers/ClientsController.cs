using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
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
    public ActionResult<List<Client>> GetClients()
    {
        return clients;
    }

    // Get client by id.
    [HttpGet("{id}")]
    public ActionResult<Client> GetClientById(long id)
    {
        Client client = clients.Find(c => c.Id == id);

        if (client is null)
        {
            return NotFound();
        }
        return client;
    }

    // Create a client.
    [HttpPost]
    public ActionResult<Client> CreateClient(Client client)
    {
        long id = clients.Max(c => c.Id) + 1;
        Client newClient = new(id, client.FirstName, client.LastName, client.PhoneNumber);
        clients.Add(newClient);

        // CreatedAtLocation returns a '201 Created' status code WITH:
        // 1. The location of the item (the api endpoint that you can find it at).
        // 2. The newly created object itself.
        return CreatedAtAction(nameof(GetClientById), new {id = newClient.Id}, newClient);
    }

    // Update client.
    [HttpPut("{id}")]
    public ActionResult<Client> UpdateClient(long id, Client updatedClient)
    {
        // Get the client.
        Client client = clients.Find(c => c.Id == id);

        if (client is null)
        {
            return NotFound();
        }

        // Update the client.
        client.FirstName = updatedClient.FirstName;
        client.LastName = updatedClient.LastName;
        client.PhoneNumber = updatedClient.PhoneNumber;

        return NoContent();
    }

    // Delete client.
    [HttpDelete("{id}")]
    public ActionResult DeleteClient(long id)
    {
        // Get the client.
        Client client = clients.Find(c => c.Id == id);

        if (client is null)
        {
            return NotFound();
        }

        // Delete them.
        clients.Remove(client);
        return NoContent();
    }
}