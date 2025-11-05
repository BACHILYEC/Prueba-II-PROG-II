public void visualizar(Naranja naranja, Durazno duraznito, Limon limoncito, ReinaClaudia reinita) {
    String msg1 = "[estado] maduro";
    String msg2 = "[estado] sin madurar";
    System.out.println("---------------------");
    if (naranja.getEstaMaduro()) {
        System.out.println("* Naranaja - " + msg1);
    } else {
        System.out.println("* Naranaja - " + msg2);
    }
    if (duraznito.getEstaMaduro()) {
        System.out.println("* Durazno - " + msg1);
    } else {
        System.out.println("* Durazno - " + msg2);
    }
    if (limoncito.getEstaMaduro()) {
        System.out.println("* Limon - " + msg1);
    } else {
        System.out.println("* Limon - " + msg2);
    }

    if (reinita.getEstaMaduro()) {
        System.out.println("* Reina Claudia - " + msg1);
    } else {
        System.out.println("* Reinita Claudia - " + msg2);
    }
    System.out.println("---------------------");
}