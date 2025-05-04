namespace PetGroomerAPI.Models;

// Pet model class
public class Pet
{
    // Static values (like 'readonly static' and 'const') are ignored by EF Core,
    // so you can have them in Model classes.
    public static readonly string[] ValidSpecies = { "dog", "cat" };

    public int Id { get; set; }
    public string Name { get; set; }

    private string species = "";
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

    public string Breed { get; set; }
    public int Age { get; set; }
    public Client Owner { get; set; }
}
