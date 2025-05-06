using Microsoft.AspNetCore.Http.HttpResults;
using Microsoft.EntityFrameworkCore;
using PetGroomerAPI.Data;
using static System.Net.Mime.MediaTypeNames;

namespace PetGroomerAPI;

// A learning project for building a Web API with ASP.NET.
// It will be an API for a Pet Groomer.

public class Program
{
    public static void Main(string[] args)
    {
        // Initializes the web application builder class which is used to setup the
        // configuration, services, and the web server.
        var builder = WebApplication.CreateBuilder(args);

        // Add services to the container.
        // Next we are adding services to be used via dependency injection. (controllers, swagger, etc)...

        builder.Services.AddControllers();
        builder.Services.AddEndpointsApiExplorer();
        builder.Services.AddSwaggerGen();

        // Adding our DbContext as a service.
        string? connectionString = builder.Configuration.GetConnectionString("DefualtConnection");
        MySqlServerVersion serverVersion = new MySqlServerVersion(new Version(8, 0, 36));
        builder.Services.AddDbContext<DatabaseContext>(options => options.UseMySql(connectionString, serverVersion));

        // Then we build the app (returns the final "built" instance of our web application).
        var app = builder.Build();

        // Configure the HTTP request pipeline.
        if (app.Environment.IsDevelopment())
        {
            app.UseSwagger();
            app.UseSwaggerUI();
        }

        // Redirects any http requests to use https.
        app.UseHttpsRedirection();

        app.UseAuthorization();

        app.MapControllers();

        app.Run();
    }
}