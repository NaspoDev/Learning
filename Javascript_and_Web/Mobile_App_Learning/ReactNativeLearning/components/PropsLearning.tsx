import { StyleSheet, Text, View } from "react-native";
import React from "react";

// Learning props with React Native!

interface Props {
  name: string;
}

export default function PropsLearning({ name }: Props) {
  return (
    <View>
      <Text>PropsLearning</Text>
      <Text>{name}</Text>
    </View>
  );
}

const styles = StyleSheet.create({});
