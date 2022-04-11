import 'package:flutter/material.dart';

//the main function is the starting point for all our flutter apps
void main() {
  runApp(
    MaterialApp(
      home: Scaffold(
        backgroundColor: Colors.black12,
        appBar: AppBar(
          backgroundColor: Colors.pinkAccent,
          title: const Text('DUCKIE le FLEUR*'),
        ),
        body: const Center(
          child: Image(image: AssetImage('images/duckie.png')),
        ),
      ),
    ),
  );
}
