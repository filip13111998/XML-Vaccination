import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { IzdavanjePotvrdeComponent } from './Components/izdavanje-potvrde/izdavanje-potvrde.component';
import { ZahtevSertifikatComponent } from './Components/zahtev-sertifikat/zahtev-sertifikat.component';
import {HttpClientModule} from "@angular/common/http";
import { LoginComponent } from './Components/login/login.component';
import { RegisterComponent } from './Components/register/register.component';

@NgModule({
  declarations: [
    AppComponent,
    IzdavanjePotvrdeComponent,
    ZahtevSertifikatComponent,
    LoginComponent,
    RegisterComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
