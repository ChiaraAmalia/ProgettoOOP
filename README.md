# Progetto Timeline Twitter

Un Web Service è un sistema software in grado di mettersi al servizio di un Client (applicazione, sito web, Postman), comunicando tramite il protocollo HTTP. Un Web service consente quindi agli utenti che vi si collegano di usufruire delle funzioni che mette a disposizione. Con Spring Boot, è stato possibile creare questo software che lancia l'intera applicazione web, compreso il web server integrato.

Questo progetto è finalizzato alla realizzazione di una timeline utente personalizzata contentente tutti i campi utili relativi agli ultimi cento tweet.

La nostra applicazione permette di richiedere mediante API REST (GET o POST) con rotte distinte:
* Restituzione dei metadati, formato JSON, ovvero l’elenco degli attributi, alias degli stessi e tipo di dati contenuti.
* Restituzione dei dati riguardanti ogni tweet, formato JSON.
* Restituzione dei dati riguardanti record filtrati, formato JSON.
* Restituzione delle statistiche sui dati di uno specifico campo.
* Restituzione delle statistiche sui dati di uno specifico campo, su tweet filtrati.

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
Use case diagram

<h1> Come iniziare </h1>
Dopo aver scaricato un opportuno ide (ad esempio eclipse) per la visualizzazione del codice in Java del programma, è possibile clonare la repository GitHub (attraverso il comando "clone a repository", situato nella show view della finestra Git Repositories). Adesso è possibile importare il progetto attraverso il comando "Import Project" che compare cliccando con tasto destro sulla repository clonata, nella finestra a comparsa.
Quando il programma è pronto, è possibile eseguirlo cliccando con tasto destro sul progetto importato(situato nel Package Explorer); nella finestra a comparsa si troverà il comando "Run as", eseguire il programma come "Spring boot App".

Ora l'applicazione Web Service sarà attiva e in ascolto alla porta http://localhost:8080 (indirizzo IP 127.0.0.1)

<h2> Eseguire richieste </h2>

Per eseguire le richieste GET o POST si può installare un API testing, (ad esempio: Postman). La seguente tabella mostra le richieste possibili.

 | **TIPO** |      **ROTTA**     |                                      **DESCRIZIONE**                                          |
 |----------|--------------------|-----------------------------------------------------------------------------------------------|
 |   GET    | /metadata          | restituisce gli alias utilizzati                                                              |
 |   GET    | /data              | restituisce gli ultimi cento tweet                                                            |
 |   GET    | /stats?field="nome"| restituisce una statistica sul "nome" specificato fatta sugli ultimi cento tweet              |
 |   POST   | /data              | restituisce i tweet che rispettano i filtri specificati nel body della richiesta              |
 |   POST   | /stats?field="nome"| restituisce una statistica sul "nome" specificato basandosi sui record che rispettano i filtri                                          specificati nel body della richiesta                                                          |     
                               
 <h4>Filtri disponibili</h4>
 
 |**NOME OPERATORE**|          **ESEMPIO**                        |              **DESCRIZIONE**                    |
 |------------------|---------------------------------------------|-------------------------------------------------|
 | Greater          |                                             | maggiore (valido per campi numerici)            |
 | Less             |                                             | minore (valido per campi numerici)              |
 | Included    |{"Hashtag" : { "Included" : ["cybersecurity"]}}| trova una corrispondenza con i valori dell'array (valido per stringhe)|
 | NotIncluded |{"Image" : { "NotIncluded" : ["photo"]}}   | non trova una corrispondenza con i valori dell'array (valido per stringhe)| 
 |   In             |                                             | compreso tra (valido per campi numerici)        |  
 |   Nin            |                                             |non compreso tra (valido per campi numerici)     |
 
 In aggiunta, è possibile anche creare dei filtri concatenati, utilizzando il comando "*type*". Ad esempio il filtraggio prenderà tutti  i tweet che contengono l'hashtag "linux" ma non contengono un'immagine
 
 {"Hashtag": { "Included": ["linux"]}, "Image": {"type": "and", "NotIncluded": ["photo"]}}
 
 <h2> Sviluppo </h2>
 
 <h3>Diagramma delle classi</h3>
 uml class diagram completo da aggiungere qua
 
 <h3>Packages</h3>

<img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Class%20Diagram%20package.jpg" alt="diagramma delle classi raffiguranti i packages" width="650px" height="370px">
 
 <h3>Classi</h3>
 
 * **Package it.univpm.ProgettoOOP.controller**
 
 
 * **Package it.univpm.ProgettoOOP.database**
 
 
 * **Package it.univpm.ProgettoOOP.Exception**
 
 
 * **Package it.univpm.ProgettoOOP.model**
 
 
 * **Package it.univpm.ProgettoOOP.service**
 
 
 * **Package it.univpm.ProgettoOOP.util**
 
 
 * **Package it.univpm.ProgettoOOP.util.filter**
 
 
 * **Package it.univpm.ProgettoOOP.util.stats**
 

 
<h2> Chiamate </h2>

* **Chiamata GET /metadata**

<code>ControllerClass</code> esegue una chiamata tramite il metodo <code>getMetadatas</code>. Nella classe <code>TweetServiceImpl</code>,  nel costruttore, viene inizializzato l'ArrayList che conterrà i metadata, così come viene inizializzata una HashMap che conterrà i metadata identificati con i relativi id; viene poi istanziato il metodo <code>getMetada</code> che ci restituisce una collezione di metadata. <code>ControllerClass</code> trasforma quest'ultima in Json e lo ritorna al client.

<img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Sequence%20Diagram_getMetadata.jpg" alt="Chiamata  GET metadata sequence diagram" width="440px" height="370px">

* **Chiamata GET /data**

<code>ControllerClass</code> esegue una chiamata tramite il metodo <code>getTweets</code>. Nella classe <code>TweetServiceImpl</code>,  nel costruttore, viene inizializzato l'ArrayList che conterrà il file JSON scaricato, così come viene inizializzata una HashMap che conterrà i tweet identificati con i relativi id; viene poi istanziato il metodo <code>getTweet</code> che ci restituisce una collezione di tweet, cioè l'intera timeline contenente gli ultimi cento tweet. <code>ControllerClass</code> trasforma quest'ultima in Json e lo ritorna al client.

<img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Sequence%20Diagram_getData.jpg" alt="Chiamata GET data sequence diagram" width="440px" height="370px">

* **Chiamata POST /data**

<code>ControllerClass</code> esegue una chiamata tramite <code>JsonParserColumn</code> alla classe <code>JsonParser</code>, che insieme a <code>jsonParserOperator</code> effettueranno il parsing del body ricevuto in modo ciclico. Estrapolate le informazioni relative al filtraggio richiesto, verranno utilizzate da <code>instanceFilter</code> per istanziare nuovi oggetti filtro prendedoli della classi contenute nel package it.univpm.ProgettoOOP.util.filter. A questo punto tramite <code>runFilter</code> si potrà eseguire il filtraggio e restituire a <code>ControllerClass</code> l'Arraylist di Record filtrato da consegnare al Client in formato Json. 
 
<img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Sequence%20Diagram_PostData.jpg" alt="Chiamata POST data sequence diagram" width="880px" height="610px">
 
* **Chiamata GET /stats?field="nome"**


* **Chiamata POST /stats?field="nome"**


<h1>Software utilizzati</h1>

* <a href="https://www.eclipse.org/">Eclipse</a> - ambiente di sviluppo integrato
* <a href="https://spring.io/projects/spring-boot">Spring Boot</a> - framework per sviluppo applicazioni Java
* <a href="https://maven.apache.org/">Maven</a> - strumento di gestione di progetti

<h1>Autori</h1>
<ul type="disc">
 <li><a href="https://github.com/ChiaraAmalia">Chiara Amalia Caporusso</a></li>
 <li><a href="https://github.com/pierocampitelli">Piero Campitelli</a></li>
</ul>
