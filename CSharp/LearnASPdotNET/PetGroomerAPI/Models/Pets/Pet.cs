using System.ComponentModel.DataAnnotations;

namespace PetGroomerAPI.Models.Pets;

// Pet model class
public class Pet
{
    public long Id { get; set; }
    public string Name { get; set; }
    public PetSpecies Species { get; set; }
    public string Breed { get; set; }
    public DateOnly DateOfBirth { get; set; }
    public Client Owner { get; set; }
}
