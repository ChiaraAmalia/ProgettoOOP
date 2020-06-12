# Progetto Timeline Twitter

Un Web Service è un sistema software in grado di mettersi al servizio di un Client (applicazione, sito web, Postman), comunicando tramite il protocollo HTTP. Un Web service consente quindi agli utenti che vi si collegano di usufruire delle funzioni che mette a disposizione. Con Spring Boot, è stato possibile creare questo software che lancia l'intera applicazione web, compreso il web server integrato.

Questo progetto è finalizzato alla realizzazione di una timeline utente personalizzata contentente tutti i campi utili relativi agli ultimi cento tweet.

La nostra applicazione permette di richiedere mediante API REST (GET o POST) con rotte distinte:
* Restituzione dei metadati, formato JSON, ovvero l’elenco degli attributi, alias degli stessi e tipo di dati contenuti.
* Restituzione dei dati riguardanti ogni tweet, formato JSON.
* Restituzione dei dati riguardanti record filtrati, formato JSON.
* Restituzione delle statistiche sui dati di uno specifico campo.
* Restituzione delle statistiche sui dati di uno specifico campo, su tweet filtrati.

<h2> Richieste possibili </h2>
Use case diagram

<h1> Come iniziare </h1>
Dopo aver scaricato un opportuno ide (ad esempio eclipse) per la visualizzazione del codice in Java del programma, è possibile clonare la repository GitHub (attraverso il comando "clone a repository", situato nella show view della finestra Git Repositories). Adesso è possibile importare il progetto attraverso il comando "Import Project" che compare cliccando con tasto destro sulla repository clonata, nella finestra a comparsa.
Quando il programma è pronto, è possibile eseguirlo cliccando con tasto destro sul progetto importato(situato nel Package Explorer); nella finestra a comparsa si troverà il comando "Run as", eseguire il programma come "Sprign boot App".

Ora l'applicazione Web Service sarà attiva e in ascolto alla porta http://localhost:8080 (indirizzo IP 127.0.0.1)

<h2> Eseguire richieste </h2>
Per eseguire le richieste GET o POST si può installare un API testing, (ad esempio: Postman). La seguente tabella mostra le richieste possibili.

 | **TIPO** |      **ROTTA**     |                                      **DESCRIZIONE**                                          |
 |----------|:------------------:|:----------------------------------------------------------------------------------------------:|
 |   GET    | /metadata          | restituisce gli alias utilizzati                                                              |
 |   GET    | /data              | restituisce gli ultimi cento tweet                                                            |
 |   GET    | /stats?field="nome"| restituisce una statistica sul "nome" specificato fatta sugli ultimi cento tweet              |
 |   POST   | /data              | restituisce i tweet che rispettano i filtri specificati nel body della richiesta              |
 |   POST   | /stats?field="nome"| restituisce una statistica sul "nome" specificato basandosi sui record che rispettano i filtri                                          specificati nel body della richiesta                                                          |     
                               
 
 
<h2> Chiamate </h2>

* Chiamata GET /metadata
<img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Sequence%20Diagram_getMetadata.jpg" alt="Chiamata  GET metadata sequence diagram" width="390px" height="370px">

* Chiamata GET /data
<img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Sequence%20Diagram_getData.jpg" alt="Chiamata GET data sequence diagram" width="390px" height="370px">

* Chiamata POST /data
<img src="https://github.com/ChiaraAmalia/ProgettoOOP/blob/master/UMLDiagram/OOP%20Sequence%20Diagram_PostData.jpg" alt="Chiamata POST data sequence diagram" width="840px" height="590px">
