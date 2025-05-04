using Microsoft.EntityFrameworkCore;
using PetGroomerAPI.Data;

namespace PetGroomerAPI;

// A learning project for building a Web API with ASP.NET.
// It will be an API for a Pet Groomer.

public class Program
{
    public static void Main(string[] args)
    {
        var builder = WebApplication.CreateBuilder(args);

        // Add services to the container.

        builder.Services.AddControllers();
        // Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
        builder.Services.AddEndpointsApiExplorer();
        builder.Services.AddSwaggerGen();

        // Adding DbContext
        string? connectionString = builder.Configuration.GetConnectionString("DefualtConnection");
        MySqlServerVersion serverVersion = new MySqlServerVersion(new Version(8, 0, 36));
        builder.Services.AddDbContext<DatabaseContext>(options => options.UseMySql(connectionString, serverVersion));

        var app = builder.Build();

        // Configure the HTTP request pipeline.
        if (app.Environment.IsDevelopment())
        {
            app.UseSwagger();
            app.UseSwaggerUI();
        }

        app.UseHttpsRedirection();

        app.UseAuthorization();

        app.MapControllers();

        app.Run();
    }
}