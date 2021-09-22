import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Encomenda } from '../model/Encomenda';
import { EncomendaService } from '../service/encomenda.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  encomenda: Encomenda 
  numeroRastreio: string 
  
  constructor() { }

  ngOnInit(){
  }


}
