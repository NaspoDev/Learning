import { StyleSheet, Text, View } from "react-native";
import React from "react";

// Learning about Flexbox layout in React native.
// It's very similar to css.
export default function FlexLayout() {
  return (
    <View
      style={{
        height: 300,
        backgroundColor: "white",
        borderWidth: 3,
      }}
    >
      {/* Flex property:
        - 1 takes up all the available space, 0.5 takes up half. 
        - We can see here that 1 on each makes them share equally.
        - 2, then 1 and 1 divides it proportionally, like the grid-rows css property.
        
        display: flex
        - works the same basically as css
        - has justify and align and whatnot
        */}
      <View
        style={{
          flex: 2,
          backgroundColor: "dodgerblue",
        }}
      ></View>
      <View
        style={{
          flex: 1,
          backgroundColor: "gold",
        }}
      ></View>
      <View
        style={{
          flex: 1,
          backgroundColor: "tomato",
        }}
      ></View>
    </View>
  );
}

const styles = StyleSheet.create({});
