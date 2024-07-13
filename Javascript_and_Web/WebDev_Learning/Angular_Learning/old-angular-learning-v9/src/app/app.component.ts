import { Component } from "@angular/core";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.scss"],
})
export class AppComponent {
  angularVersion = "9.0.0";
  // My list of fruits to pass into my list component
  fruits: ListItem[] = [
    { name: "Apple", description: "Red" },
    { name: "Banana", description: "Yellow" },
    { name: "Grape", description: "Purple" },
  ];
}
