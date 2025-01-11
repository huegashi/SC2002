#include <iostream>
#include <string>
using namespace std;
enum COLOR { Green, Blue, White, Black, Brown };
class Animal {
public:

	Animal() : _name("unknown") {
		cout << "constructing Animal object " << _name << endl;
	}
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
	Mammal() : Animal() {
		cout << "constructing Animal object " << getName() << endl;
	}
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

class Dog : public Mammal {
public:
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


int main() {
	Animal* animalptr = new Dog("Lassie", White, "Andy");
	Dog dogi("Lassie", White, "Andy");
	Mammal* aniPtr = &dogi;
	Mammal& aniRef = dogi;
	Mammal aniVal = dogi;
	aniPtr->speak();
	aniRef.speak();
	aniVal.speak();


	return 0;
}