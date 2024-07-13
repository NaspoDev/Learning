// Intersection Types
// Intersection types allow us to apply the properties of multiple types to a single type.
// Uses the "&" operator.

type Draggable = {
  drag: () => void;
};

type Resizable = {
  resize: () => void;
};

type UIWidget = Draggable & Resizable;

let textBox: UIWidget = {
  drag: () => {
    console.log("Dragging...");
  },
  resize: () => {
    console.log("Resizing...");
  },
};

textBox.drag();
textBox.resize();
