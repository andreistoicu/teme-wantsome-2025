**Assignment 1: Bank Account**

1. Ar trebui sa in inlocuiesti clasele care se termina in '*Form' cu layerul de repository, sa creezi un bean 
si acolo practic sa faci/sau sa simulezi conexiunea cu baza de date

Adica Controller - deleaga catre Service si service deleaga catre Repository care la randul .

Controller -> Service -> Repository (aici face conexiunea cu db)

daca faci acest layer de repository si il apelezi din controller, cred ca se leaga si html-urile tale si
ne putem uita impreuna daca vrei ulterior

2. Ar trebui apoi sa injectezi dependintele , adica layer de Service in Controller si layer de repository in service, 
cu una dintre cele 3 metode constructor injection, setter injection sau @Autowired

e bine ca ai folosit bean-uri, html-uri, endpointuri, adnotari specifice de bean etc

succes si cu restul !!! daca te mai blochezi dupa ce faci cele 2 puncte de sus, te pot ajuta punctual daca ai nevoie