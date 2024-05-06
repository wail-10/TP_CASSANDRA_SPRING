# Compte rendu du TP - Manipulation de la base de données Cassandra avec Spring Boot
## Introduction
Le présent compte rendu décrit les étapes et les éléments implémentés lors du TP visant à manipuler une base de données Cassandra à travers une application Spring Boot. L'objectif principal était de créer une application permettant de gérer un keyspace 
nommé "ecommerce" contenant une table "products".

## Éléments du projet
### Entité Product:
L'entité Product a été créée avec les attributs suivants :
- id : UUID
- name: String
- price: double
- quantity: int
### Repository ProductRepository:
Un repository nommé ProductRepository a été mis en place pour réaliser les opérations d'accès à la base de données Cassandra.
### Couche service:
Une couche de service a été développée pour implémenter les opérations CRUD de base sur les produits. De plus, cette couche offre la possibilité de rechercher des produits par mot-clé.
### Contrôleur Rest:
Un contrôleur Rest a été créé pour exposer les différentes fonctionnalités de l'application. Ce contrôleur permet d'interagir avec les services CRUD ainsi que la recherche de produits par mot-clé.
### Tests avec Postman:
Les opérations ont été testées avec l'outil Postman pour vérifier le bon fonctionnement de l'application et la manipulation correcte de la base de données Cassandra.
1. Test de création d'un produit:
   ![image](https://github.com/wail-10/TP_CASSANDRA_SPRING/assets/79090195/0aba6325-c287-4454-b983-9e461b383a75)

3. Test de lecture d'un produit:
   Ici on cherche les produits en utilisant l'identifiant du produit
   ![image](https://github.com/wail-10/TP_CASSANDRA_SPRING/assets/79090195/ae10f8f0-f05b-420d-9c65-2b779c9f5253)

5. Test de lecture de tous les produits:
   
   ![image](https://github.com/wail-10/TP_CASSANDRA_SPRING/assets/79090195/3e74781b-9476-4a71-814f-e203a7f992e8)
![image](https://github.com/wail-10/TP_CASSANDRA_SPRING/assets/79090195/594a6bf5-0ee0-48cf-9738-291c877cae7b)

Test après l'ajout de category:
![image](https://github.com/wail-10/TP_CASSANDRA_SPRING/assets/79090195/281d41ea-9b13-4b57-892f-b43f768798f6)

6. Test de recherche par mot clé:
   Ici en cherche en utilisant un mot clé
   ![image](https://github.com/wail-10/TP_CASSANDRA_SPRING/assets/79090195/40fe1c51-9dfa-479c-9c9f-0315dc30e21e)

8. Test de mise à jour d'un produit:
   ![image](https://github.com/wail-10/TP_CASSANDRA_SPRING/assets/79090195/207b8a73-5c72-42c4-b38f-b2f5e244ae53)

10. Test de suppression d'un produit:
    ![image](https://github.com/wail-10/TP_CASSANDRA_SPRING/assets/79090195/d1d4d15f-90f7-4d90-a7b7-032e32357bb4)

## Conclusion
En conclusion, ce TP a permis de mettre en pratique la manipulation d'une base de données Cassandra à travers une application Spring Boot. Les différentes couches de l'application, y compris l'entité, 
le repository, le service et le contrôleur, ont été implémentées avec succès. De plus, les fonctionnalités CRUD de base ainsi que la recherche par mot-clé ont été testées avec succès en utilisant l'outil Postman.
