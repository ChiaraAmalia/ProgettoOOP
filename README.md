# Progetto Timeline Twitter

Un Web Service è un sistema software in grado di mettersi al servizio di un Client (applicazione, sito web, Postman), comunicando tramite il protocollo HTTP. Un Web service consente quindi agli utenti che vi si collegano di usufruire delle funzioni che mette a disposizione. Con Spring Boot, è stato possibile creare questo software che lancia l'intera applicazione web, compreso il web server integrato.

Questo progetto è finalizzato alla realizzazione di una timeline utente personalizzata contentente tutti i campi utili relativi agli ultimi cento tweet.

La nostra applicazione permette di richiedere mediante API REST (GET o POST) con rotte distinte:
* Restituzione dei metadati, formato JSON, ovvero l’elenco degli attributi, alias degli stessi e tipo di dati contenuti.
* Restituzione dei dati riguardanti ogni tweet, formato JSON.
* Restituzione dei dati riguardanti tweet filtrati, formato JSON.
* Restituzione delle statistiche, formato JSON, sul numero di hashtag per ogni tweet contenuto nella timeline contenente gli ultimi cento tweet.
* Restituzione delle statistiche, formato JSON, sul numero hashtag contenuto in ogni post per un determinato utente.

<h2>Contenuti</h2>

<ul type="circle">
 <li><a href="https://github.com/ChiaraAmalia/ProgettoOOP#-richieste-possibili-">Richieste possibili</a></li>
 <li><a href="https://github.com/ChiaraAmalia/ProgettoOOP#-come-iniziare-">Come iniziare</a></li>
 <li><a href="https://github.com/ChiaraAmalia/ProgettoOOP#-eseguire-richieste-">Eseguire richieste</a></li>
 <li><a href="https://github.com/ChiaraAmalia/ProgettoOOP#filtri-disponibili">Filtri disponibili</a></li>
 <li><a href="https://github.com/ChiaraAmalia/ProgettoOOP#-sviluppo-">Sviluppo</a></li>
 <li><a href="https://github.com/ChiaraAmalia/ProgettoOOP#diagramma-delle-classi">Diagramma delle classi</a></li>
 <li><a href="https://github.com/ChiaraAmalia/ProgettoOOP#packages">Packages</a></li>
 <li><a href="https://github.com/ChiaraAmalia/ProgettoOOP#classi">Classi</a></li>
 <li><a href="https://github.com/ChiaraAmalia/ProgettoOOP#-chiamate-">Chiamate</a></li>
 <li><a href="https://github.com/ChiaraAmalia/ProgettoOOP#software-utilizzati">Software utilizzati</a></li>
 <li><a href="https://github.com/ChiaraAmalia/ProgettoOOP#autori">Autori</a></li>
</ul>

<h2> Richieste possibili </h2>

<img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Use%20Case%20Diagram.jpg" alt="diagramma dei casi d'uso" width="600px" height="420px">

<h1> Come iniziare </h1>
Dopo aver scaricato un opportuno ide (ad esempio eclipse) per la visualizzazione del codice in linguaggio Java del programma, è possibile clonare la repository GitHub (attraverso il comando "clone a repository", situato nella show view della finestra Git Repositories). Adesso è possibile importare il progetto attraverso il comando "Import Project" che compare cliccando con tasto destro sulla repository clonata, nella finestra a comparsa.
Quando il programma è pronto, è possibile eseguirlo cliccando con tasto destro sul progetto importato(situato nel Package Explorer); nella finestra a comparsa si troverà il comando "Run as", eseguire il programma come "Spring boot App".

Ora l'applicazione Web Service sarà attiva e in ascolto alla porta http://localhost:8080 (indirizzo IP 127.0.0.1)

<h2> Eseguire richieste </h2>

Per eseguire le richieste GET o POST si può installare un API testing, (ad esempio: Postman). La seguente tabella mostra le richieste possibili.

 | **TIPO** |      **ROTTA**     |                                      **DESCRIZIONE**                                          |
 |----------|--------------------|-----------------------------------------------------------------------------------------------|
 |   GET    | /metadata          | restituisce gli alias utilizzati                                                              |
 |   GET    | /data              | restituisce gli ultimi cento tweet                                                            |
 |   GET    | /stats             | restituisce una statistica sul numero di hashtag contenuti in ogni tweet per gli ultimi cento tweet|
 |   POST   | /data              | restituisce i tweet che rispettano i filtri specificati nel body della richiesta              |
 |   POST   | /stats             | restituisce una statistica sul numero di hashtag utilizzati da un utente(da inserire tramite body) e                                    permette di visualizzare anche gli hashtag utilizzati dall'utente                             |     
                               
 <h4>Filtri disponibili</h4>
 
 |**NOME OPERATORE**|          **ESEMPIO**                        |              **DESCRIZIONE**                    |
 |------------------|---------------------------------------------|-------------------------------------------------|
 | Greater          |{"Hashtag" : { "Greater" : 6}}               | maggiore (valido per campi numerici)            |
 | Less             | {"RetweetCount" : { "Less" : 30}}           | minore (valido per campi numerici)              |
 | Included   |{"Mentions" : { "Included" : ["equipeprivacy"]}}| trova una corrispondenza con i valori dell'array (valido per stringhe)|
 | NotIncluded |{"Lang" : { "NotIncluded" : ["en"]}}       | non trova una corrispondenza con i valori dell'array (valido per stringhe)| 
 |   In             |  {"Hashtag" : { "In" : [2,7]}}              | compreso tra (valido per campi numerici)        |  
 |   Nin            |   {"Hashtag" : { "Nin" : [2,5]}}            |non compreso tra (valido per campi numerici)     |
 |  Created         |{"User" : { "Created" : ["cybersec_feeds"]}} | stampa tutti i tweet creati da un utente (valido per stringhe)|
 |  NotCreated     |{"User" : { "NotCreated" : ["cybersec_feeds"]}}| stampa tutti i tweet non creati da un utente (valido per stringhe)|
 | Yes |{"Mentions" : { "Yes" : []}} | viene utilizzato per filtrare tutti quei tweet in cui sono presenti un'immagine o delle menzioni|
 |Not|{"Image" : { "Not" : []}}  | viene utilizzato per filtrare tutti quei tweet in cui sono non presenti un'immagine o delle menzioni|
 
 In aggiunta, è possibile anche creare dei filtri concatenati, utilizzando il comando "*Type*" (ATTENZIONE: Viene fatto notare che è esclusivamente possibile inserire "Type" con l'iniziale maiuscola,in caso contrario o se viene scritta qualsiasi altra parola verrà lanciata un'eccezione con un messaggio di errore).
 Ad esempio il filtraggio prenderà tutti  i tweet che hanno hashtag compresi tra 2 e 10 e che contengano un'immagine
 
 {"Hashtag": { "In": [2,10]}, "Image": {"Type": "and", "Yes": []}}
 
Inoltre, è possibile concatenare anche più di due campi. Ad esempio, questo filtraggio prenderà tutti i tweet che contengono l'hashtag "android", che non contengono un immagine e che l'account di colui che ha scritto il tweet abbia più di 3000 follower.

 { "Hashtag":{"Included":["android"]}, "Image":{"Type":"and","Not":[]},"Follower":{"Type":"and","Greater":3000 } }

Questo filtraggio, ad esempio, permette di visualizzare i tweet che contengono l'hashtag "cybersecurity", che contengano delle menzioni riferiti ad altri utenti, che siano stati scritti da "clairebotai" e che il tweet abbia più di 50 retweet.

 { "Hashtag":{"Included":["cybersecurity"]}, "Mentions":{"Type":"and","Yes":[]},"User":{"Type":"and", Created:["clairebotai"]},"RetweetCount":{"Type":"and","Greater":50 } }
 
 <h2> Sviluppo </h2>
 
 <h3>Diagramma delle classi</h3>
 
 <img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Class%20Diagram.jpg" alt="diagramma delle classi raffigurante tutti i package con tutte le classi" width="1000px" height="700px">
 
 <h3>Packages</h3>

<img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Class%20Diagram%20package.jpg" alt="diagramma delle classi raffiguranti i packages" width="650px" height="390px">
 
 <h3>Classi</h3>
 
 * **Package it.univpm.ProgettoOOP.controller**
 
  <img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Class%20Diagram%20controller.jpg" alt="diagramma delle classi raffigurante il package controller" width="280px" height="200px">
 
 * **Package it.univpm.ProgettoOOP.database**
 
 <img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Class%20Diagram%20database.jpg" alt="diagramma delle classi raffigurante il package database" width="200px" height="180px">
 
 * **Package it.univpm.ProgettoOOP.Exception**
 
  <img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Class%20Diagram%20Exception.jpg" alt="diagramma delle classi raffigurante il package Exception" width="550px" height="400px">
 
 * **Package it.univpm.ProgettoOOP.model**
   
  <img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Class%20Diagram%20model.jpg" alt="diagramma delle classi raffigurante il package model" width="1000px" height="650px">
 
 * **Package it.univpm.ProgettoOOP.service**
 
   <img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Class%20Diagram%20service.jpg" alt="diagramma delle classi raffigurante il package service" width="500px" height="530px">
 
  * **Package it.univpm.ProgettoOOP.util**
 
 <img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Class%20Diagram%20util.jpg" alt="diagramma delle classi raffigurante il package util" width="900px" height="530px">
 
 * **Package it.univpm.ProgettoOOP.util.filter**
 
  <img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Class%20Diagram%20filter.jpg" alt="diagramma delle classi raffigurante il package filter" width="890px" height="530px">
 
 * **Package it.univpm.ProgettoOOP.util.stats**
 
 <img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Class%20Diagram%20stats.jpg" alt="diagramma delle classi raffigurante il package stats" width="220px" height="180px">
 
 
<h2> Chiamate </h2>

* **Chiamata GET /metadata**

<code>ControllerClass</code> esegue una chiamata tramite il metodo <code>getMetadatas</code>. Nella classe <code>TweetServiceImpl</code>,  nel costruttore, viene inizializzato l'ArrayList che conterrà i metadata, così come viene inizializzata una HashMap che conterrà i metadata identificati con i relativi id; viene poi istanziato il metodo <code>getMetada</code> che ci restituisce una collezione di metadata. <code>ControllerClass</code> trasforma quest'ultima in Json e lo ritorna al client.

<img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Sequence%20Diagram_getMetadata.jpg" alt="Chiamata  GET metadata sequence diagram" width="440px" height="370px">

* **Chiamata GET /data**

<code>ControllerClass</code> esegue una chiamata tramite il metodo <code>getTweets</code>. Nella classe <code>TweetServiceImpl</code>,  nel costruttore, viene inizializzato l'ArrayList che conterrà il file JSON scaricato, così come viene inizializzata una HashMap che conterrà i tweet identificati con i relativi id; viene poi istanziato il metodo <code>getTweet</code> che ci restituisce una collezione di tweet, cioè l'intera timeline contenente gli ultimi cento tweet. <code>ControllerClass</code> trasforma quest'ultima in Json e lo ritorna al client.

<img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Sequence%20Diagram_getData.jpg" alt="Chiamata GET data sequence diagram" width="440px" height="370px">

* **Chiamata POST /data**

<code>ControllerClass</code> esegue una chiamata tramite <code>JsonParserColumn</code> alla classe <code>JsonParser</code>, che insieme a <code>jsonParserOperator</code> effettueranno il parsing del body ricevuto in modo ciclico. Estrapolate le informazioni relative al filtraggio richiesto, verranno utilizzate da <code>instanceFilter</code> per istanziare nuovi oggetti filtro prendedoli della classi contenute nel package it.univpm.ProgettoOOP.util.filter. A questo punto tramite <code>runFilter</code> si potrà eseguire il filtraggio e restituire a <code>ControllerClass</code> l'Arraylist di Tweet filtrato da consegnare al Client in formato Json. 
 
<img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Sequence%20Diagram_PostData.jpg" alt="Chiamata POST data sequence diagram" width="880px" height="610px">
 
* **Chiamata GET /stats**

<code>ControllerClass</code> esegue una chiamata tramite il metodo <code>getStats</code>. Nella classe <code>StatsHashtags</code> viene poi utilizzato un metodo chiamato <code>NumHashtag</code> che restituisce un array di interi(della stessa dimensione della timeline contente gli ultimi cento tweet) dove all'interno sono contenuti i numeri di hashtag per ogni tweet. <code>ControllerClass</code> trasforma quest ultimo in Json e lo ritorna al client.

<img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Sequence%20Diagram%20get%20Stats.jpg" alt="Chiamata GET stats sequence diagram" width="440px" height="370px">

* **Chiamata POST /stats**

<code>ControllerClass</code> esegue una chiamata tramite il metodo <code>getStatsWithPost</code>. Nella classe <code>StatsHashtags</code> viene poi utilizzato un metodo chiamato <code>HashtagTweet</code> che prende in ingresso un ArrayList di tipo Tweet. Questo metodo ci restituirà un ArrayList di tipo NumeroHashtag contente tutti gli hashtag utilizzato da un determinato utente con il relativo numero di volte che è stato utilizzato. <code>ControllerClass</code> trasforma quest ultimo in Json e lo ritorna al client.

<img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Sequence%20Diagram%20postStats.jpg" alt="Chiamata POST stats sequence diagram" width="440px" height="370px">

<h1>Software utilizzati</h1>

* <a href="https://www.eclipse.org/">Eclipse</a> - ambiente di sviluppo integrato
* <a href="https://spring.io/projects/spring-boot">Spring Boot</a> - framework per sviluppo di applicazioni in Java
* <a href="https://maven.apache.org/">Maven</a> - strumento di gestione di progetti
* <a href="http://www.umldesigner.org/">UML Designer</a> - strumento per la realizzazione dei diagrammi UML

<h1>Autori</h1>
<ul type="disc">
 <li><a href="https://github.com/ChiaraAmalia">Chiara Amalia Caporusso</a></li>
 <li><a href="https://github.com/pierocampitelli">Piero Campitelli</a></li>
</ul>
