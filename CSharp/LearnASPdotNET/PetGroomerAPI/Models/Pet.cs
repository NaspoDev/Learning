using System.ComponentModel.DataAnnotations;

namespace PetGroomerAPI.Models;

// Pet model class
public class Pet
{
    // Static values (like 'readonly static' and 'const') are ignored by EF Core,
    // so you can have them in Model classes.
    public static readonly string[] ValidSpecies = { "dog", "cat" };

    public long Id { get; set; }

    [MaxLength(100)]
    public string Name { get; set; }

    private string species = "";
    [MaxLength(3)] // because there is only "dog" and "cat" right now.
    public string Species { 
        get => species; 
        set
        {
            if (ValidSpecies.Contains(value.ToLower()))
            {
                species = value;
            } else
            {
                throw new ArgumentException("Invalid Species!");
            }
        }
    }

    [MaxLength(100)]
    public string Breed { get; set; }

    public DateOnly dateOfBirth { get; set; }

    public Client Owner { get; set; }
}
