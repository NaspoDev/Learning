// It is convention to define things like interfaces, classes, or whatever else that your component would use, outside
// of the main component file, and then import it.
// A component should only contain presentation logic.

// These types of file, i.e. interface files, classes, etc, are usually named .model.ts files.

// In this example, I have defined a general ListItem interface that my list component will use
// to display a list of type ListItem. This makes my list component very reuseable because I can
// pass in any list data that I want to display as a property, so long as I structure it as a ListItem[].
export interface ListItem {
  name: string;
  description: string;
}
