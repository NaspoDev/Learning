using Microsoft.EntityFrameworkCore;
using PetGroomerAPI.Models;

namespace PetGroomerAPI.Data;

// Our Database Context class. Handles DB connection.
public class DatabaseContext : DbContext
{

    public DbSet<Client> Clients { get; set; }
    public DbSet<Pet> Pets { get; set; }
    public DbSet<Appointment> Appointments { get; set; }

    public DatabaseContext(DbContextOptions<DatabaseContext> options): base(options)
    {
    }

    
}
