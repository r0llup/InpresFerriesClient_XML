/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inpresferriesclient_xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author Sh1fT
 */

public final class DOMCreator {
    protected String filename;
    protected Document document;

    /**
     * Creates new instance DOMCreator
     * @param filename
     * @param demandeInformations 
     */
    public DOMCreator(String filename, DemandeInformations demandeInformations) {
        this.setFilename(filename);
        this.setDocument(null);
        this.buildDOM(demandeInformations);
        this.saveDOM();
    }

    public String getFilename() {
        return this.filename;
    }

    protected void setFilename(String filename) {
        this.filename = filename;
    }

    public Document getDocument() {
        return this.document;
    }

    protected void setDocument(Document document) {
        this.document = document;
    }

    /**
     * Création d'un nouveau DOM
     * @param di 
     */
    private void buildDOM(DemandeInformations di) {
        try {
            DocumentBuilderFactory fabrique = DocumentBuilderFactory.newInstance();
            fabrique.setValidating(true);
            DocumentBuilder constructeur = fabrique.newDocumentBuilder();
            this.setDocument(constructeur.newDocument());
            // Propriétés du DOM
            this.getDocument().setXmlVersion("1.0");
            //this.getDocument().setXmlsetXmlStandalone(true);
            this.getDocument().setDocumentURI(di.getInputDTDFilename());
            // Création de l'arborescence du DOM
            Element racine = this.getDocument().createElement("Ferry");
            racine.setAttribute("name", di.getNomFerry());
            racine.setAttribute("voyageur", di.getNomVoyageur());
            if (di.getCoursMonetaireCheckBox()) {
                Element monnaie = this.getDocument().createElement("Monnaie");
                if ((di.coursMonetairejListModel.size() % 2) == 0) {
                    for (int i=0 ; i < di.coursMonetairejListModel.getSize()-1; i++) {
                        Element cours = this.getDocument().createElement("Cours");
                        cours.setAttribute("paysFrom", di.coursMonetairejListModel.get(i).toString());
                        cours.setAttribute("paysTo", di.coursMonetairejListModel.get(i+1).toString());
                        monnaie.appendChild(cours);
                    }
                }
                racine.appendChild(monnaie);
            }
            if (di.getMeteoCheckBox()) {
                Element meteo = this.getDocument().createElement("Meteo");
                for (int i=0 ; i < di.coursMonetairejListModel.size(); i++) {
                    Element situation = this.getDocument().createElement("Situation");
                    situation.setAttribute("region", "unknown");
                    situation.setAttribute("pays", di.coursMonetairejListModel.get(i).toString());
                    Element dates = this.getDocument().createElement("Dates");
                    for (int j=0 ; j < di.meteojListModel.getSize(); j++) {
                        Element date = this.getDocument().createElement("Jour");
                        Text jour = this.getDocument().createTextNode(di.meteojListModel.get(j).toString());
                        date.appendChild(jour);
                        dates.appendChild(date);
                    }
                    situation.appendChild(dates);
                    meteo.appendChild(situation);
                }
                racine.appendChild(meteo);
            }
            if (di.getFreetaxCheckBox()) {
                Element freetax = this.getDocument().createElement("Freetax");
                Element alcools = this.getDocument().createElement("Alcools");
                Text alcoolsValue = this.getDocument().createTextNode(di.getAlcools());
                alcools.appendChild(alcoolsValue);
                Element parfums = this.getDocument().createElement("Parfums");
                Text parfumsValue = this.getDocument().createTextNode(di.getParfums());
                parfums.appendChild(parfumsValue);
                Element tabacs = this.getDocument().createElement("Tabacs");
                Text tabacsValue = this.getDocument().createTextNode(di.getTabacs());
                tabacs.appendChild(tabacsValue);
                freetax.appendChild(alcools);
                freetax.appendChild(parfums);
                freetax.appendChild(tabacs);
                racine.appendChild(freetax);
            }
            this.getDocument().appendChild(racine);
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace(System.out);
            System.exit(1);
        }
    }

    /**
     * Sauvegarde du DOM dans un fichier XML
     */
    private void saveDOM() {
        try {
            // Création de la source DOM
            Source source = new DOMSource(this.getDocument());
            // Création du fichier de sortie
            Result resultat = new StreamResult(this.getFilename());
            // Configuration du transformer
            TransformerFactory fabrique = TransformerFactory.newInstance();
            Transformer transformer = fabrique.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
            // Transformation
            transformer.transform(source, resultat);
        } catch(Exception ex){
            ex.printStackTrace(System.out);
            System.exit(1);
        }
    }
}