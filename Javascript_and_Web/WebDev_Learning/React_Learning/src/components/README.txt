It is convention to put all your components in a folder called "components" within the src folder.
- Each components should have its own css file for it's styling (also PascalCase).

=== Components with Fragments ===
Components can only return one element. If we want to return multiple HTML elements in one
component, we have a few options...

1. (Worst) Wrap the elements in a div
This is bad because it adds an extra div to the DOM that we don't need.

2. (Better) Use a React Fragment
Fragment is a built-in component that allows us to return multiple elements without adding
an extra element to the DOM.
- Import Fragment from react
- Wrap the elements in <Fragment> </Fragment>

3. (Best) Use a shorthand for React Fragment
- Wrap the elements in <> </>
- No need to import Fragment