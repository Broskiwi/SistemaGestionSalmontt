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
│   ├── 📁 ui/
│   │   └── Main.java              # Clase principal
│   │
│   ├── 📁 model/
│   │   ├── Persona.java           # Clase base
│   │   ├── Empleado.java          # Hereda de Persona
│   │   └── Direccion.java         # Gestión de direcciones
│   │
│   ├── 📁 data/
│   │   └── GestorEmpleados.java   # Búsquedas y filtros
│   │
│   └── 📁 util/
│       └── LectorDeArchivos.java  # Lectura de archivos
│
├── 📄 empleados.txt
└── 📄 README.md
````
---

⚙️ Instrucciones para clonar y ejecutar el proyecto
1. Clona el repositorio desde GitHub:
git clone https://github.com/Broskiwi/SistemaGestionSalmontt.git
2. Abre el proyecto en IntelliJ IDEA.

3. Verifica que los archivos .txt estén correctamente ubicados.

4. Ejecuta el archivo Main.java desde el paquete ui.

5. Sigue las instrucciones en consola o en la interfaz gráfica (si corresponde).

---
**Repositorio GitHub:** \https://github.com/Broskiwi/SistemaGestionSalmontt.git
**Fecha de entrega:**

Sumativa 1 (v1.0): 09-11-2025
Sumativa 2 (v2.0): 23-11-2025

---

© Duoc UC | Escuela de Informática y Telecomunicaciones



