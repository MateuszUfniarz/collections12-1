# Kolekcje 

## W jaki sposób wygląda hierarchia interfejsów związana z kolekcjami?

* Na szczycie hierarchi znajduje się interfejs Collection
* Pochodnymi interfejsu Collection są List, Set, Queue, Deque
* Interfejst Map nie znajduje się w powyższej hierarchii
* Interfejs SortedSet, SortedMap umożliwiają przechowywanie 
posortowanych kolekcji

## Jakie są podstawowe implementacje poszczególnych interfejsów?

* Implementacjami interfejsu List są: LinkedList, ArrayList
* Implementacjami interfejsu Set są: HashSet, TreeSet, LinkedHashSet
* Implementacje interfejsu Queue: LinkedList
* Implementacje interfejsu Deque: LinkedList
* Implementacje interfejsu Map: HashMap, TreeMap, LinkedHashMap

## W których kolekcjach elementy są sortowane i w jaki sposób?

* Interfejsy SortedSet i SortedMap umożliwiają przechowywanie kolekcji
uporządkowancy. Wykorzystywany jest naturalny porządek obiektów (compareTo)
lub można wskazać Comparator. Implementacjami są TreeSet i TreeMap.

## Napisać operacje wykorzystującą różne implementacje Set i sprawdzić różnice w operacjach dodawania do zbioru

* Napisać program, w którym do zbioru zostanie dodanych kilka wyrazów, a następnie wyświetlona zostanie zawartość zbioru (for-each)
* Sprawdzić różnice pomiędzy HashSet, TreeSet, LinkedHashSet
* HashSet nie ma gwarancji odnośnie porządku
* TreeSet drzewo przechowuje elementy zgodnie z wartością
* LinkedHashSet przechowuje elementy zgodnie z kolejnością wstawiania

## Implementacje interfejsu List – złożoność operacji

* Klasa ArrayList wykorzystuje wewnętrznie implementację tablicową
* Klasa LinkedList wykorzystuje implementację dowiązaniową
* Różnice pojawiają się podczas wykonywania operacji: odczytywanie 
i-tego elementu listy, zapisywanie i-tego elementu listy, dodawanie 
elementu na początek listy, usuwanie elementu z początku listy

## Napisać aplikację wykorzystującą różne implementacje List i sprawdzić różnice w operacjach dodawania na początek listy, usuwania z początku listy, przeglądania całej listy

* Zaimplementować metody: dodawanie n elementów na początek listy, usuwanie n elementów z początku listy, odczytywanie wszystkich n elementów listy, metody przyjmują parametr typu List<Integer>
* Porównać czas wykonania powyższych metod dla LinkedList i ArrayList

## Do których kolekcji można wstawiać wartości null?