// App component. This is the root component of our application.

// Import our components that we created.
import Message from "./components/Message";
import List from "./components/List/List";
import Alert from "./components/Alert";

// Props for our City Items List component.
let cityItems: string[] = ["Toronto", "New York", "London", "Tokyo", "Athens"];
const onSelectItem = (item: string) => console.log(item);

function App() {
  // Now we can use it just like a regular HTML component, with opening and closing tags.
  return (
    <div>
      <Message />
      {/* Our list component, with props. */}
      <List
        items={cityItems}
        heading="List of Cities"
        onSelectItem={onSelectItem}
      />
      <Alert>
        This is my <span>alert!</span>
      </Alert>
    </div>
  );
}

export default App;
