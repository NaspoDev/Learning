import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ListComponent } from './list/list.component';
import { ListItem } from './list/list-item.model';
import { DatabaseService } from './services/database.service';

// The App component

// What actually makes a component a component, is the @Component Typescript decorator.
// In this type-decorator, you can define component properties.
@Component({
  selector: 'app-root', // The component's custom HTML tag name, and css selector.
  standalone: true, // Defining the app as standalone, i.e. no modules. (Default as of v17).
  imports: [RouterOutlet, ListComponent], // List imported components here.
  templateUrl: './app.component.html', // The HTML that should be rendered for this component.
  styleUrl: './app.component.scss', // Styles for this component.
})
// A component is a class.
// It's convention to have the word "Component" in the class name as well.
export class AppComponent {
  // You can define variable's here, and use them in the html file.
  title: string = 'This is my super cool title!';
  cars: ListItem[];

  // Using these variables to test conditional rendering
  a: number = 10;
  b: number = 7;

  // Dependency injection.
  // The angular injector will see that this class needs a DatabaseService, and inject it automatically.
  // Also note that in Typescript, when you define a variable like this in the constructor with the private keyword,
  // it will automatically make a property with that type and name, and assign the parameter value to that property.
  constructor(private database: DatabaseService) {
    this.cars = database.getCarsList();
  }
}
