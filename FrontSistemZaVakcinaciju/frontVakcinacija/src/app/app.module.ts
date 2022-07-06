import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InteresovanjeComponent } from './components/interesovanje/interesovanje.component';
import { PotvrdaComponent } from './components/potvrda/potvrda.component';
import { ObrazacComponent } from './components/obrazac/obrazac.component';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './components/login/login.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { GradjaninComponent } from './components/gradjanin/gradjanin.component';
import { VaccinationComponent } from './components/gradjanin/vaccination/vaccination.component';
import { DocumentsComponent } from './components/gradjanin/documents/documents.component';
import { MedSestraComponent } from './components/med-sestra/med-sestra.component';
import { MedDocumentsComponent } from './components/med-sestra/med-documents/med-documents.component';
import { MedVaccinationComponent } from './components/med-sestra/med-vaccination/med-vaccination.component';
@NgModule({
  declarations: [
    AppComponent,
    InteresovanjeComponent,
    PotvrdaComponent,
    ObrazacComponent,
    LoginComponent,
    RegistrationComponent,
    GradjaninComponent,
    VaccinationComponent,
    DocumentsComponent,
    MedSestraComponent,
    MedDocumentsComponent,
    MedVaccinationComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
