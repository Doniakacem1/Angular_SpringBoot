import { Produit } from "./Produit";

export class DetailFacture {
idDetailFacture: number;
 qte: number;
prixTotatl: number;
 pourcentageRemise: number;
  montantRemise: number;
  detailfacture: DetailFacture;
  pro: Produit;
}
