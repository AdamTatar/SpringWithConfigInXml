# Java EE  - Spring - Definiowanie zależności

### Zadania.


#### Zadanie 1 - rozwiązywane z wykładowcą

1. Utwórz projekt Maven o nazwie `Spring01Java`.
1. Dodaj klasę konfiguracji java.
2. W metodzie main klasy `SpringDiApplication` utwórz obiekt kontekstu na podstawie konfiguracji.
3. Uruchom i sprawdź działanie aplikacji.


#### Zadanie 2 - rozwiązywane z wykładowcą

1. Utwórz klasę `HelloWorld` w pakiecie **pl.coderslab.bean**.
2. Utwórz metodę `hello` wyświetlającą aktualną datę i godzinę na konsoli.
3. Utwórz ziarno w konfiguracji java o nazwie `helloWorld` klasy `pl.coderslab.bean.HelloWorld`.
4. Pobierz ziarno w metodzie main a następnie wywołaj na nim metodę `getMessage`.

-------------------------------------------------------------------------------


#### Zadanie 3
1. Utwórz klasy `Component1` oraz `Component2` klasa `Component1` powinna posiadać zależność do klasy `Component2`.
2. Zdefiniuj ziarna w konfiguracji javy, wstrzyknij do klasy `Component1` wymaganą zależność.
3. Pobierz ziarno `Component1` w metodzie main programu.

#### Zadanie 4
1. Utwórz 2 klasy `Scope1` oraz `Scope2`.
2. W konfiguracji java zdefiniuj je jako ziarna Springa.
3. Ziarno klasy `Scope2` zdefiniuj z zasięgiem typu `prototype`.
4. W klasie main pobierz po 2 ziarna każdego typu a następnie je wyświetl w następujący sposób:
````java
Scope1 scope1 = context.getBean(Scope1.class);
System.out.println(scope1);
Scope1 scope11 = context.getBean(Scope1.class);
System.out.println(scope11);
Scope2 scope2 = context.getBean(Scope2.class);
System.out.println(scope2);
Scope2 scope22 = context.getBean(Scope2.class);
System.out.println(scope22);

````
Zwróć uwagę że w pierwszym przypadku otrzymamy ten sam obiekt, a w drugim dwa różne.

#### Zadanie 5
1. Utwórz projekt Maven o nazwie `Spring01JavaAuto`.
2. Dodaj klasę konfiguracji java.
3. W klasie konfiguracji określ automatyczne skanowanie dla pakietu `pl.coderslab.beans`.
4. Utwórz dwie klasy `Auto1` oraz `Auto2` oznacz je adnotacją `@Component`.
5. W klasie `Auto2` wstrzyknij obiekt `auto1`.
6. W metodzie main klasy `SpringDiApplication` utwórz obiekt kontekstu na podstawie konfiguracji.
7. Wywołaj poniższy kod:
````java
Auto1 auto1 = context.getBean(Auto1.class);
System.out.println(auto1.getAuto2().getClass().getName());
````