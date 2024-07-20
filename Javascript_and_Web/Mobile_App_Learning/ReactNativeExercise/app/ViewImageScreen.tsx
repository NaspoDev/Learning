import { Image, SafeAreaView, StyleSheet, Text, View } from "react-native";
import React from "react";

export default function ViewImageScreen() {
  return (
    <SafeAreaView style={styles.safeArea}>
      <Image source={require("@/assets/images/t-shirt.webp")} />
      <Text>Black t-shirt.</Text>
      <Text>$19.99</Text>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  safeArea: {
    justifyContent: "center",
    alignItems: "center",
  },
});
