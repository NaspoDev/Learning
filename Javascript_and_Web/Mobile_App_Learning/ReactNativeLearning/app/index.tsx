import AlertsLearning from "@/components/AlertsLearning";
import FlexLayout from "@/components/FlexLayout";
import PropsLearning from "@/components/PropsLearning";
import { useState } from "react";
import {
  Text,
  View,
  StyleSheet,
  SafeAreaView,
  Platform,
  StatusBar,
  Button,
  Image,
  TouchableHighlight,
} from "react-native";

export default function Index() {
  const [imageHidden, setImageHidden] = useState(true);

  function handleButtonClick() {
    setImageHidden(!imageHidden);
  }

  return (
    <SafeAreaView style={styles.container}>
      <Text>Hello React Native!</Text>
      {/* Number of lines to 1 with make text end with "..." instead of wrapping to the next line. */}
      <Text numberOfLines={1}>
        This is some really really long text. I want to make this even longer
        than it already is.
      </Text>
      {/* This button will reveal the image upon press. */}
      <Button
        title={imageHidden ? "Reveal Image" : "Hide Image"}
        onPress={handleButtonClick}
      />
      <Image
        source={require("../assets/images/landscape.jpg")}
        style={styles.image}
        blurRadius={imageHidden ? 20 : 0} // blur set to 20 if its supposed to be hidden, otherwise 0.
      />

      {/* There are 3 kinds of Touchables in React Native. TouchableHighlight is one.
        Whenever the user presses on a touchable highligh, it gives feedback to the touch by highlighting a little. */}
      <TouchableHighlight onPress={() => "TouchableHighlight pressed"}>
        <View style={{ backgroundColor: "#22BE56" }}>
          <Text style={{ paddingHorizontal: 10, paddingVertical: 10 }}>
            I am a TouchableHighlight. I give a small highlight feedback when
            being pressed.
          </Text>
        </View>
      </TouchableHighlight>
      <AlertsLearning></AlertsLearning>
      <FlexLayout></FlexLayout>
      <PropsLearning name="Tom"></PropsLearning>
    </SafeAreaView>
  );
}

// We can define our styles like so, and apply them as needed.
// Style property names are inspired by CSS, but they are not CSS.
const styles = StyleSheet.create({
  container: {
    display: "flex",
    width: "100%",
    height: "auto",
    backgroundColor: "lightblue",
    // SafeAreaView has troubles on android, so this is the workaround.
    paddingTop: Platform.OS === "android" ? StatusBar.currentHeight : 0,
  },
  image: {
    width: "80%",
    height: 200,
  },
});
