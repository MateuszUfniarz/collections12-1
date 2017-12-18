package pl.dominisz;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOperations {

    private static final SizeComparator SIZE_COMPARATOR = new SizeComparator();

    public static void main(String[] args) {
        System.out.println("HashSet");
        Set<String> set = new HashSet<String>();
        fillSet(set);
        showSet(set);
        System.out.println("TreeSet");
        //TODO dodać comparator porównujący długości łańcuchów
        set = new TreeSet<String>(SIZE_COMPARATOR);
        fillSet(set);
        //TODO Adam, Beata/Eliza, Celina, Dariusz, Franciszek
        showSet(set);
        System.out.println("LinkedHashSet");
        set = new LinkedHashSet<String>();
        fillSet(set);
        showSet(set);
    }

    /**
     * Wyświetla wszystkie elementy zbioru korzystając z for-each
     *
     * @param set zbiór do wyświetlenia
     */
    private static void showSet(Set<String> set) {
        for (String string : set)
            System.out.println(string);
    }

    /**
     * Wstawia do zbioru elementy: Adam, Beata, Celina, Dariusz, Eliza, Franciszek
     *
     * @param set zbiór do uzupełnienia
     */
    private static void fillSet(Set<String> set) {
        set.add("Adam");
        set.add("Celina");
        set.add("Beata");
        set.add("Franciszek");
        set.add("Eliza");
        set.add("Dariusz");
    }

}
