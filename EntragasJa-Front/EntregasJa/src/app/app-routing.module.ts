import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { PesquisaComponent } from './pesquisa/pesquisa.component';


const routes: Routes = [
  {path: '', redirectTo:'home',pathMatch:'full'},

  {path:'home', component:HomeComponent},
  {path:'pesquisa',component:PesquisaComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
