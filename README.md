## Test cases
#### site: https://lingualeo.com/

| № | Описание | Шаги | Данные | Ожидаемый результат |
| :---: | :--- | :--- | :--- | :--- |
| 1 | Открытие попапа для входа | 1. зайти на сайт https://lingualeo.com/ <br />2. нажать на кнопку "войти" |  | Откроется попап с формой для входа |
| 2 | Вход на сайт | 1. зайти на сайт https://lingualeo.com/ <br />2. нажать на кнопку "войти" <br />3. ввести email <br />4. ввести пароль <br />5. нажать на кнопку "войти" | email: lina.bulitskaya@gmail.com <br />password: N6fymd | Переход на https://lingualeo.com/ru/dashboard |
| 3 | Вход на сайт с неправильным паролем | 1. зайти на сайт https://lingualeo.com/ <br />2. нажать на кнопку "войти" <br />3. ввести email <br />4. ввести пароль <br />5. нажать на кнопку "войти" | email: lina.bulitskaya@gmail.com <br />password: notVal1d | Анимация, появление красной рамки у формы, появление текста под формой "Пароль/email введены неверно" |
| 4 | Регистрации | 1. зайти на сайт https://lingualeo.com/ <br />2. ввести email <br />3. ввести пароль <br />4. нажать на кнопку "регистрация" | email: Jane.Doe@gmail.com <br />password: Jane.Doe | Переход на первый шаг регистрации: "Расскажи о себе" |
| 5 | Открытие попапа для регистрации | 1. зайти на сайт https://lingualeo.com/ <br />2. нажать на кнопку "войти" <br />3. нажать на таб "регистрация" |  | Откроется попап с формой для регистрации |
| 6 | Регистрация через попап | 1. зайти на сайт https://lingualeo.com/ <br />2. нажать на кнопку "войти" <br />3. нажать на таб "регистрация" <br />4. нажать на ссылку "регистрация через tmail" <br />5. ввести email <br />6. ввести пароль <br />7. нажать на кнопку "зарегистрироваться" | email: John.Doe@gmail.com <br />password: John.Doe | Переход на первый шаг регистрации: "Расскажи о себе" |
| 7 | Просмотр профиля | 1. зайти на сайт https://lingualeo.com/ <br />2. нажать на кнопку "войти" <br />3. ввести email <br />4. ввести пароль <br />5. нажать на кнопку "войти" <br />6. Нажать на картинку "лапки" в правом верхнем углу навигации | email: lina.bulitskaya@gmail.com <br />password: N6fymd | Переход на https://lingualeo.com/ru/profile |
