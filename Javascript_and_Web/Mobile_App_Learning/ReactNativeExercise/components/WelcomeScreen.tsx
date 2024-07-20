import {
  Image,
  ImageBackground,
  Platform,
  SafeAreaView,
  StatusBar,
  StyleSheet,
  Text,
  View,
} from "react-native";
import React from "react";

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
          <View style={styles.loginButton}>
            <Text>Login Button</Text>
          </View>
          <View style={styles.signUpButton}>
            <Text>Sign Up Button</Text>
          </View>
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
    width: "100%",
  },
  loginButton: {
    width: "100%",
    height: 70,
    backgroundColor: "#fc5c65",
  },
  signUpButton: {
    width: "100%",
    height: 70,
    backgroundColor: "#4ecdc4",
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
