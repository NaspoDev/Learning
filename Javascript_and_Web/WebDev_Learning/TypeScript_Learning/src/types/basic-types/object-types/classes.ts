// Classes in TypeScript

class User {
  private readonly id: number;

  constructor(id: number) {
    this.id = id;
  }

  getId(): number {
    return this.id;
  }
}

let myUser: User = new User(10);
console.log(myUser.getId());
