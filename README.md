# 🏠 House Builder

> Aquí las casas se levantan paso a paso, con `.build()`

Proyecto en **Java 21** con **Maven** que aplica el patrón de diseño **Builder** (GoF) a una entidad `House`, permitiendo construir distintos tipos de casa a partir de una combinación de características (garaje, jardín, piscina, estatuas decorativas) de forma flexible, escalable y desacoplada. Desarrollado siguiendo **TDD** (**JUnit 5 + Hamcrest**), con cobertura de tests medida con **JaCoCo**.

---

## 📑 Índice

- [Descripción](#-descripción)
- [Tecnologías](#-tecnologías)
- [Autora](#-autora)

---

## 📋 Descripción

**House Builder** aplica el patrón de diseño creacional **Builder** a la entidad `House`, permitiendo construir distintos tipos de casa sin depender de un único constructor con todos los parámetros posibles.

Cada casa se construye combinando estas características:

- Garaje
- Jardín
- Piscina
- Estatuas decorativas

El builder se implementa mediante una interfaz (`IHouseBuilder`), con `HouseBuilder` como única implementación concreta.

A esto se suma un `HouseDirector`, que aplica la forma completa del patrón Builder tal y como la explica la documentación oficial. Aunque no es estrictamente obligatorio, encapsula las combinaciones de características más habituales en métodos con nombre, dejando el código cliente más simple:

- `constructBasicHouse` — ninguna característica
- `constructHouseWithGarage`, `constructHouseWithGarden`, `constructHouseWithPool`, `constructHouseWithStatues` — una característica cada uno
- `constructLuxuryHouse` — las cuatro características

Los métodos del Director son `void` y reciben el builder como parámetro en vez de guardarlo en una instancia fija — así el Director no queda acoplado a un builder concreto, y puede recibir cualquiera que implemente `IHouseBuilder`. El resultado se obtiene aparte, llamando a `.build()` después de invocar la receta.

[Volver al índice](#-índice)

---

## 🛠️ Tecnologías

- **[Java 21](https://www.oracle.com/java/technologies/downloads/)** — Lenguaje de programación del proyecto
- **[Apache Maven](https://maven.apache.org/)** — Gestor de dependencias y construcción del proyecto
- **[JUnit 5](https://junit.org/junit5/)** — Framework de tests unitarios
- **[Hamcrest](https://hamcrest.org/JavaHamcrest/)** — Librería de matchers para aserciones legibles
- **[JaCoCo](https://www.jacoco.org/jacoco/)** — Medición de la cobertura de tests
- **[Visual Studio Code](https://code.visualstudio.com/)** — Editor usado para desarrollar y gestionar el proyecto
- **[Markdown](https://www.markdownguide.org/)** — Lenguaje de marcado para el README
- **[Git](https://git-scm.com/)** / **[GitHub](https://github.com/)** — Control de versiones y alojamiento del proyecto

---

## 👩‍💻 Autora

**[Jenny Sánchez Requejo](https://github.com/Jennydev-25)**

[Volver arriba](#-house-builder)
