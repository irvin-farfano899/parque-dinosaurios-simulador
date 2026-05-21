# Simulador Parque Turístico de Dinosaurios

Proyecto desarrollado como laboratorio práctico para la simulación de administración de un parque temático de dinosaurios.

## Tecnologías Utilizadas
* **Java 17**
* **Maven** (Manejador de dependencias)
* **IntelliJ IDEA** (Entorno de desarrollo)
* **Git / GitHub** (Control de versiones)

## Descripción
El sistema permite la administración integral de un parque, incluyendo:
* Registro y gestión de dinosaurios.
* Persistencia de datos en formato JSON.
* Eventos aleatorios (escapes, fallas de energía).
* Sistema de monitoreo de estado.

## Instrucciones de Configuración
1. Asegúrate de tener instalado **JDK 17** o superior.
2. Clona este repositorio en tu computadora.
3. Abre el proyecto en IntelliJ IDEA y permite que Maven descargue las dependencias.

## Forma de Ejecución
* Para ejecutar el simulador, corre la clase principal: `org.example.Main`.
* Para verificar la lógica de negocio, ejecuta los tests unitarios en: `src/test/java/org/example/service/ParqueServiceTest.java`.

## Diseño del Sistema (UML)
El siguiente diagrama muestra la estructura de clases del proyecto:

```mermaid
classDiagram
    class Dinosaurio {
        +Long id
        +String nombre
        +String especie
        +boolean esCarnivoro
    }
    class ParqueService {
        -List listaDinosaurios
        +registrarDinosaurio(Dinosaurio d)
        +listarDinosaurios() List
        +modificarDinosaurio(Long id, String nombre, String especie, boolean carnivoro) boolean
    }
    class GestorJSON {
        +guardar(List lista)
        +cargar() List
    }
    
    ParqueService o-- Dinosaurio : gestiona
    ParqueService --> GestorJSON : utiliza