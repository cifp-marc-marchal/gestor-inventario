---
title: "Inventario CIFP Pere de Son Gall"
date: "2025-02-09"
authors:
  - Marc Marchal
  - Joan Bonet
  - Miquel Bonet
  - Leonie Kleindorp
---


# **Inventario CIFP Pere de Son Gall**

![Inventario CIFP Pere de Son Gall](./imgs/hero.png)

## Actividad evaluable 1-Entornos de desarrollo

**Equipo:**
- Marc Marchal
- Joan Bonet
- Miquel Bonet
- Leonie Kleindorp

**Día de entrega:** 9 de febrero de 2025

## Índice

1. [Inventario CIFP Pere de Son Gall](#inventario-cifp-pere-de-son-gall)
2. [Índice](#índice)
3. [Descripción del Proyecto](#descripción-del-proyecto)
4. [Distribución y roles del Trabajo (4 Personas)](#distribución-y-roles-del-trabajo-4-personas)
5. [Tecnologías utilizadas](#tecnologías-utilizadas)
6. [Uso de Git en el Proyecto](#uso-de-git-en-el-proyecto)
7. [Instrucciones de Uso](#instrucciones-de-uso)
8. [Registro de Reuniones y Decisiones Tomadas](#registro-de-reuniones-y-decisiones-tomadas)
  - [Sprint 1: Planificación del proyecto](#sprint-1-planificación-del-proyecto)
  - [Sprint 2: Desarrollo del menú principal y funcionalidades básicas](#sprint-2-desarrollo-del-menú-principal-y-funcionalidades-básicas)
  - [Sprint 3: Funcionalidades avanzadas del inventario](#sprint-3-funcionalidades-avanzadas-del-inventario)
  - [Sprint 4: Persistencia de datos, optimización y documentación (5-9 de febrero)](#sprint-4-persistencia-de-datos-optimizacion-y-documentación-5-9-de-febrero)

## Descripción del Proyecto

Este proyecto tiene como objetivo desarrollar un sistema de inventario utilizando Java. Durante su desarrollo, hemos implementado distintas funcionalidades, incluyendo la gestión de productos, eliminación, modificación y visualización del inventario. Se ha seguido una metodología ágil con sprints bien definidos para una organización eficiente.

## Distribución y roles del Trabajo (4 Personas)

- **Product Owner (Leonie Kleindorp):**
  - Responsable de maximizar el valor del producto.
  - Desarrollo del menú principal y funcionalidades básicas.
  - Implementación de funciones avanzadas (modificar, sustituir productos).
  - Pruebas, optimización, documentación y gestión del repositorio.

- **Scrum Master (Marc Marchal):**
  - Facilita el proceso Scrum y elimina obstáculos.
  - Implementación de funciones avanzadas (modificar, sustituir productos).
  - Redimensionamiento de arrays, persistencia de datos.
  - Pruebas, optimización, documentación y gestión del repositorio.

- **Equipo de Desarrollo (Joan Bonet y Miquel Bonet):**
  - Profesionales que crean el producto.
  - Implementación de funciones avanzadas (modificar, sustituir productos).
  - Pruebas, optimización, documentación y gestión del repositorio.
  - Mantenimiento de GitHub.

## Tecnologías utilizadas

En este proyecto hemos utilizado las siguientes herramientas y lenguajes para trabajar con la máxima eficiencia y organización:

### Herramientas

- Git
- GitHub
- Trello
- IntelliJ

### Lenguajes

- Java

## Uso de Git en el Proyecto

Para gestionar el control de versiones y la colaboración en el desarrollo del proyecto, se ha utilizado Git y GitHub.

### Repositorio en GitHub

- Se ha creado un repositorio en GitHub para alojar el código fuente.
- La estructura inicial incluye carpetas organizadas y un archivo `README.md`.

### Flujo de trabajo con ramas

- Se ha definido una rama principal (`main`) donde se almacena el código estable.
- Cada nueva funcionalidad o corrección de errores se desarrolla en una rama específica (por ejemplo, `feature/nombre-funcion` o `bugfix/nombre-fix`).
- Se realizan pull requests (PR) para fusionar cambios a `main` después de revisión y pruebas.

### Reglas de contribución

- Se han establecido normas para los commits, siguiendo una estructura clara (`feat:`, `fix:`, `docs:`, `refactor:`).
- Se exige revisión de código antes de fusionar cambios en `main`.
- Se ha implementado la asignación de issues y milestones para una mejor organización.

### Uso de GitHub Actions

- Se han configurado acciones para ejecutar pruebas automáticas antes de fusionar cambios.
- Verificación de calidad del código con herramientas de análisis estático.

## Estructura del Proyecto

El proyecto está compuesto por los siguientes archivos y carpetas:

- **`Main.java`**: Contiene el menú principal y la lógica para interactuar con el usuario.
- **`Inventory.java`**: Implementa la gestión del inventario con funciones como agregar, eliminar y modificar productos.
- **`Helper.java`**: Contiene funciones auxiliares para facilitar ciertas operaciones.
- **`.git/`**: Carpeta interna gestionada por Git para el control de versiones.
- **`.gitignore`**: Archivo que define qué archivos y carpetas deben ser ignorados por Git.
- **`README.md`**: Documentación del proyecto con instrucciones de uso y detalles técnicos.
- **`docs/`**: Carpeta que contiene documentación adicional, incluyendo minutas de reuniones y decisiones tomadas.

El código fuente se encuentra en la carpeta `src`, la documentación en `docs` y las pruebas en `tests`. Git ha sido parte fundamental de la estructura para el control de versiones y la colaboración.

## Instrucciones de Uso

Al ejecutar el programa, se mostrará un menú con las siguientes opciones:

- **Añadir producto:** Permite agregar un nuevo producto al inventario.
- **Eliminar producto por nombre:** Elimina un producto según el nombre ingresado.
- **Eliminar producto por posición:** Elimina un producto según su índice en el inventario.
- **Sustituir producto:** Permite reemplazar un producto en una posición específica.
- **Modificar producto:** Permite cambiar el nombre de un producto existente.
- **Mostrar productos:** Lista todos los productos en el inventario.
- **Mostrar resumen del inventario:** Muestra un listado con la cantidad total de cada producto.
- **Salir:** Finaliza la ejecución del programa.

## Registro de Reuniones y Decisiones Tomadas

Hemos realizado reuniones periódicas para la organización y revisión del proyecto:

- **Reuniones en clase:** Todos los miércoles de 15:00 a 15:55 h, donde se discute el progreso y se planifican las siguientes tareas de la semana.
- **Reuniones en casa:** Durante cada sprint, se realizan al menos dos reuniones adicionales entre semana (aproximadamente 1h a 1h 15min) para trabajar en el proyecto, mejorar funcionalidades y coordinar avances.

### Sprint 1: Planificación del proyecto

- **Fecha:** 15-21 de enero
- **Objetivo:** Definir el alcance, estructura del equipo, roles, metodología, herramientas y organización del trabajo.
- **Tareas:**
  - Definir roles en el equipo (asignar y establecer responsables y roles).
  - Seleccionar herramienta de gestión de tareas (Trello).
  - Definir backlog de tareas (desglosar las funcionalidades requeridas en tareas específicas y estimar cada tarea).
  - Crear repositorio en GitHub (configurar estructura inicial y añadir reglas de contribución).
  - Configurar el tablero Kanban (con sus columnas y tarjetas correspondientes).
  - Planificar el primer sprint de desarrollo (Sprint 2).

### Sprint 2: Desarrollo del menú principal y funcionalidades básicas

- **Fecha:** 22-28 de enero
- **Objetivo:** Crear la estructura básica del programa y las funciones iniciales del inventario.
- **Tareas:**
  - Implementación del menú principal.
  - Funcionalidad para mostrar todos los productos.
  - Funcionalidad para añadir un producto.
  - Funcionalidad para eliminar un producto por nombre.
  - Revisión de código y pruebas iniciales.

### Sprint 3: Funcionalidades avanzadas del inventario

- **Fecha:** 29 de enero - 4 de febrero
- **Objetivo:** Completar las funciones avanzadas y garantizar el correcto manejo de datos.
- **Tareas:**
  - Implementación de eliminación de un producto por posición.
  - Funcionalidad para modificar el nombre de un producto.
  - Sustitución de producto en una posición específica.
  - Función para mostrar un resumen del inventario.
  - Revisión y pruebas.

### Sprint 4: Persistencia de datos, optimización y documentación (5-9 de febrero)

- **Fecha:** 5-9 de febrero
- **Objetivo:** Añadir persistencia de datos, optimizar el programa y preparar la entrega final.
- **Tareas:**
  - Implementación de persistencia de datos.
  - Optimización y mejora del código.
  - Pruebas finales.
  - Redacción de la documentación.
  - Revisión final y entrega.
