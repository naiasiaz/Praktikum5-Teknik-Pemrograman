package w5.tesmultipleinheritance;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-18
 */

abstract class Sortable{
    public abstract int compare(Sortable b);
    public static void shell_sort(Sortable[] a) {
        int n  = a.length;
        for (int jarak = n/2; jarak > 0; jarak /= 2) {
            for (int i = jarak; i < n; i++) {
                Sortable temp = a[i];
                int j;
                for (j = i; j >= jarak && a[j - jarak].compare(temp) > 0; j -= jarak) {
                    a[j] = a[j - jarak];
                }
                a[j] = temp;
            }
        }
    }
    
    public static void printPerson(Sortable[] p) {
        for (Sortable person : p) {
            System.out.println(p);
        }
    }
}
