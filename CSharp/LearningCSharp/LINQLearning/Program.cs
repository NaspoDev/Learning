namespace LINQLearning;

internal class Program
{
    // LINQ is a built-in feature in C# for finding, searching, and sorting data.
    static void Main(string[] args)
    {
        List<Game> games = new List<Game>
        {
            new() {Title = "Minecraft", Genre = "Sandbox", ReleaseYear = 2009, Rating = 10.0, Price = 20.00},
            new() {Title = "Fortnite", Genre = "Battle Royale", ReleaseYear = 2017, Rating = 8.5, Price = 0.00},
            new() {Title = "Valorant", Genre = "FPS", ReleaseYear = 2020, Rating = 7.9, Price = 0.00},
            new() {Title = "CS2", Genre = "FPS", ReleaseYear = 2024, Rating = 7.0, Price = 10.00},
            new() {Title = "Apex Legends", Genre = "Battle Royale", ReleaseYear = 2019, Rating = 8.3, Price = 0.00}
        };

        // --- Method Syntax ---
        // Provides many methods that can be chained together to work with your data.

        // Find battle royales.
        List<Game> battleRoyales = games.Where(g => g.Genre == "Battle Royale").ToList();

        // Any() method to get boolean results.
        bool modernGamesExist = games.Any(g => g.ReleaseYear >= 2015);

        // Games sorted by release year.
        List<Game> gamesSorted = games.OrderBy(g => g.ReleaseYear).ToList();

        // Getting the average rating.
        double averageRating = games.Average(g => g.Rating);

        // Find the titles of battle royales, then order by rating. (Showcasing method chaining).
        List<string> battleRoyalesByRating = games
            .Where(g => g.Genre == "Battle Royale")
            .OrderByDescending(g => g.Rating)
            .Select(g => g.Title)
            .ToList();

        // Group by Genre
        var gamesByGroup = games.GroupBy(g => g.Genre);

        // Printing results
        Console.WriteLine("Find battle royales:");
        foreach (Game game in battleRoyales)
        {
            Console.WriteLine($"{game.Title}, {game.Genre}, {game.ReleaseYear}, {game.Rating}, {game.Price}");
        }

        Console.WriteLine("\nAre there any games in my list that were released on or after 2015?");
        Console.WriteLine(modernGamesExist ? "Yes" : "No");

        Console.WriteLine("\nGames sorted by release year:");
        foreach (Game game in gamesSorted)
        {
            Console.WriteLine($"{game.Title}, {game.Genre}, {game.ReleaseYear}, {game.Rating}, {game.Price}");
        }

        Console.WriteLine($"\nThe average rating of my games is: {averageRating}/10.");

        Console.WriteLine("\nTitles of battle royales ordered by rating descending:");
        foreach (string title in battleRoyalesByRating)
        {
            Console.WriteLine(title);
        }

        // --- Query Syntax ---
        // LINQ also supports SQL like syntax for making queries on your data structures.

        // Find battle royales.
        var battleRoyales2 = from g in games
                             where g.Genre == "Battle Royale"
                             select g;
    }
}
