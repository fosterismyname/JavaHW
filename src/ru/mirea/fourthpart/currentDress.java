package ru.mirea.fourthpart.secondPart;

public class currentDress {

    public void dressMale(Clothes[] clothes) {
        System.out.println("Одежда в наличии: ");
        for (Clothes clothe: clothes) {
            if (clothe instanceof MaleClothes) System.out.println(clothe);
        }
    }

    public void dressFemale(Clothes[] clothes) {
        System.out.println("Одежда в наличии: ");
        for (Clothes clothe: clothes) {
            if (clothe instanceof FemaleClothes) System.out.println(clothe);
        }
    }

}
