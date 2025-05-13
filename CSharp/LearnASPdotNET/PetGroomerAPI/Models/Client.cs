using System.ComponentModel.DataAnnotations;

namespace PetGroomerAPI.Models;

// Client model class
public class Client
{
    public long Id { get; set; }
    public string FirstName { get; set; }
    public string LastName { get; set; }
    public string PhoneNumber { get; set; }

    public Client()
    {

    }

    // Temporarily adding a parameterized constructor for testing.
    // TODO: Remove this constructor and the empty one when testing is done.
    public Client(long id, string firstName, string lastName, string phoneNumber)
    {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        PhoneNumber = phoneNumber;
    }
}
