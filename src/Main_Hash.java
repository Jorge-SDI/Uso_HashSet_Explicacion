import java.util.HashSet;
import java.util.Set;

public class Main_Hash {
    public static void main(String[] args) {
        //creamos el hashset con los productos
        Set<Producto> inventario = new HashSet<>();

        // Creamos objetos diferentes
        Producto p1 = new Producto("P001", "Laptop");
        Producto p2 = new Producto("P002", "Mouse");
        Producto p3 = new Producto("P003", "Tablet");
        Producto p4 = new Producto("P004", "Escritorio");
        System.out.println();
        // Insertamos los elementos al hashset
        System.out.println("--- Agregando productos al HashSet... ---");
        System.out.println("¿Se agregó la laptop?: " + inventario.add(p1));
        System.out.println("¿Se agregó el mouse?: " + inventario.add(p2));
        System.out.println("¿Se agregó la tablet?: " + inventario.add(p3));
        System.out.println("¿Se agregó el escritorio?: " + inventario.add(p4));

        //intentaremos agregar un elemento duplicado para ver como se comporta en estos casos la estructura
        Producto p6 = p1;
        System.out.println();
        //Veremos que no se agrega puesto que es el mismo elemento ya previamente insertado
        System.out.println("¿El producto duplicado fue agregado?: " + inventario.add(p6));
        System.out.println();
        // Mostramos el contenido final
        System.out.println("--- Elementos en el HashSet ---");
        System.out.println("Productos en el inventario (cantidad): " + inventario.size());
        for (Producto prod : inventario) {
            System.out.println(prod);
        }
        System.out.println();
        //vaciamos todos los elementos del hashset
        inventario.clear();

        //verificamos si está vacío el hash
        System.out.println("Esta vacio?: " + inventario.isEmpty());
        System.out.println("=======================================");
    }
}
