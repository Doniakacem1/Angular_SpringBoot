import { Component, OnInit } from '@angular/core';
import { Stock } from '../models/stock';
import { StockService } from '../stock.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-list-stock',
  templateUrl: './list-stock.component.html',
  styleUrls: ['./list-stock.component.sass']
})
export class ListStockComponent implements OnInit {
stocks:Stock[];
list: Stock[];
  constructor(private ps:StockService, private ac:ActivatedRoute) { }

  ngOnInit(): void {
    this.ps.getStockList().subscribe((st)=>this.stocks=st);
  }
  deleteStock(i : number , j : number){
    this.ps.deleteStock(i).subscribe();
    this.stocks.splice(j,1);
    
      }
}
