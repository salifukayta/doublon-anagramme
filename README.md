# Doublon-Anagramme

## Doublon

### Analyse de l'algorithme

L'algorithme se déroule comme ceci:
- lit de tout le fichier en mémoire, ce qui nous donne une complexité en mémoire de n.
- boucle sur la liste pour construit un objet pour chaque element, ce qui fait une complexité de O(n) et une compléxité mémoire n
- applique l'algorithme de trie rapide sur la liste avec une complexité de O(n ln(n))
- boucle sur la liste et affiche le mot et l'index initial de chaque 2 éléments successives s'ilt ont le même text, la complexité est égale O(n)

A la fin de l'algorithme, on se retrouve avec une complexité de O(n ln(n)) et une complexité en mémoire de n * (nombre de mot et leurs index)

### Lancement

### Exemple de résultat affiché à sortie standard

## Anagrammes

### Analyse de l'algorithme

L'algorithme se déroule comme ceci:
- lit lecontenu du fichier en mémoire, ce qui nous donne une complexité en mémoire de n.
- boucle sur la liste pour construit un objet pour chaque element, trie chaque les lettres de chaque mot dans le constructeur et le stocke le mot initial ainsi que le mot trié dans l'objet, ce qui fait une complexité de O(n m ln(m)), m étant la plus grande taille d'un mot et une compléxité mémoire 2n
- applique l'algorithme de trie rapide sur la liste avec une complexité de O(n ln(n))
- boucle sur la liste et affiche le mot initial et l'index initial de chaque 2 éléments successives s'ilt ont le même text trié, la complexité est égale O(n)


A la fin de l'algorithme, on se retrouve avec une complexité de O(n ln(n)) si n > m ou bien O(n m ln(m)) si m > n et une complexité en mémoire de 2 n * (nombre de mot et leurs index)

### Lancement

### Exemple de résultat affiché à sortie standard
