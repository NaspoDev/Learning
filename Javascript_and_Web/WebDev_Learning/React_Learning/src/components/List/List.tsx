// Our List component

// What we are learning here:
// 1. Fragments
// 2. Dynamically rendering content
// 3. className
// 4. Event handling for a component
// 5. Hook (Managing State)
// 6. Props
// 7. Linking a components CSS file

import { useState } from "react";
// 7. LINKING CSS FILE.
import "./List.css"; // Once you create the file, just import it. That's it.

// 6. PROPS
// Properties for your components. Making them  re-useable. (Like parameters but for components).
// *Note that interfaces are only a typescript thing. If you're using js you can just use the parameters in your component function (as seen below).
// *Interface for typescript is just used in this case for strict type and structure checking.
interface Props {
  items: string[];
  heading: string;
  onSelectItem: (item: string) => void;
}

let selectedClass: string = "selected"; // class applied to the currently selected list item

// The List component. (Incorporates props).
// You can also write `props: Props` then call props.items. Here we have deconstructed it so we don't have to write `props.`.
function List({ items, heading, onSelectItem }: Props) {
  // 5. HOOK (MANAGING STATE)
  // The useState hook allows us to manage state.
  // The useState function takes an initial value as its argument and returns an array with two elements:
  // the current state value (a variable), and a function to update the state value. You can name these
  // whatever you like.

  // We use the updater function to update our variable. When this happens, React knows
  // the element has been updated, and will re-render the component.
  const [selectedIndex, setSelectedIndex] = useState(-1); // -1 is our initial state value, representing that no item is selected.

  return (
    // 1. FRAGMENTS.
    // Components can only return one HTML element. So if we want a heading with out list
    // we should use a Fragment. (See README for a deeper explanation).

    <>
      {/* using our heading prop */}
      <h2 className="list-heading">{heading}</h2>

      {/* If list is empty, render a custom message instead.
      (Since if statements dont exist in jsx, we use this shorthand expression is js. */}
      {items.length === 0 && <p>No items found.</p>}

      {/* 3. CLASSNAME. 
      We must use className instead of class in jsx, as class is already a reserved keyword in js. */}
      <ul className="list">
        {/* 2. DYNAMICALLY RENDERING CONTENT.
        Dynamically rendering our list items.
        
        Since for loops dont exist in jsx, we can use the .map function of array
        to dynamically render all our list items. 
        
        Also, we should give each item a unique key so react can identify it if we need to make changes on it.
        In this case we'll set the key to the item itself since we know it is unique.*/}
        {items.map((item, index) => (
          // we are also adding a click event to our list items
          <li
            key={item}
            // if it's selected, give it our list-item class and our selected class, other wise just list-item.
            // prettier-ignore
            className={
              selectedIndex === index ? `list-item ${selectedClass}` : "list-item"
            }
            // 4. EVENT HANDLING.
            onClick={() => {
              setSelectedIndex(index);
              onSelectItem(item);
            }}
          >
            {item}
          </li>
        ))}
      </ul>
    </>
  );
}

export default List;
