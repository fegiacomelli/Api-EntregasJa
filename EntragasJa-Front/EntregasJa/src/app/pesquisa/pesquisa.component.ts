import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Encomenda } from '../model/Encomenda';
import { EncomendaService } from '../service/encomenda.service';

@Component({
  selector: 'app-pesquisa',
  templateUrl: './pesquisa.component.html',
  styleUrls: ['./pesquisa.component.css']
})
export class PesquisaComponent implements OnInit {
    encomenda: Encomenda
    numeroRastreio: string 
    nRastreio:string
  
    


  constructor(
    private router: Router,
    private EncomendaService: EncomendaService,
  ) { }

  ngOnInit() {
  }

  pesquisar(){
    this.EncomendaService.getByEncomenda(this.nRastreio).subscribe((resp: Encomenda)=>
    {
     return this.encomenda=resp
    })
   

  }

}
