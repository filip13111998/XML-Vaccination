import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { PotvrdaModel } from '../models/potvrda';
declare const Xonomy:any;
@Injectable({
  providedIn: 'root'
})
export class PotvrdaService {

  private path = "http://localhost:9797/potvrda/saveMyPotvrda"
  constructor(private http: HttpClient) { }

  sendXml(entity: PotvrdaModel) {
    return this.http.post(this.path, entity);
  }

  public ptService = {

    elements:{
      "pt:potvrda":{
        menu:[{

          caption:'Add <pt:sifra>',
          action:Xonomy.newElementChild,
          actionParameter:'<pt:sifra xmlns:pt="http://ftn.uns.ac.rs/potvrda"> </pt:sifra>',
          hideIf: function(jsElement:any){
            return jsElement.hasChildElement("pt:sifra")
          }
        },
        {

          caption:'Add <pt:imePrezime>',
          action:Xonomy.newElementChild,
          actionParameter:'<pt:imePrezime xmlns:pt="http://ftn.uns.ac.rs/potvrda"> </pt:imePrezime>',
          hideIf: function(jsElement:any){
            return jsElement.hasChildElement("pt:imePrezime")
          }
        },
        {

          caption:'Add <pt:datumRodjenja>',
          action:Xonomy.newElementChild,
          actionParameter:'<pt:datumRodjenja xmlns:pt="http://ftn.uns.ac.rs/potvrda"> </pt:datumRodjenja>',
          hideIf: function(jsElement:any){
            return jsElement.hasChildElement("pt:datumRodjenja")
          }
        },
        {

          caption:'Add <pt:pol>',
          action:Xonomy.newElementChild,
          actionParameter:'<pt:pol xmlns:pt="http://ftn.uns.ac.rs/potvrda"> </pt:pol>',
          hideIf: function(jsElement:any){
            return jsElement.hasChildElement("pt:pol")
          }
        },
        {

          caption:'Add <pt:jmbg>',
          action:Xonomy.newElementChild,
          actionParameter:'<pt:jmbg xmlns:pt="http://ftn.uns.ac.rs/potvrda"> </pt:jmbg>',
          hideIf: function(jsElement:any){
            return jsElement.hasChildElement("pt:jmbg")
          }
        },
        {

          caption:'Add <pt:brojDoze>',
          action:Xonomy.newElementChild,
          actionParameter:'<pt:brojDoze xmlns:pt="http://ftn.uns.ac.rs/potvrda"> </pt:brojDoze>',
          
        },
        {

          caption:'Add <pt:zdrastvenaUstanova>',
          action:Xonomy.newElementChild,
          actionParameter:'<pt:zdrastvenaUstanova xmlns:pt="http://ftn.uns.ac.rs/potvrda"> </pt:zdrastvenaUstanova>',
          hideIf: function(jsElement:any){
            return jsElement.hasChildElement("pt:zdrastvenaUstanova")
          }
        },
        {

          caption:'Add <pt:nazivVakcine>',
          action:Xonomy.newElementChild,
          actionParameter:'<pt:nazivVakcine xmlns:pt="http://ftn.uns.ac.rs/potvrda"> </pt:nazivVakcine>',
          hideIf: function(jsElement:any){
            return jsElement.hasChildElement("pt:nazivVakcine")
          }
        },
        {

          caption:'Add <pt:datumIzdavanja>',
          action:Xonomy.newElementChild,
          actionParameter:'<pt:datumIzdavanja xmlns:pt="http://ftn.uns.ac.rs/potvrda"> </pt:datumIzdavanja>',
          hideIf: function(jsElement:any){
            return jsElement.hasChildElement("pt:datumIzdavanja")
          }
        },
        {

          caption:'Add <pt:QRCODE>',
          action:Xonomy.newElementChild,
          actionParameter:'<pt:QRCODE xmlns:pt="http://ftn.uns.ac.rs/potvrda"> </pt:QRCODE>',
          hideIf: function(jsElement:any){
            return jsElement.hasChildElement("pt:QRCODE")
          }
        }
      ],
       
        
        attributes:{}
      },
      "pt:sifra":{
        hasText:true,
        oneliner: true,
        asker: Xonomy.askString
      },
      "pt:imePrezime":{
        menu:[{

          caption:'Add <pt:ime>',
          action:Xonomy.newElementChild,
          actionParameter:'<pt:ime xmlns:pt="http://ftn.uns.ac.rs/potvrda"> </pt:ime>',
          hideIf: function(jsElement:any){
            return jsElement.hasChildElement("pt:ime")
          }
        },
        {

          caption:'Add <pt:prezime>',
          action:Xonomy.newElementChild,
          actionParameter:'<pt:prezime xmlns:pt="http://ftn.uns.ac.rs/potvrda"> </pt:prezime>',
          hideIf: function(jsElement:any){
            return jsElement.hasChildElement("pt:prezime")
          }
        },
      ],
       
        
        attributes:{}
      },
      "pt:ime":{
        hasText:true,
        oneliner: true,
        asker: Xonomy.askString
      },
      "pt:prezime":{
        hasText:true,
        oneliner: true,
        asker: Xonomy.askString
      },
      "pt:datumRodjenja":{
        hasText:true,
        oneliner: true,
        asker: Xonomy.askString
      },
      "pt:pol":{
        asker: Xonomy.askPicklist,
        askerParameter: ["musko","zensko"]
   
      },
      "pt:jmbg":{
        hasText:true,
        oneliner: true,
        asker: Xonomy.askString
      },
      "pt:brojDoze":{
        menu:[{

          caption:'Add <pt:serijaDoza>',
          action:Xonomy.newElementChild,
          actionParameter:'<pt:serijaDoza xmlns:pt="http://ftn.uns.ac.rs/potvrda"> </pt:serijaDoza>',
          hideIf: function(jsElement:any){
            return jsElement.hasChildElement("pt:serijaDoza")
          }
        },
        {

          caption:'Add <pt:datumDoza>',
          action:Xonomy.newElementChild,
          actionParameter:'<pt:datumDoza xmlns:pt="http://ftn.uns.ac.rs/potvrda"> </pt:datumDoza>',
          hideIf: function(jsElement:any){
            return jsElement.hasChildElement("pt:datumDoza")
          }
        },
      ],
       
        
        attributes:{}
      },
      "pt:serijaDoza":{
        hasText:true,
        oneliner: true,
        asker: Xonomy.askString
      },
      "pt:datumDoza":{
        hasText:true,
        oneliner: true,
        asker: Xonomy.askString
      },
      "pt:zdrastvenaUstanova":{
        hasText:true,
        oneliner: true,
        asker: Xonomy.askString
      },
      "pt:nazivVakcine":{
        asker: Xonomy.askPicklist,
        askerParameter: ["Gamaleya","Pfizer","Sinopharm","AstraZeneca","Moderna","All"]
   
      },
      "pt:datumIzdavanja":{
        hasText:true,
        oneliner: true,
        asker: Xonomy.askString
      },
      "pt:QRCODE":{
        hasText:true,
        oneliner: true,
        asker: Xonomy.askString
      }

    }

  }
}
