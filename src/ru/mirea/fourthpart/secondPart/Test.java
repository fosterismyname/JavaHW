package ru.mirea.fourthpart.secondPart;

public class Test {

    public static void main(String[] args) {
        Clothes[] clothesArr = {
                new TeeShirt(Sizes.M, "черный", 1000),
                new TeeShirt(Sizes.XS, "белый", 2000),
                new Trousers(Sizes.M, "красный", 500),
                new Trousers(Sizes.XS, "фиолетовый", 400),
                new Skirt(Sizes.M, "белвый", 800),
                new Skirt(Sizes.S, "серый", 700),
        };


        currentDress currentTest = new currentDress();
        currentTest.dressMale(clothesArr);
        System.out.println(" ");
        currentTest.dressFemale(clothesArr);
    }
}
