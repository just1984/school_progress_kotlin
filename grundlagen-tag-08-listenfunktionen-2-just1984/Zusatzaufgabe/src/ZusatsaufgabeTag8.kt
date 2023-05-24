fun main(){
    // 1.
    var fruits = mutableListOf("Apple", "Banana", "Pear", "Peach", "Pineapple", "Kiwi", "Orange")
    println(fruits.size)

    // 2.
    var animals = mutableListOf<String>("Dog", "Cat", "Sheep", "Goat")
    animals.add("Shark")
    println(animals)

    // 3.
    animals.add(0,"Dinosaur")
    println(animals)

    // 4.
    var zeros = "wtf"
    println(zeros)

}