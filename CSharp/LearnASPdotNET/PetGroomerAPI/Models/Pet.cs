namespace PetGroomerAPI.Models;

// Pet model class
public class Pet
{
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

    public Pet(int id, string name, string species, string breed, int age, Client owner)
    {
        Id = id;
        Name = name;
        Species = species;
        Breed = breed;
        Age = age;
        Owner = owner;
    }
}
