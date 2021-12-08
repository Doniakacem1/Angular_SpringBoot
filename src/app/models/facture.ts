import { Client } from "./client";
import { DetailFacture } from './detail-facture';

export class Facture {
  idFacture: number;
  montantRemise: number;
  montantFacture: number;
  dateFacture: Date;
  active: boolean;
  cl: Client;
  details: DetailFacture;
  
}
