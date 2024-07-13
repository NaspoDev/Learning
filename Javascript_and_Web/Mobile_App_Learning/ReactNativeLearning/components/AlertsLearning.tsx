import { StyleSheet, Text, View, Button, Alert } from "react-native";
import React from "react";

// Alerts! Using the alert API to send native alerts
export default function AlertsLearning() {
  return (
    // Multiple style objects can be applied by passing them as a list. (Last one takes precedent)
    <View style={[styles.alertsContainer, styles.borderPurple]}>
      <Text>Alerts:</Text>
      {/* Basic Alert */}
      <Button
        title="Try a basic alert"
        onPress={() => alert("This is an alert!")}
      />
      {/* Customized alert with feedback */}
      <Button
        title="Customized alert with feedback"
        onPress={() =>
          // Using the Alert object form react-native.
          Alert.alert("My Alert Title", "My alert message", [
            // These are alert buttons
            { text: "Yes", onPress: () => console.log("Yes option pressed") },
            { text: "No", onPress: () => console.log("No option pressed") },
          ])
        }
      />
      {/* Prompt alert (text input) IOS ONLY */}
      <Button
        title="Prompt alert (text input) IOS ONLY"
        onPress={() =>
          Alert.prompt("Enter something", "Enter a message or sum", (input) =>
            console.log(input)
          )
        }
      />
    </View>
  );
}

const styles = StyleSheet.create({
  alertsContainer: {
    marginTop: 20,
    gap: 10,
    height: "auto",
    paddingVertical: 20,
  },
  borderPurple: {
    borderWidth: 2,
    borderColor: "#9C188C",
  },
});
