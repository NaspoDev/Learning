using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using PetGroomerAPI.Models;

namespace PetGroomerAPI.Controllers;

// [controller] parses the name of the class by removing "Controller" to get "Clients".
// So this route is "/api/clients"
[Route("api/[controller]")]
[ApiController]
public class ClientsController : ControllerBase
{
    // Get all clients.
    [HttpGet]
    public ActionResult<Client> GetClients()
    {
        //TODO: make it!
    }
}
