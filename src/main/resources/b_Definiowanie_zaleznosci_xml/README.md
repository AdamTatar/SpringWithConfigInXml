# Java EE  - Spring - Definiowanie zależności

### Zadania.

#### Zadanie 1 - rozwiązywane z wykładowcą

1. W projekcie `Spring01xml` dodaj plik konfiguracyjny Springa o nazwie `beans.xml`.
2. Utwórz pakiety **pl.coderslab.bean** oraz **pl.coderslab.app**.
3. Utwórz klasę `SpringDiApplication` z metodą main w pakiecie **pl.coderslab.app**.
4. W metodzie main klasy `SpringDiApplication` utwórz obiekt kontekstu na podstawie konfiguracji.
5. Uruchom i sprawdź działanie aplikacji.

#### Zadanie 2 - rozwiązywane z wykładowcą

1. Utwórz klasę `HelloWorld` w pakiecie **pl.coderslab.bean** z atrybutem typu String oraz nazwie `message`.
2. Utwórz konstruktor ustawiający pole `message`, zdefiniuj gettery i settery.
3. Utwórz ziarno w konfiguracji xml o nazwie `helloWorld` klasy `pl.coderslab.bean.HelloWorld`.
4. Uzupełnij konfigurację ziaren, tak by wstrzyknąć za pomocą konstruktora do klasy `HelloWorld` 
dla atrybutu `message` wartość **Witaj Spring**.
5. Pobierz ziarno w metodzie main a następnie wywołaj na nim metodę `getMessage`.
-------------------------------------------------------------------------------

#### Zadanie 3

1. Zmodyfikuj plik konfiguracyjny tak by wstrzyknąć napis **Witaj Spring - by setter** 
    obyło się za pomocą metody ustawiającej.
2. Pobierz ziarno w metodzie main a następnie wywołaj na nim metodę `getMessage`.
3. W pakiecie **pl.coderslab.bean** utwórz interfejs `MessageService` z jedną metodą `void send();`.
4. Utwórz klasę `EmailService` implementującą interfejs `MessageService`.
5. Dodaj w konfiguracji xml wpisy definiujące klasę `EmailService` jako ziarno Springa.
6. W metodzie `send` wyświetl na konsoli **Sending email**.
7. Pobierz w metodzie `main` utworzone ziarno a następnie wywołaj na nim metodę `send`.

#### Zadanie 4
1. Utwórz klasę `MessageSender` z atrybutem typu `MessageService` o nazwie `messageService`.
2. Utwórz konstruktor tej klasy ustawiający atrybut `messageService` jak poniżej:
````java
public MessageSender(MessageService messageService) {
	this.messageService = messageService;
}

````
oraz metodę wysyłającą wiadomość jak poniżej:
````java
public void sendMessage() {
	messageService.send();
}
````
3. Dodaj w konfiguracji xml definicję ziarna `messageSender` do którego za pomocą konstruktora zostanie wstrzyknięty
obiekt klasy `EmailService`.
4. W metodzie main programu pobierz ziarno a następnie wywołaj na nim metodę `sendMessage`.

#### Zadanie 5
1. Dodaj w klasie `MessageSender` właściwość typu `String` o nazwie `message`.
2. Zmodyfikuj metodę `send` klasy `EmailService` tak aby przyjmowała parametr, który ma być wyświetlony na konsoli.
3. Zmodyfikuj metodę `sendMessage` klasy `MessageSender` tak aby wywoływała metodę nową metodę `send`. 
4. Sprawdź działanie programu.