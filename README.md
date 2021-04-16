![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/152855/73064373-5ed69780-3ea1-11ea-8a71-3d370a5e7dd8.png)

# Podstawy programowania w Java
> Kilka ważnych informacji

Przed przystąpieniem do rozwiązywania zadań przeczytaj poniższe wskazówki.

## Jak zacząć?

1. Stwórz [*fork*](https://guides.github.com/activities/forking/) repozytorium z zadaniami.
2. Sklonuj repozytorium na swój komputer. Użyj do tego komendy `git clone adres_repozytorium`.

Adres repozytorium możesz znaleźć na stronie repozytorium po naciśnięciu w guzik "Clone or download".

Zwróć uwagę, żeby użyć adresu własnego forka, powinien wyglądać zgodnie ze schematem:
`https://github.com/twoj-login/adres_repozytorium`


3. Zaimportuj projekt jako projekt `Maven`, wg poniższych wskazówek:

	* W `IntelliJ` wybieramy: `File –> New –> Project from Existing Sources...`
	* Wskazujemy lokalizację katalogu ze sklonowanym projektem i zatwierdzamy.
	* Następnie w nowym oknie wybieramy: `Import project from external model` i wskazujemy `Maven`
	* Wybieramy opcję: ` Finish`, (w `IntelliJ` przed 2020: `Next –> Next –> Next –> Finish`);

4. Rozwiąż zadania i zakomituj zmiany do swojego repozytorium. Użyj do tego komend `git add nazwa_pliku`.
Jeżeli chcesz dodać wszystkie zmienione pliki użyj `git add .` 
Pamiętaj że kropka na końcu jest ważna!
Następnie zakomituj zmiany komendą `git commit -m "nazwa_commita"`
5. Wypchnij zmiany do swojego repozytorium na GitHubie.  Użyj do tego komendy `git push origin master`.
W repozytoriach utworzonych po 1 października 2020 `git push origin main`.
6. Stwórz [*pull request*](https://help.github.com/articles/creating-a-pull-request) do oryginalnego repozytorium, gdy skończysz wszystkie zadania.


**Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.**

## Uwagi do zadań

Jeśli masz uwagi do zadań, możesz je zgłaszać mailowo na adres: 
 <a href="mailto:<a href='mailto:arkadiusz.jozwiak@coderslab.pl'>arkadiusz.jozwiak@coderslab.pl</a>">arkadiusz.jozwiak@coderslab.pl</a>,
 w temacie wpisując: **Uwagi do zadań**.
 
Aby można było szybko zlokalizować problem i się do niego odnieść, umieść w mailu następujące informacje:

- link do strony z zadaniem
- numer zadania (ewentualnie podpunkt)
- opis problemu


## Zadanie 1 - rozwiązywane z wykładowcą

1. Zaimportuj projekt typu `Maven`.
2. Utwórz klasę testującą o nazwie `SimpleSampleTest`.
4. Uruchom test a następnie popraw go dowolnie tak, by test przeszedł.


## Zadanie 2 - rozwiązywane z wykładowcą

1. Utwórz 2 dowolne klasy testujące z przynajmniej jednym testem w każdej.
2. Utwórz `Test Suite` dla utworzonych klas.
3. Uruchom i przetestuj działanie.


## Zadanie 1 - rozwiązywane z wykładowcą

W pliku `FirstTest.java`

1. Utwórz testy do metod klasy `First.java`;
	* testConcatString
	* testMultiply


## Zadanie 2

W pliku `SimpleCalculatorTest.java`

1. Utwórz testy do metod klasy `SimpleCalculator.java`;
2. Utwórz test sprawdzający wystąpienie wyjątku.


## Zadanie 3

1. W klasie `MaxValue.java` znajduje się metoda, która wyszukuje największą wartość w tablicy.
2. Napisz testy dla metody, sprawdzając poprawność wskazań.
3. Jeżeli to konieczne popraw implementację metody.


## Zadanie 4

1. Utwórz klasę `Calculator.java`, która będzie implementowała cztery działania matematyczne 
	* dodawanie
	* odejmowanie
	* mnożenie 
	* dzielenie
	* porównanie 2 wartości (boolean greater(int a, int b))

2. Utwórz klasę `CalculatorTest.java`, która będzie implementowała testy dla tej klasy.


## Zadanie 5

1. Uzupełnij klasę testującą o poniższy test:
````java
@Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    int sum = calculator.eval("1+2+3");
    assertEquals(6, sum);
  }

````
2. Dodaj do klasy `Calculator` implementację metody tak by test zakończył się powodzeniem.


## Zadanie 1 - rozwiązywane z wykładowcą

Napisz klasę `User` oraz klasę `UserRepository` implementującą następujące funkcjonalności:
  1. Tworzenie użytkownika.
  2. Edycję użytkownika.
  3. Usuwanie użytkownika.

Napisz klasę testującą dla `UserRepository`.
Napisz to zadanie, używając w pełni metodologii TDD.

Do przechowywania informacji o użytkownikach możesz użyć mapy, np:

```java
public class UserRepository {

    private Map<Integer, User> users;

    public UserRepository() {
        this.users = new HashMap<>();
    }

// pozostałe metody
}
```


## Zadanie 2 - rozwiązywane z wykładowcą

Napisz klasę `Factors` mającą jedną statyczną metodę ```generatePrimeFactors(n)```, która wygeneruje 
wszystkie dzielniki podanej liczby ```n``` w kolejności numerycznej (od najmniejszego).  

Napisz to zadanie, używając w pełni metodologii TDD.  

Wykonuj commit po każdy z 3 etapów procesu, czyli:
- po napisaniu testów
- po napisaniu kodu
- po refaktoryzacji



## Zadanie 3

1. Napisz klasę `Circle` z jedną metodą publiczną ```circleArea(r)``` zwracającą obliczone pole koła dla promienia `$r`.
2. W przypadku podania ujemnej wartości argumentu `r` metoda powinna rzucić wyjątek.
3. Wynik należy zaokrąglić **w górę** do `2` liczb po przecinku.  

Napisz to zadanie, używając w pełni metodologii TDD.  

Wykonuj commit po każdy z 3 etapów procesu czyli:
- po napisaniu testów
- po napisaniu kodu
- po refaktoryzacji




## Zadanie 4

* Napisz, używając techniki TDD, **TaxesOperation** a w niej metodę **calculateVat**. 
* Metoda ma przyjmować:
    * price - cena,
    * vat - stawka podatku VAT jako liczba całkowita.
* Metoda powinna zwrócić kwotę podatku VAT do zapłaty.



## Zadanie 5 - dodatkowe

Napisz, używając techniki TDD, klasę **PasswordUtils** a w niej metodę o nazwie
 **validatePasswordStrength**. 
Funkcja powinna przyjmować hasło (w postaci zwykłego napisu), a wartość logiczną. 

**Wymagania:**

* hasło ma mieć minimum 7 znaków,
* powinno zawierać:
    * przynajmniej jedną wielką literę,
    * przynajmniej jedną małą literę,
    * przynajmniej jedną cyfrę,
    * przynajmniej jeden znak specjalny z zakresu:
    `!@#$%^&*()_+-={}[]|\:";'<>?,./"`,
* jeśli któryś z warunków hasła (długość lub obecność odpowiednich znaków) nie został spełniony, 
metoda ma zwrócić `false`.


## Zadanie 6 - dodatkowe

Wyobraź sobie, że Twój klient, dla którego pisałeś funkcję w poprzednim zadaniu,
 zażądał zmiany w kodzie:
 
 hasło musi mieć przynajmniej 8 znaków. 
 
 Zgodnie z zasadą TDD, popraw testy, a potem kod programu.
