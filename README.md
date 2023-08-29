# FigurasGeometricas

# Herencia:
La herencia es un principio clave en la programación orientada a objetos que permite crear nuevas clases basadas en clases existentes, heredando sus atributos y comportamientos. En el proyecto, esta idea se materializa a través de una jerarquía de figuras geométricas. La clase base FiguraGeometrica encapsula propiedades y métodos comunes a todas las figuras. Otras clases como Circulo, Triangulo y Rectangulo heredan de esta clase base, lo que significa que obtienen automáticamente las características de la clase padre. Esto fomenta la reutilización del código y establece una relación estructurada entre las diferentes figuras.

# Polimorfismo:
El polimorfismo es otro concepto esencial en la programación orientada a objetos, que permite tratar objetos de diferentes clases de manera uniforme. En el proyecto, el polimorfismo se refleja en el uso de un array de FiguraGeometrica para almacenar diferentes tipos de figuras. Esto se logra gracias a la relación de herencia mencionada anteriormente. A pesar de que las figuras pueden ser de tipos diferentes (círculo, triángulo, etc.), pueden ser manejadas de manera homogénea a través de métodos comunes definidos en la clase base.

# @Override:
La anotación @Override es utilizada en el proyecto para indicar que un método en una subclase está sobrescribiendo (reemplazando) un método en la clase base. Esto es fundamental para lograr el polimorfismo, ya que permite que una llamada a un método en una clase base invoque la versión adecuada del método en la subclase. En el proyecto, esto se observa en los métodos calcularArea() y calcularPerimetro(), que son marcados con @Override en las clases derivadas para proporcionar implementaciones específicas de cálculo de áreas y perímetros para cada figura geométrica.

En resumen, el proyecto "FigurasGeometricas" es un excelente ejemplo de cómo aplicar los conceptos de herencia, polimorfismo y la anotación @Override en la programación orientada a objetos. A través de la construcción de una jerarquía de figuras geométricas y la implementación de métodos especializados en las subclases, se logra una estructura flexible y modular que promueve la reutilización de código y la gestión eficiente de diferentes tipos de figuras.




