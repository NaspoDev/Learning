import { Injectable } from '@angular/core';
import { ListItem } from '../list/list-item.model';

// A service is a class that encapsulates a specific functionality or feature and can be shared across different parts of an application.
// Like this Database service for example, would get data from the database.

// NOTE* I made this services folder because I wanted it in its own folder. (ng g service services/database)

// The @Injectable decorator defines this as a Service in Angular, and can be injected as a dependency.
@Injectable({
  providedIn: 'root',
})
export class DatabaseService {
  constructor() {}

  // Pretend this is a function to get data from a database. In this case we are just
  // returning our cars list.
  getCarsList(): ListItem[] {
    return [
      { name: 'Hyundai Sonata', description: 'Sedan' },
      { name: 'Toyota Camry', description: 'Sedan' },
      { name: 'G-Wagon', description: 'idek brother (SUV?)' },
    ];
  }
}
