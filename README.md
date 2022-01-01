# cryptoweb
projet matéo paul quentin réaliser en formation CDA fin février 2020
</br>
Le but était de mettre en place une appli full stack, le back mavenisé en java relié à une base de donnée mySQL, et le front en html css js, avec du boostrap et du jQuery

</br>
</br>

# Installation:

- allez dans votre répertoire local de repos git pour cloner le projet
  
```git
git clone https://github.com/QuentinDAMMAN/cryptoweb.git
```
- se déplacer dans le projet
  
```git
cd cryptoweb\
```

- installer / vérifier que votre machine possède le service MySQL server, si oui activé le

- avec un connection root dans un SGBD tel que dBeaver, allez exécuté le fichier Script_All.sql dans SQL/script_qql/ pour généré une connection dédier (user, password) à une base donnée
  
- sur un tomcat en local dans sa machine déployer le fichier crypto-mvn.war dans le fichier webapps de son tomcat

- ensuite aller dans un navigateur et taper en haut :
  
```url
http://localhost:8080/crypto-mvn/index

```

![image](https://i.goopics.net/3ag947.png)