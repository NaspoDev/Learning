namespace LearnASPdotNET.Models;

// Dog Model
public class Dog
{
    public int Id { get; set; }
    public string Name { get; set; }
    public DateOnly DateOfBirth { get; }
    public string Breed { get; set; }

}
