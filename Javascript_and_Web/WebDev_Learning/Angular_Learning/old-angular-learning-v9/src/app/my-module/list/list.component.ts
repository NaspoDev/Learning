import { Component, Input, OnInit } from "@angular/core";

@Component({
  selector: "app-list",
  templateUrl: "./list.component.html",
  styleUrls: ["./list.component.scss"],
})
export class ListComponent implements OnInit {
  // @Input() title: string;
  @Input() items: ListItem[];

  // Constructor called when the class in instantiated (obviously).
  // Mainly used for dependency injection.
  constructor() {}

  // ngOnInit is a Angular hook.
  // It is called after Angular initializes the component's data-bound properties but before the view is rendered.
  ngOnInit(): void {}
}
