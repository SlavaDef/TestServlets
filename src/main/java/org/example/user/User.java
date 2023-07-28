package org.example.user;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 2041275512219239990L;

    private String name;
    private int age;
}

/*
Данный класс представляет пользователя и является классом Java Bean:
он реализует интерфейс Serializable, имеет конструктор без параметров,
а его методы - геттеры и сеттеры, которые предоставляют доступ к переменным name и age,
 соответствуют условностям.

 */
