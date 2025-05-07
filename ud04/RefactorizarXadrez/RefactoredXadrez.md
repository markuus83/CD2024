# Refactoring
This is an exercise designed to practice the skill of detecting
Code Smells and refactoring the code to fix the problems.
Solution is also included.

## Code Smells covered:
#### 1. Long method:

    Un método que contén demasiadas líneas de código.


#### 2. Duplicate code within class:

    O mesmo código (ou similar) que aparece en distintas localizacións da MESMA clase.

    · Refactorizado no método 'getPiece()' na clase 'ChessBoard.java'

        
#### 3. Duplicate code within method:

    O mesmo código (ou similar) que aparece en distintas localizacións dentro do MESMO método.


#### 4. Duplicate code across classes:
    Código duplicado (ou similar) que aparece entre diferentes clases dun proxecto.


#### 5. Magic Number:

    Uso de números no código sen estar contidos nunha variable.


#### 6. Feature Envy (2 instances):

    Un método accede aos atributos doutro obxecto máis do que os seus atributos propios.

    · Refactorizado no método translatedPosition() da clase 'Position.java'


#### 7. Improper Naming:

    Uso de nomes impropios á hora de definir variables ou métodos.


#### 8. Dead Code:

    Código que nunca se ejecuta ni tiene niingún efecto en la funcionalidad del programa.

    · Refactorizado eliminando varios métodos -> getPlarName() y printMove()


#### 9. Lazy Class:

    Clase que non se utiliza ou case non aporta funcionalidades ao programa

    · Refactorizado no método 'makeMove()' da clase 'GameEngine.java'

        Elimina unha clase convertendo a súa mesma funcionalidade no método makeMove().


#### 10. Switch Case:

    Cando a estructura de control "switch" dificulta a lectura e comprensión do código. Ademáis, afecta>

    · Refactorizado un método da clase 'Piece.java' que utilizaba un método cun rule switch para asigna>

#### 11. Indecent Exposure:

    Refírese a incorrecta exposición de métodos, clases ou atributos dentro dun proxecto.

    · Refactorizado na clase abstracta 'Piece.java' no atributo '_color', cambiado a privado para evita>


#### 12. Collapse Hierarchy (Lazy Class):

    Nunha xerarquía de clases a subclase é prácticamente idéntica a da súa superclase.

    · Refactorizado directamente nas clases 'Bishop.java', 'Knight.java' e 'Rook.java'


#### 13. Long Parameter List:

    Uso excesivo de parámetros de entrada para un método.

    · Refactorizado método 'isValidMove()' na clase 'ChessBoard.java':

        En vez de pasarlle todos os atributos dun obxecto, parametriza o obxecto directamente, e dentro>

