![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Evaluación Sumativa 2 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Ignacio Andrés Ibáñez Fariña
- **Sección:** I_003A
- **Carrera:** Analista Programador Computacional
- **Sede:** Modalidad Online

---

## 📘 Descripción general del sistema
Sistema de Gestión de Personal para la empresa salmonera Salmontt (Puerto Montt, Chile).

Versión 1.0: Modelo básico con clases Persona, Empleado y Direccion aplicando encapsulamiento, herencia y composición.

Versión 2.0 (actual): Sistema completo que carga empleados desde archivo, permite búsquedas por RUT y departamento, usa colecciones (ArrayList) y maneja excepciones.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 SistemaGestionSalmontt/
│
├── 📁 src/
│   ├── 📁 app/
│   │   └── Main.java              # Clase principal
│   │
│   ├── 📁 model/
│   │   ├── Persona.java           # Clase base
│   │   ├── Empleado.java          # Hereda de Persona
│   │   └── Direccion.java         # Gestión de direcciones
│   │
│   ├── 📁 service/
│   │   └── GestorEmpleados.java   # Búsquedas y filtros
│   │
│   └── 📁 util/
│       └── LectorDeArchivos.java  # Lectura de archivos
│
├── 📄 empleados.txt
└── 📄 README.md
````
---

**Repositorio GitHub:** \https://github.com/Broskiwi/SistemaGestionSalmontt.git
**Fecha de entrega:**

Sumativa 1 (v1.0): 09-11-2025
Sumativa 2 (v2.0): 23-11-2025

---

© Duoc UC | Escuela de Informática y Telecomunicaciones



