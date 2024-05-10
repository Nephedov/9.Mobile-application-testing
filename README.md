# «Espresso»

## Решения
### Задание 1
* <a href="https://github.com/Nephedov/9.Mobile-application-testing/blob/main/app/build.gradle">build.gradle</a> - приложения с зависимостями для автотестов.
* <a href="https://github.com/Nephedov/9.Mobile-application-testing/blob/main/app/src/androidTest/java/ru/kkuzmichev/simpleappforespresso/MainActivityTextTest.java">MainActivityTextTest.java</a> - класс с автотестами, с применением Espresso.
* <a href="https://github.com/Nephedov/9.Mobile-application-testing/tree/main/app/src/androidTest/java/ru/kkuzmichev/simpleappforespresso/allure-results">allure-results</a> - отчеты Allure с результатами прохождения
  автотестов.
  
### Дополниетльно
* <a href="https://github.com/Nephedov/9.Mobile-application-testing/blob/main/app/src/androidTest/java/ru/kkuzmichev/simpleappforespresso/CustomViewMatcher.java">CustomViewMatcher.java</a> -
  кастомный ViewMatcher для проверки количества элементов в списке.
* <a href="https://github.com/Nephedov/9.Mobile-application-testing/blob/main/app/src/androidTest/java/ru/kkuzmichev/simpleappforespresso/CustomViewAssertions.java">CustomViewAssertions.java</a> -
  кастомный ViewAssertions для проверки, что view является реализацией класса RecyclerView.

  
## Что было сделано
### Задание 1
* Выгружен [тестовый проект](https://github.com/netology-code/mqa-homeworks/tree/main/2.5%20Espresso/simpleAppForEspresso).
* Настроен для запуска автотестов <a href="https://github.com/Nephedov/9.Mobile-application-testing/blob/main/app/build.gradle">build.gradle</a> приложения:
    * Добавлен AndroidJUnitRunner.
    * Allure.
    * Junit.
    * Espresso.
* Реализован класс с инструментальными автотестами -
  <a href="https://github.com/Nephedov/9.Mobile-application-testing/blob/main/app/src/androidTest/java/ru/kkuzmichev/simpleappforespresso/MainActivityTextTest.java">MainActivityTextTest.java</a>, с использованием Junit4.
* Выгружен из android-утсройства репозиторий с отчетом о прохождении автотестов -
  <a href="https://github.com/Nephedov/9.Mobile-application-testing/tree/main/app/src/androidTest/java/ru/kkuzmichev/simpleappforespresso/allure-results">allure-results</a>.


### Дополнительно
* Реализован кастомный ViewMatcher для проверки количества элементов в списке -
  <a href="https://github.com/Nephedov/9.Mobile-application-testing/blob/main/app/src/androidTest/java/ru/kkuzmichev/simpleappforespresso/CustomViewMatcher.java">CustomViewMatcher.java</a>.
* Реализован кастомный ViewAssertions для проверки, что view является реализацией класса RecyclerView -
  <a href="https://github.com/Nephedov/9.Mobile-application-testing/blob/main/app/src/androidTest/java/ru/kkuzmichev/simpleappforespresso/CustomViewAssertions.java">CustomViewAssertions.java</a>.


---
---


## Описание Задания 1. Реализация теста на проверку главного экрана
1. Выгрузите [тестовый проект](https://github.com/netology-code/mqa-homeworks/tree/main/2.5%20Espresso/simpleAppForEspresso).
2. Запустите тестовый проект в Android Studio.
3. Добавление зависимостей.
4. Создание и настройка класса тестов.
5. Написание теста.
     1. Запустите приложение.
     2. Посмотрите иерархию элементов с помощью Layout Inspector: [инструкция от Google](https://developer.android.com/studio/debug/layout-inspector).
     3. Найдите элемент с текстом «This is home fragment» и его ID.
     4. Напишите тест, проверяющий, что у найденного ID текст «This is home fragment».
6. Запуск теста и просмотр отчёта.
    1. Экспортируйте отчёт в html-файл.


## Дополнительно
1. Реализуйте кастомный ViewMatcher для проверки количества элементов в списке.
2. Добавьте во второе задание проверку количества элементов.
3. Реализуйте кастомный ViewAssertions для проверки, что view является реализацией класса RecyclerView.
4. Добавьте проверку того, что «список» — это RecyclerView.
