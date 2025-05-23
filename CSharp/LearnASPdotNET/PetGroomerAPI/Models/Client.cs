﻿using System.ComponentModel.DataAnnotations;

namespace PetGroomerAPI.Models;

// Client model class
public class Client
{
    public long Id { get; set; }
    public string FirstName { get; set; }
    public string LastName { get; set; }
    public string PhoneNumber { get; set; }
}
