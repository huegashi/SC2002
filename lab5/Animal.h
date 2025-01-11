#pragma once

#ifndef ANIMALCLASSES_H
#define ANIMALCLASSES_H

#include <iostream>
#include <string>
using namespace std;
enum COLOR { Green, Blue, White, Black, Brown };
class Animal {
public:
	Animal();
	Animal(string n, COLOR c) : _name(n), _color(c) {
		cout << "constructing Animal object " << n << endl;
	}
	~Animal() {
		cout << "destructing Animal object " << _name << endl;
	}

	virtual void speak() const = 0;

	virtual void move() const = 0;
	string getName() const {
		return _name;
	}
	COLOR getColor() const {
		return _color;
	}
private:
	string _name;
	COLOR _color;

};

class Mammal : public Animal {
public:
	Mammal();
	void eat() const {
		cout << "Mammal eat " << endl;
	}

	void move() const {
		cout << getName() << " the Mammal moves " << endl;
	}

	void speak() const {
		cout << "Mammal speaks " << endl;
	}

	Mammal(string n, COLOR c) : Animal(n, c) {
		cout << "constructing Mammal object " << n << endl;
	}
	~Mammal() {
		cout << "destructing Mammal object " << getName() << endl;
	}

};

#endif