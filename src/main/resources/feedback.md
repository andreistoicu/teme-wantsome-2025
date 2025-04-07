**tema 1 - SpringBean**

imi place ce ai facut, ai respectat cerintele 

doar pachetele nefolosite le-am sters eu, apar cu acel scris sters, e chestie de estetica care nu afecteaza functionalitatea, 
dar e bine sa le stergi si are si intelIJ o functionalitate care le sterge automat daca vrei... oricum , e chestie mica de detaliu doar

felicitari  !!!


**tema 3 - Spring - BankAccount**

in linii mari ai abordat bine, te descurci bine , se vede ca exersezi

eu am pus inapoi acel application.peroperties din /resources, chiar daca nu folosesti nimic de acolo, 
acel fisier e un fisier de configuratie standard si e bine sa il lasi acolo

am corectat denumierea , cum poti vedea pe commit-uri, acolo unde nu corespundea si neaparat sa nu uiti, ca atunci cand
utilizam thymeleaf, trebuie sa folosim folderul de 'templates' din /resources, pentru ca acolo il cauta spring-ul si daca nu 
il gaseste , e ca si cum nu l-ai fi facut

oricum , per ansamblu bine, continua aceste cateva saptamani tot asa , apoi proiectul o sa iti para mult mai usor de facut


**tema 4 - Spring - Courses**
ca sa porneasca trebuia eliminata partea aia din Main de @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
folosim acel exclude doar cand nu avem baze de date, insa acum folosim H2 ca ne jucam cu baza de date

am vazut ca ai abordat exercitiul 1, e bine ca unele elemente le-ai folosit si pare ca deja incepi sa le stapanesti, mar refer aici la:
crearea de layere si bean-uri, html-uri, controller, endpointuri, injetie de dependinte etc.

este bine, ai avut doar cateva erori in html  ,lipsea o '}' si la Controller a fost mai mult de completat, insa arunca un ochi sa vezi .

bravo!, te incurajez sa continui si cu restul exercitiului sau cu exercitiu 2


