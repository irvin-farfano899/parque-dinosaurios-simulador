# Simulador Parque Turístico de Dinosaurios

## Descripción
Proyecto desarrollado como laboratorio práctico para la simulación de administración y operación de un parque temático de dinosaurios. El sistema permite gestionar dinosaurios, controlar flujos y persistir datos.

## Herramientas Utilizadas
- **Lenguaje:** Java 17
- **Gestor de dependencias:** Maven
- **Persistencia:** Archivos JSON (Librería Jackson para serialización)
- **Entorno de desarrollo:** IntelliJ IDEA

## Instrucciones de Configuración y Ejecución
1. **Requisitos:** Tener instalado JDK 17 o superior y Maven.
2. **Ejecución:** - Abrir el proyecto en IntelliJ.
    - Asegurarse de que el archivo `src/main/resources/config.properties` contenga las configuraciones base.
    - Ejecutar la clase principal `Main.java` (ubicada en `org.example.Main`).
3. **Persistencia:** Los datos se guardarán automáticamente en archivos `.json` en la raíz del proyecto al realizar operaciones de registro, modificación o eliminación.

## Patrones de Diseño
- **Service Layer:** Implementado en `ParqueService` para centralizar la lógica de negocio y desacoplar el control de la persistencia.
- **Data Access Object (DAO):** Implementado en `GestorJSON` para manejar las operaciones de lectura/escritura de archivos sin exponer la lógica de la base de datos a otras clases.

## Autor
- Irvin Francisco Farfan Ocaña