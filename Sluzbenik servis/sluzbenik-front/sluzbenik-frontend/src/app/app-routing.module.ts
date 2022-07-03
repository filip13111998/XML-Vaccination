import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {IzdavanjePotvrdeComponent} from "./Components/izdavanje-potvrde/izdavanje-potvrde.component";
import {ZahtevSertifikatComponent} from "./Components/zahtev-sertifikat/zahtev-sertifikat.component";
import {LoginComponent} from "./Components/login/login.component";

const routes: Routes = [
  { path: '', component: LoginComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
