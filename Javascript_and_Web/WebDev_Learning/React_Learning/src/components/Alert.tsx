// Alert component

import { ReactNode } from "react";

// Learn how to pass children into components.
// i.e. instead of writing <Alert text="my text"/>, you write <Alert>My Text</Alert>.

// Props has a built in reserved value of "children" for this very purpose.
interface Props {
  // you can do type string for just raw text. But if you also want elements,
  // for example a <span>, you need to set the type to ReactNode.
  children: ReactNode;
}

function Alert({ children }: Props) {
  return <div>{children}</div>;
}

export default Alert;
