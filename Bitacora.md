# Tarea Grupal 9 - Gilded Rose Exercise

**Guillermo Soliz Nagatoshi**
**Patricia Cano Encinas**
**Alvaro Cardenas Venegas**
**Manuel Saavedra**

# Smell Codes
**Conditional complexity** demasiadas sentencias "if" anidadas.

**"Large Class"** la clase GildedRose es una clase que hace todas las operaciones de comportamiento de un item.

**"Data Class"** la clase Item solo tiene los atributos de un item y los metodos get y set, no agrega capacidades para gestionar los diferentes comportamientos requeridos.

**"Data Clumps"** el metodo updateQuality tiene dos secciones bastante similar para realzar la actualizacion del atributo de calidad, haciendo que la toda la logica requerida no este en un solo bloque de codigo sino en varios. 

**"Magic Text / Magic Number"** existen muchos valores fijos en la lógica de negocio (hardcode), lo cual obligara a revisar todo el codigo en caso de modificarse un valor fijo determinado. 

**"Shotgun Surgery"** Realizar un cambio en la logica de negocio no se realiza en un solo bloque de codigo debe revisarse diferentes bloques de codigo del metodo updateQuality.

# Principios SOLID no respetados
**El principio SRP** no se respeta ya que la clase GildedRose en su metodo updateQuality() contiene toda la logica de negocio de los diferentes comportamientos que puede tener un Item.

**El principio OCP** no se respeta ya que el metodo updateQuality() debe ser modificado por cada inclusion de nuevo comportamiento, incrementando el riesgo de que todos los comportamientos de items se vean afectados por algun cambio.

# Patron de diseño
**Patron Strategy** Se ha implementado una interfaz generica ItemBehaivor y clases concretas: 
    
    - RegularItemBehaivor 
    - LegendItemBehaivor 
    - AgingItemBehaivor 
    - ConjuredItemBehaivor

y el contexto en el que se utilizan es en la clase Item.