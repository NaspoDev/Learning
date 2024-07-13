import { Component, Input } from '@angular/core';
import { ListItem } from './list-item.model';

@Component({
  selector: 'app-list',
  standalone: true,
  imports: [],
  templateUrl: './list.component.html',
  styleUrl: './list.component.scss',
})

// My list component. Displays a ListItem[]. (See list-item.models.ts for more info).
export class ListComponent {
  // Component properties can be defined with the @Input() decorator
  @Input() items: ListItem[] = []; // set it to an empty string by default so typescript is happy
}
