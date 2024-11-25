# Итоговый проект «Сервис коротких ссылок» (KP)

## Этапы сдачи проекта
1) Размещение кода на GitHub 
2) Разместите свой проект на GitHub. Убедитесь, что структура репозитория понятна: добавьте файл README.md, в котором опишите:
-- Как пользоваться сервисом.
-- Какие команды поддерживаются.
-- Как протестировать ваш код.

3) Подготовка к отправке проекта на проверку
Проверьте, что:
- Все функции проекта работают корректно и соответствуют ТЗ.
- Код оформлен и структурирован согласно стандартам.
- В репозитории есть описание проекта и документация по каждому модулю.
- Если используются внешние библиотеки, добавьте инструкции по их установке.
- Отправка ссылки на проект
- После того как проект будет готов, отправьте ссылку на ваш репозиторий через форму сдачи проекта. Ваш ментор проверит работу и предоставит развернутую обратную связь.

## Критерии оценивания
Проект будет оцениваться по следующим критериям. Каждый критерий оценивается от 0 до 3 баллов, где:
- 0 баллов — не выполнено,
- 1 балл — выполнено частично или с ошибками,
- 2 балла — выполнено с незначительными недочетами,
- 3 балла — выполнено полностью.

1. Функциональность (1 балл)
Алгоритм сокращения ссылки должен корректно работать и возвращать уникальную короткую ссылку для каждого пользователя.

2. Внесение основных параметров работы алгоритма в конфигурационный файл  (2 балла)
При добавлении ссылки пользователь может указать время существования ссылки. Фактическое время хранения должно быть ограничено меньшим из введённых пользователем значений или значений, заданных в конфигурационном файле. Необходимо реализовать возможность подключения конфигурации из отдельного файла, чтобы параметры могли быть изменены без изменения кода.

3. Ограничение по времени жизни (2 балла)
Реализована функция автоматического удаления ссылки по истечении её срока действия.

4. Автоматическое удаление ссылок (2 балла)
Ссылки удаляются по достижении лимита переходов или истечении времени жизни.

5. Уникальность ссылок (2 балла)
Разные пользователи получают разные короткие ссылки на один и тот же URL.

6. Повторное создание ссылок (2 балла)
При повторном запросе сокращения той же ссылки, пользователю должна быть сгенерирована новая ссылка.

7. Переход по ссылке (2 балла)
При вводе короткой ссылки в консоль должен осуществляться переход на оригинальный ресурс.

8. Лимит переходов (2 балла)
Ссылка должна блокироваться после достижения заданного пользователем лимита переходов. Пользователь вводит этот лимит и, в зависимости от заданного времени существования ссылки, система выбирает большее из введённого пользователем значения и значения, заданного в конфигурационном файле.

9. Уведомление пользователя (2 балла)
Пользователь получает уведомление, когда ссылка становится недоступной из-за лимита переходов или истечения времени жизни.

10. Редактирование лимита переходов (2 балла)
У пользователя есть возможность изменять лимит переходов по ссылке.

11. Удаление ссылки (2 балла)
Пользователь может удалять свои ссылки.

12. Идентификация по UUID (2 балла)
Возможность редактирования и удаления ссылки должна быть доступна только её создателю, идентифицируемому по UUID.

13. Работа нескольких пользователей (2 балла)
Сервис поддерживает работу нескольких пользователей, каждый из которых может создавать уникальные короткие ссылки.

14. Администрирование параметров ссылки (2 балла)
Только создатель ссылки может редактировать её параметры или удалять её.

15. Создание нескольких ссылок (2 балла)
Один пользователь может создавать несколько коротких ссылок на разные ресурсы.

16. Идентификация по UUID при повторных запросах (2 балла)
Система идентифицирует пользователя по UUID и генерирует уникальную ссылку при каждом запросе.

Максимальная оценка за выполнение проекта — 31 балл. Для успешной сдачи необходимо набрать минимум 15 баллов.