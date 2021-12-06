import { categorieProduit } from "../detailProduit/categorie-produit.enum";
import { Produit } from "./produit";

export class DetailProduit {
       idDetailProduit : number;
    dateDernierModification: Date ; 
    datecreation : Date ;
    categorieProduit : categorieProduit ;
    produit : Produit ;
}