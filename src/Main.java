import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class Main {
    public static void main(String... args) {
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(4);
        s.add(3);
        s.add(2);
        s.add(100);
        s.add(5);
        s.add(98);
        s.add(99);
        s.add(50);
        s.add(51);
        s.add(54);
        System.out.println(s);

        Set<Integer>l = new LinkedHashSet<>();
        l.add(1);
        l.add(4);
        l.add(3);
        l.add(2);
        l.add(100);
        l.add(5);
        l.add(98);
        l.add(99);
        l.add(50);
        l.add(51);
        l.add(54);
        System.out.println(l);

        Set<Integer> t = new TreeSet<>();
        t.add(1);
        t.add(4);
        t.add(3);
        t.add(2);
        t.add(100);
        t.add(5);
        t.add(98);
        t.add(99);
        t.add(50);
        t.add(51);
        t.add(54);
        System.out.println(t);
    }
}
/* Set Interface:
* Collection<interface>
            |
     Set<interface>
            |
     1. HashSet<class>
     2. Linked Hashset<class>
     3. TreeSet<class>

Set, does not allow to store the duplicate objects set is acts like a mathematical set operation
* set is acts like a mathematical set operations
* Set is implemented by 3 class:
* 1.HashSet
*      i. HashSet is one of them implementation of set interface.
*      ii.hashSet us hashTable or HashMap to store it's element or object.
*      iii.HashSet uses hashing technique to store it's element or objects.
*      iv. hashSet uses 3 constructor
* A. HashSet() - Using this constructor we can create an empty hash set object with default capacity 16 and
*                        default load factor is 0.75
*
* B. HashSet(Collection c) - Using this constructor we can convert any collection into hashset/set.
*
* C. HashSet(int capacity, float loadFactor) -  Using this constructor we can create a HashSet object with our
*                                                                    own capacity and load factor.
*
* Here in HashSet, we can use all the methods of collections except "get()" method
*
* LinkedHashSet stores elements in insertion order.
* TreeSet stores elements in sorted order.
* */