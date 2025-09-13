package com.example.analisisdecalificaciones

class AnalizadorCalificaciones {
    var calificaciones = mutableListOf<Float>()

    fun Captura(){
        println("Captura tus calificaciones");
        for (i in 1..7){
            println("Ingresa la calificacion ${i}: ");
            val cal: Float= readln().toFloat();
            calificaciones.add(cal);
        }

    }
    fun Imprimir(){

        println("Las calificaciones capturadas son: ")
        for (i in 1..7){
            println("La calificacion ${i}: ${calificaciones[i-1]}");
        }
    }

    fun calcularPromedio(): Float {
        //.average() suma todos los numeros en un rango o lista
        // y luego dividirlos por la cantidad de esos numeros y obtener el promedio
        return calificaciones.average().toFloat().toFloat();

    }

    fun contarAprobadas(): Int{
        //.count cuenta los elementos dentro de un objeto como una lista
        //{it} columna o variable especifica dentro de una coleccion
        return calificaciones.count { it >=7 };
    }

    fun contarReprobadas(): Int {
        return calificaciones.count { it < 7};
    }

    fun obtenerCalificacionMaxima(): Float?{
        return calificaciones.maxOrNull();
    }
    fun obtenerCalificacionMinima(): Float? {
        return calificaciones.minOrNull();
    }
}