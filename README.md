Необходимое ПО для запуска:
===========================
1) JDK 8
2) Android AVD Manager (или реальный девайс на Android)
3) Appium Server (http://appium.io)
4) Maven

Шаги запуска:
=============
1) Создать эмулятор, выбрать android sdk 7.0 (если выбираете другую версию, то нужно изменить ключ sdkVersion в settings.properties)
2) Запустить Appium server (если запускаете не на локальной машине, то путь к серверу нужно указать в settings.properties)
3) Запустить OperationTests

Особенности запуска на реальном устройстве:
==============================
1) Подключить устройство к компьютеру, где запущен Appium server
2) Если нужно, изменить sdkVersion в settings.properties
3) В CalculatorConstants изменить использование Emulator на RealDevice

Запуск:
=======
```mvn test```