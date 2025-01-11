#pragma once
#ifndef ANIMALSUBCLASS_H
#define ANIMALSUBCLASS_H

#include <iostream>
#include <string>
#include "Animal.h"
using namespace std;
class Dog : public Mammal {
public:
	Dog();
	Dog(string n, COLOR c, string owner) : Mammal(n, c) {
		
	}
	~Dog() {

	}
	void speak() const override {
		cout << "Woof" << endl;
	}
	void move() const override {
		cout << getName() << " the dog is moving" << endl;
	}
private:
	string owner;
};

class Lion : public Mammal {
public:
	Lion();
	Lion(string n, COLOR c, string owner) : Mammal(n, c) {

	}
	~Lion() {

	}
	void speak() const override {
		cout << "Roar" << endl;
	}
	void move() const override {
		cout << getName() << " the lion is moving" << endl;
	}
private:
	string owner;
};
class Cat : public Mammal {
public:
	Cat();
	Cat(string n, COLOR c, string owner) : Mammal(n, c) {

	}
	~Cat() {

	}
	void speak() const override {
		cout << "Meow" << endl;
	}
	void move() const override {
		cout << getName() << " the cat is moving" << endl;
	}
private:
	string owner;
};

#endif