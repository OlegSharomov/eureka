
# Приложение для проверки наличия пользователей

### Перед запуском приложения проверьте, что у вас установлена Java версии не старше 1.8.0_351

### Для запуска скачайте проект и запустите файл server.bat  

#### Описание задания: 
Необходимо написать простое web-приложение с использованием одной из перечисленных технологий (java/C#/C /C/node.js,node-addon-api/N-API) для проверки наличия пользователя (например, Администратор) в списке пользователей операционной системы Windows.
Приложение должно работать по следующему сценарию
1. Пользователь запускает web-сервер из корня проекта:  
   <font face="STCAIYUN">server.bat</font>
2. Автоматически открывается браузер с начальной web страницей, на которой отображаются
\- поле ввода имени пользователя  
\- кнопка "Проверить"
3. Пользователь вводит имя пользователя и нажимает на "проверить"
4. Если введённый пользователь присутствует в списке пользователей Windows, отображается страница с надписью "Пользователь <имя_введённого_пользователя> есть", иначе "Пользователя <имя_введённого_пользователя> нет". Под надписью есть кнопка "Назад", при нажатии на которую происходит возврат на начальную страницу.
5. Проверку наличия введённого имени пользователя в списке пользователей ОС Windows запрещено проводить путём сравнения текущего пользователя, от которого запущен процесс сервера и введённого пользователя, а также запрещено использовать названия домашних каталогов пользователей в каталоге C:\Users (С:\Пользователи).
   Список пользователей для проверки можно получить через Управление компьютером->Служебные программы->Локальные пользователи и группы->Пользователи.
6. В корне проекта создать файл README.MD с текстом тестового задания в кодировке UTF-8
7. Проект выложить на github.com (другие ресурсы не рассматриваются).
8. Ссылку на проект присылайте на [job@eurekabpo.ru](job@eurekabpo.ru)
9. Срок выполнения задания 7 дней начиная с завтрашнего дня.