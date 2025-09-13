package com.example.analisisdecalificaciones

//Maria Guadalupe Hernandez Tomas
//4A
fun main() {
    val analizador = AnalizadorCalificaciones();
    analizador.Captura();
    analizador.Imprimir();

    println("Promedio: ${analizador.calcularPromedio()}");

    println("Materias aprobadas: ${analizador.contarAprobadas()}");
    println("Materias reprobadas: ${analizador.contarReprobadas()}");

    println("La calificacion maxima es: ${analizador.obtenerCalificacionMaxima()}");
    println("La calificacion minima es: ${analizador.obtenerCalificacionMinima()}");

}
