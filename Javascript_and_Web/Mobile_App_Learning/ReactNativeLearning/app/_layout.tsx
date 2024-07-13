import { Stack } from "expo-router";

// This is the entry point to our application.
// The entry point to Expo React-Native applications is always app/_layout.tsx.

// Routing in React Native with Expo.
export default function RootLayout() {
  return (
    // Wraps your screens and defines the stack navigator. It determines how screens are displayed and transitioned between.
    // screenOptions allow you to define certain properties to the entire screen.
    // By default, react native adds a header to the top of the screen displaying the current filename. I am disabling it here.
    <Stack screenOptions={{ headerShown: false }}>
      {/* Specifies a screen in the stack with the name "index". This maps to the app/index.tsx file, serving as the initial route when the app starts. */}
      <Stack.Screen name="index" />
    </Stack>
  );
}
