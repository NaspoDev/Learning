namespace LearnASPdotNET.Models;

// Dog Adoption Application model.
public class AdoptionApplication
{
    public int Id { get; set; }
    public Dog Dog { get; set; }
    public string Email { get; set; }
    public string PhoneNumber { get; set; }
}
