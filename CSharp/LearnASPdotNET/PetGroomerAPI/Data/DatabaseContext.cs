using Microsoft.EntityFrameworkCore;
using PetGroomerAPI.Models;

namespace PetGroomerAPI.Data;

// Our Database Context class. Handles DB connection.
public class DatabaseContext : DbContext
{

    // Our DbSet properties. They represent our database tables for EntityFrameworkCore.
    public DbSet<Client> Clients { get; set; }
    public DbSet<Pet> Pets { get; set; }
    public DbSet<Appointment> Appointments { get; set; }

    // Dependency injection is used here to provide DbContext with options used to configure it.
    public DatabaseContext(DbContextOptions<DatabaseContext> options): base(options)
    {
    }
    
}
