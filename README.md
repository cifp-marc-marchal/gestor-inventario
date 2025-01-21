# Gestió de l’Inventari de l’Institut

## Descripció del projecte
Aquest projecte consisteix en el desenvolupament d’un programa que permet gestionar l’inventari de l’institut mitjançant un conjunt de funcionalitats. El programa utilitzarà un array d’**strings** per emmagatzemar els noms dels productes i oferirà diverses opcions per interactuar amb l’inventari de manera fàcil i eficient.

## Funcionalitats principals

1. **Afegir un producte a l’inventari**
   - Permet afegir nous productes al sistema.

2. **Eliminar un producte per nom**
   - Elimina un producte de l’inventari cercant pel seu nom.

3. **Eliminar un producte per posició**
   - Elimina un producte en base a la seva posició dins de l’array.

4. **Mostrar tota la llista de productes**
   - Mostra tots els productes de l’inventari actual.

5. **Mostrar un resum de l’inventari**
   - Llista el nom de cada producte juntament amb la seva quantitat total, independentment de majúscules i minúscules.

6. **Modificar un producte**
   - Permet canviar el nom d’un producte existent.

7. **Substituir un producte per un altre (per posició)**
   - Substitueix un producte en una posició específica per un altre.

8. **Persistència de dades** (opcional)
   - Guarda i recupera les dades d’inventari a través d’un fitxer.

## Requisits tècnics

- El programa disposa d’un **menú principal** que es mostra sempre al principi de l’execució i després de cada acció.
- El menú només desapareix quan l’usuari selecciona l’opció de sortir.
- L’array d’inventari es redimensiona automàticament després d’eliminar productes per optimitzar l’ús de memòria.
- Es gestionen noms de productes ignorant les diferències entre majúscules i minúscules (per exemple, `Cadira` és equivalent a `cadira`).

## Metodologia de treball

Aquest projecte es desenvoluparà en equip seguint la metodologia **Scrum**. Per facilitar la col·laboració i la gestió de tasques s’utilitzarà un tauler **Kanban** en una de les eines següents:

- **Asana**
- **Monday.com**
- **Jira**
- **Trello**

### Sprints
El projecte es divideix en **4 sprints** d’una setmana cadascun. Durant cada sprint es realitzaran les següents activitats:

- Reunions de planificació per estimar i distribuir tasques entre els membres.
- Execució i seguiment del treball assignat.
- Revisió i validació de tasques completades.

### Git i GitHub

Per garantir un bon control de versions, es farà servir **Git** amb la plataforma **GitHub**. 

- Un membre de l’equip crearà un repositori que contindrà tot el codi del projecte.
- Es treballarà en **branques separades** i no es permetrà fer canvis directament a la branca `main`.
- Les contribucions es faran mitjançant **pull requests**, que hauran de ser aprovades per tots els membres de l’equip abans de ser fusionades.

## Documentació

Es crearà una documentació que inclourà:

1. **Guia d’execució del programa**
   - Instruccions per instal·lar i executar el programa.

2. **Registre de reunions**
   - Resum de les minutes de totes les reunions realitzades durant els sprints.

3. **Fitxer README**
   - Aquest fitxer descriurà el projecte i com col·laborar-hi.

La documentació es publicarà al repositori en format PDF. Opcionalment, es podrà incloure directament en el fitxer README del repositori.

## Dates importants

- **Durada del projecte:** 4 sprints (4 setmanes).
- **Data límit d’entrega:** 9 de febrer.

## Contribució

Per col·laborar en el projecte:

1. Cloneu el repositori:
   ```bash
   git clone <enllaç-del-repositori>
   ```

2. Creeu una branca nova per la vostra tasca:
   ```bash
   git checkout -b nom-de-la-branca
   ```

3. Feu els canvis necessaris i creeu una pull request:
   ```bash
   git add .
   git commit -m "Missatge del commit"
   git push origin nom-de-la-branca
   ```

4. Espereu la revisió i aprovació per part de l’equip.

---

**Equip de desenvolupament:**
- [Leonie Gabriella Kleindorp]
- [Joan Bonet Puig]
- [Miquel Bonet Puig]
- [Marc Marchal Pastor]
