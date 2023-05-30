public class StringMetodos {
    public static void main(String[] args) {

        String nombre= "Nico";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Nico\") = " + nombre.equals("Nico"));
        System.out.println("nombre.equalsIgnoreCase(\"NICO\") = " + nombre.equalsIgnoreCase("NICO"));
        System.out.println("nombre.compareTo(\"nico\") = " + nombre.compareTo("nico"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.substring(2) = " + nombre.substring(2));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));

        String nombre2="trabalengua";
        System.out.println("nombre2.replace(\"a\",\"o\") = " + nombre2.replace("a","o"));
        System.out.println("nombre2.indexOf(\"l\") = " + nombre2.indexOf("l"));
        System.out.println("nombre2.lastIndexOf(\"a\") = " + nombre2.lastIndexOf("a"));
        System.out.println("nombre2.contains(\"len\") = " + nombre2.contains("len"));

    }
}
