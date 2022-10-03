package ru.mirea.fourthpart.thirdPart;

public enum Catalog {
    FRUITS(),
    MEAT(),
    VEGETABLES();


    //Catalog(Food[] elements) {
        //for (int i = 0; i < elements.length; i++) {
            //this.array = elements;
        //}
    //}

    public void getInfo(Food[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private Food[] array;
}
