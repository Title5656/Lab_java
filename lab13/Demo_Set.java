//name: Witawat
//ID: 6887054
//Sec: 2
import java.util.*;

/**
 * ITDS121 Week 13 – Demo: Set
 * หัวข้อ: HashSet | TreeSet | LinkedHashSet | Set Operations
 */
public class Demo_Set {

    public static void main(String[] args) {

        demo1_HashSetBasics();
        demo2_NoDuplicates();
        demo3_ThreeTypes();
        demo4_SetOperations();
    }

    // ══════════════════════════════════════════════════════
    //  DEMO 1: HashSet – basic operations
    // ══════════════════════════════════════════════════════
    static void demo1_HashSetBasics() {
        sep("DEMO 1: HashSet – add / remove / contains / size");

        Set<String> fruits = new HashSet<>();

        // add()
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println("After add 3 items : " + fruits);
        System.out.println("size()            : " + fruits.size());

        // contains()
        System.out.println("contains(Apple)   : " + fruits.contains("Apple"));
        System.out.println("contains(Grape)   : " + fruits.contains("Grape"));

        // remove()
        boolean removed = fruits.remove("Apple");
        System.out.println("remove(Apple)     : " + removed);
        System.out.println("After remove      : " + fruits);

        // clear()
        fruits.clear();
        System.out.println("After clear()     : " + fruits);
        System.out.println("isEmpty()         : " + fruits.isEmpty());
    }

    // ══════════════════════════════════════════════════════
    //  DEMO 2: Set ไม่มีซ้ำ  ← จุดต่างจาก List
    // ══════════════════════════════════════════════════════
    static void demo2_NoDuplicates() {
        sep("DEMO 2: Set ไม่เก็บซ้ำ (List เก็บซ้ำได้)");

        // List – เก็บซ้ำได้
        List<String> list = new ArrayList<>(Arrays.asList("Java","Python","Java","HTML","Java"));
        System.out.println("List  (size=" + list.size() + ") : " + list);

        // Set – ตัดซ้ำออกอัตโนมัติ
        Set<String> set = new HashSet<>(Arrays.asList("Java","Python","Java","HTML","Java"));
        System.out.println("Set   (size=" + set.size() + ") : " + set);

        // add() คืนค่า boolean บอกว่าเพิ่มได้ไหม
        System.out.println("\nset.add(CSS)  → " + set.add("CSS"));     // true – ใหม่
        System.out.println("set.add(Java) → " + set.add("Java"));     // false – ซ้ำ
    }

    // ══════════════════════════════════════════════════════
    //  DEMO 3: สาม implementation – ลำดับต่างกัน
    // ══════════════════════════════════════════════════════
    static void demo3_ThreeTypes() {
        sep("DEMO 3: HashSet vs TreeSet vs LinkedHashSet");

        List<String> data = Arrays.asList("Banana","Apple","Cherry","Apricot","Mango");
        System.out.println("Input order      : " + data);

        Set<String> hash   = new HashSet<>(data);
        Set<String> tree   = new TreeSet<>(data);
        Set<String> linked = new LinkedHashSet<>(data);

        System.out.println("HashSet          : " + hash);    // ไม่แน่นอน
        System.out.println("TreeSet          : " + tree);    // A-Z เสมอ
        System.out.println("LinkedHashSet    : " + linked);  // ตามลำดับ insert
    }

    // ══════════════════════════════════════════════════════
    //  DEMO 4: Set Operations – ใช้ใน Lab 13
    // ══════════════════════════════════════════════════════
    static void demo4_SetOperations() {
        sep("DEMO 4: Set Operations");

        Set<String> A = new HashSet<>(Arrays.asList("Java","HTML","CSS","Python"));
        Set<String> B = new HashSet<>(Arrays.asList("Java","CSS","React","Node"));

        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println();

        // Union  – addAll()
        Set<String> union = new HashSet<>(A);
        union.addAll(B);
        System.out.println("A ∪ B  (addAll)       = " + union);

        // Intersection – retainAll()
        Set<String> intersect = new HashSet<>(A);
        intersect.retainAll(B);
        System.out.println("A ∩ B  (retainAll)    = " + intersect);

        // Difference – removeAll()
        Set<String> diff = new HashSet<>(A);
        diff.removeAll(B);
        System.out.println("A − B  (removeAll)    = " + diff);

        // Subset – containsAll()
        Set<String> sub = new HashSet<>(Arrays.asList("Java","CSS"));
        System.out.println("\nsub = " + sub);
        System.out.println("A.containsAll(sub)    = " + A.containsAll(sub));  // true
        System.out.println("A.containsAll(B)      = " + A.containsAll(B));   // false
    }

    // ── helper ──────────────────────────────────────────
    static void sep(String title) {
        System.out.println("=======================================================");
        System.out.println("  " + title);
        System.out.println("=======================================================");
        
    }

}
