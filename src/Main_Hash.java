import java.util.HashSet;
public class Main_Hash {
    public static void main(String[] args) {
        //declaración del hashset
        //estructura + tipo de dato + nombre elegido = creación del hashset
        HashSet<Integer> ejemplo = new HashSet<>();

        // Agregando/insertando elementos en el hash usando el comando add()
        ejemplo.add(20);
        ejemplo.add(19);
        ejemplo.add(12);
        ejemplo.add(67);
        ejemplo.add(56);
        ejemplo.add(88);

        System.out.println("=======================================");
        //mostramos el hash con sus elementos
        System.out.println("HashSet: " + ejemplo);
        //obtenemos el tamaño del hash
        System.out.println("Cantidad de elementos actual: " +  ejemplo.size());
        System.out.println("=======================================");

        // eliminamos/removemos un elemento
        ejemplo.remove(67);

        System.out.println();
        System.out.println("=======================================");
        // mostrar los elementos actualizados tras la eliminacion
        System.out.println("HashSet despues de eliminar: " + ejemplo);
        System.out.println("Cantidad de elementos actual: " +  ejemplo.size());
        System.out.println("=======================================");
        System.out.println();
        System.out.println("=======================================");
        // Retornamos false si el elemento no existe en el hash
        System.out.println("67 existe en el hash?: " + ejemplo.contains(67));

        //vaciamos el hash de todos sus elementos
        ejemplo.clear();

        //verificamos si está vacío el hash
        System.out.println("Esta vacio?: " + ejemplo.isEmpty());
        System.out.println("=======================================");
    }
}
