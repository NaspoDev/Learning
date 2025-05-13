
using Microsoft.EntityFrameworkCore;
using PetGroomerAPI.Data;
using Scalar.AspNetCore;
using dotenv.net;

namespace PetGroomerAPI;

// A learning project for building a Web API with ASP.NET.
// It will be an API for a Pet Groomer.

public class Program
{
    public static void Main(string[] args)
    {
        // Load & store environment variables.
        DotEnv.Load();
        var envVars = DotEnv.Read();

        // Initializes the web application builder class which is used to setup the
        // configuration, services, and the web server.
        var builder = WebApplication.CreateBuilder(args);

        // Add services to the container.
        // Next we are adding services to be used via dependency injection. (controllers, OpenAPI, etc)...

        builder.Services.AddControllers();
        // Learn more about configuring OpenAPI at https://aka.ms/aspnet/openapi
        builder.Services.AddOpenApi();

        // Adding our DbContext as a service.
        // Building our connection string using environment variables.
        // * If you define it in appsettings.json, you can access it like this:
        // builder.Configuration.GetConnectionString("DefualtConnection");
        string? dbHost = envVars["DATABASE_HOST"];
        string? dbPort = envVars["DATABASE_PORT"];
        string? dbUser = envVars["DATABASE_USER"];
        string? dbPass = envVars["DATABASE_PASSWORD"];
        string? dbName = envVars["DATABASE_NAME"];
        string connectionString = $"server={dbHost};port={dbPort};database={dbName};user={dbUser};password={dbPass};";

        // The UseMySql() DbContext option requires an explicitly defined version of MySQL that we are using.
        MySqlServerVersion serverVersion = new MySqlServerVersion(new Version(8, 0, 36));
        // Add our DbContext as a service and setup the db connection. (Pomelo automatically sets up a connection pool)!
        builder.Services.AddDbContext<DatabaseContext>(options => options.UseMySql(connectionString, serverVersion));

        // Then we build the app (returns the final "built" instance of our web application).
        var app = builder.Build();

        // Configure the HTTP request pipeline.
        if (app.Environment.IsDevelopment())
        {
            Console.WriteLine("Running in development environment.");
            app.MapOpenApi();
            // Im using Scalar for testing my API in development.
            app.MapScalarApiReference();
        }

        // Redirects any http requests to use https.
        app.UseHttpsRedirection();

        app.UseAuthorization();


        app.MapControllers();

        app.Run();
    }
}
