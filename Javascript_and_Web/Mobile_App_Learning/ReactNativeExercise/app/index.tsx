import {
  Image,
  ImageBackground,
  Platform,
  SafeAreaView,
  StatusBar,
  StyleSheet,
  Text,
  View,
  Button,
} from "react-native";
import React from "react";
import { router, Link } from "expo-router";

export default function WelcomeScreen() {
  return (
    <ImageBackground
      source={require("@/assets/images/background.jpg")}
      style={styles.background}
    >
      {/* Heading */}
      <SafeAreaView style={styles.safeArea}>
        <View style={styles.heading}>
          <Image
            source={require("@/assets/images/react-logo.png")}
            style={styles.logo}
          />
          <Text>My React Native Mobile App</Text>
        </View>

        {/* Login buttons */}
        <View style={styles.loginButtonsContainer}>
          <Button
            title={"Login"}
            onPress={() => router.push("ViewImageScreen")}
          />
          <Button
            title={"Sign Up"}
            onPress={() => router.push("ViewImageScreen")}
          />
        </View>
      </SafeAreaView>
    </ImageBackground>
  );
}

const styles = StyleSheet.create({
  background: {
    flex: 1, // background image should take up the entire screen
  },
  safeArea: {
    flex: 1,
    // safe area view for Android workaround
    paddingTop: Platform.OS === "android" ? StatusBar.currentHeight : 0,
    justifyContent: "space-between",
    alignItems: "center",
  },
  loginButtonsContainer: {
    width: Platform.OS == "web" ? 200 : "100%",
    gap: 10,
    marginBottom: 40,
  },
  heading: {
    width: "auto",
    alignItems: "center",
  },
  logo: {
    width: 120,
    marginTop: 50,
  },
});
