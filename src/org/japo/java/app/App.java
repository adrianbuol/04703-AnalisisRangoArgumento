/*
 * Copyright 2019 Adrian Bueno Olmedo - adrian.bueno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

/**
 *
 * @author Adrián Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public final class App {
 
    public static final int NUM = 50;
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static final int analizarRango(double num, double min, double max) {

        if (num > max) {
            System.out.println("Análisis .....: FUERA (Arriba)");
        } else if (num < min) {
            System.out.println("Análisis .....: FUERA (Abajo)");
        } else {
            System.out.println("Análisis .....: DENTRO");
        }
        return (int) num;
    }

    public final void launchApp() {
        System.out.println("ANÁLISIS DE RANGO");
        System.out.println("=================");
        System.out.println("Número .......: " + NUM);
        System.out.println("---");
        System.out.println("Mínimo .......: " + MIN);
        System.out.println("Máximo .......: " + MAX);
        System.out.println("---");
        analizarRango(NUM, MIN, MAX);

    }
}
