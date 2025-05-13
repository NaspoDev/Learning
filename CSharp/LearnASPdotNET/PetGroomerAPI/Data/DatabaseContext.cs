using Microsoft.EntityFrameworkCore;
using PetGroomerAPI.Models;
using PetGroomerAPI.Models.Pets;

namespace PetGroomerAPI.Data;

// Our Database Context class. Handles DB connection.
public class DatabaseContext : DbContext
{
    // Our DbSet properties. They represent our database tables for EntityFrameworkCore.
    public DbSet<Client> Clients { get; set; }

    public DbSet<Pet> Pets { get; set; }
    public DbSet<Appointment> Appointments { get; set; }

    // Dependency injection is used here to provide DbContext with options used to configure it.
    public DatabaseContext(DbContextOptions<DatabaseContext> options) : base(options)
    {
    }

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        // Client model configuration
        modelBuilder.Entity<Client>(client =>
        {
            client.Property(c => c.FirstName)
            .HasMaxLength(20);

            client.Property(c => c.LastName)
            .HasMaxLength(20);

            client.Property(c => c.PhoneNumber)
            .HasMaxLength(20);

            // Setting phone number as unique.
            client.HasIndex(c => c.PhoneNumber).IsUnique();
        });

        // Pet model configuration
        modelBuilder.Entity<Pet>(pet =>
        {
            pet.Property(p => p.Name)
            .HasMaxLength(40);

            // The species property is of type PetSpecies, which is an enum.
            // Enums are represented by integers. I am specifying the smallest
            // type of integer as I wont have many enum values.
            pet.Property(p => p.Species)
            .HasColumnType("TINYINT");

            pet.Property(p => p.Breed)
            .HasMaxLength(50);
        });
    }
}