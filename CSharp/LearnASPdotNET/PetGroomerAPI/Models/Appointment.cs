namespace PetGroomerAPI.Models;

// Appointment model class
public class Appointment
{
    public int Id { get; set; }
    public Pet Pet { get; set; }
    public DateTime AppointmentDateTime { get; set; }

    public Appointment(int id, Pet pet, DateTime appointmentDateTime)
    {
        Id = id;
        Pet = pet;
        AppointmentDateTime = appointmentDateTime;
    }
}
