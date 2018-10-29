# Doublon-Anagramme

### Compilation
à la racine du projet, lancer la commande suivante pour compiler le projet dans le dossier target :
- > mvn package

## Doublon

### Analyse de l'algorithme

L'algorithme se déroule comme ceci:
- lire de tout le fichier en mémoire, ce qui nous donne une complexité en mémoire de n.
- boucler sur la liste pour construit un objet pour chaque element, ce qui fait une complexité de O(n) et une compléxité mémoire n
- appliquer l'algorithme de trie rapide sur la liste avec une complexité de O(n ln(n))
- boucler sur la liste et affiche le mot et l'index initial de chaque 2 éléments successives s'ilt ont le même text, la complexité est égale O(n)

A la fin de l'algorithme, on se retrouve avec une complexité de O(n ln(n)) et une complexité en mémoire de n (de mot et leurs index)

### Lancement
Après la compilation, se mettre à la racine du projet et lancer la commande suivante :
- > java -cp target/technical-test-0.0.1-SNAPSHOT.jar com.salim.wbm.technical_test.main.MainDoublon chemin_vers_fichier_log

ou chemin_vers_fichier_log contient le chemin du fichier à traiter. Par exemple:
- > java -cp target/technical-test-0.0.1-SNAPSHOT.jar com.salim.wbm.technical_test.main.MainDoublon "/home/wbm/test/ID_FICHIER.LOG"

### Exemple de résultat affiché à sortie standard

## Anagrammes

### Analyse de l'algorithme

L'algorithme se déroule comme ceci:
- lire lecontenu du fichier en mémoire, ce qui nous donne une complexité en mémoire de n.
- boucler sur la liste pour construit un objet pour chaque element, trie chaque les lettres de chaque mot dans le constructeur et le stocke le mot initial ainsi que le mot trié dans l'objet, ce qui fait une complexité de O(n m ln(m)), m étant la plus grande taille d'un mot et une compléxité mémoire 2n
- appliquer l'algorithme de trie rapide sur la liste avec une complexité de O(n ln(n))
- boucler sur la liste et affiche le mot initial et l'index initial de chaque 2 éléments successives s'ilt ont le même text trié, la complexité est égale O(n)

A la fin de l'algorithme, on se retrouve avec une complexité de O(n (log (n) + m log (m)) ) et de mémoire de n (de mot, mot trié et leurs index initiale)

### Lancement
Après la compilation, se mettre à la racine du projet et lancer la commande suivante :
- > java -cp target/technical-test-0.0.1-SNAPSHOT.jar com.salim.wbm.technical_test.main.MainAnagramme chemin_vers_fichier_log

ou chemin_vers_fichier_log contient le chemin du fichier à traiter. Par exemple:
- > java -cp target/technical-test-0.0.1-SNAPSHOT.jar com.salim.wbm.technical_test.main.MainAnagramme "/home/wbm/test/ID_FICHIER.LOG"


### Exemple de résultat affiché à sortie standard
