package ru.mirea.fourthpart.thirdPart;

import java.lang.annotation.Native;

public class Utilizer {

    private final String username;
    private final String password;

    public void authentification(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Аутентификация прошла успешно!");
        } else System.out.println("Ошибка аутентификации: неверный логин или пароль!");
    }

    Utilizer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Пользователь[логин: " + getUsername() + ", пароль: " + getPassword() + "]";
    }
}
