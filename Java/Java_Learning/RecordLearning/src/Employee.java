// Like Enums, Records are a special type of class, defined as you see below.

/*
 Under the hood, records create...
 - private final variables for the fields we've listed.
 - constructor to set params to private variables. (this.name = name;)
 - public getter methods for our fields.
 - toString(), equals(), and hashCode() methods.
*/

// Example of a basic record:
public record Employee(String name, int id) {
}