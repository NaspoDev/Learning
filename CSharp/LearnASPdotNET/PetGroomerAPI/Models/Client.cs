using System.ComponentModel.DataAnnotations;

namespace PetGroomerAPI.Models;

// Client model class
public class Client
{
    public long Id { get; set; }

    [MaxLength(100)]
    public string FirstName { get; set; }

    [MaxLength(100)]
    public string LastName { get; set; }

    [Phone]
    [MaxLength(20)]
    public string Phone { get; set; }

}
