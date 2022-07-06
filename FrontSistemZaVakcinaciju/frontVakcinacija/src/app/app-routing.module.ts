import { MedSestraComponent } from './components/med-sestra/med-sestra.component';
import { GradjaninComponent } from './components/gradjanin/gradjanin.component';
import { LoginComponent } from './components/login/login.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InteresovanjeComponent } from './components/interesovanje/interesovanje.component';
import { ObrazacComponent } from './components/obrazac/obrazac.component';
import { PotvrdaComponent } from './components/potvrda/potvrda.component';
import { RegistrationComponent } from './components/registration/registration.component';

const routes: Routes = [

  { path: 'interesovanje', component: InteresovanjeComponent },
  { path: 'obrazac', component: ObrazacComponent },
  { path: 'potvrda', component: PotvrdaComponent },
  { path: 'login', component: LoginComponent },
  { path: 'gradjanin', component: GradjaninComponent },
  { path: 'registration', component: RegistrationComponent },
  { path: 'medSestra', component: MedSestraComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
