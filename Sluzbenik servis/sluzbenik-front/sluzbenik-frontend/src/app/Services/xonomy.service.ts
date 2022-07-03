import { Injectable } from '@angular/core';

declare const Xonomy:any;

@Injectable({
  providedIn: 'root'
})
export class XonomyService {

  constructor() { }

  public zahtevSpecification = {
    elements:{
      zahtev:{
        menu:[
          {
            caption: 'Add <imePrezime>',
            action: Xonomy.newElementChild,
            actionParameter:'<imePrezime></imePrezime>',
            hideIf:function(jsElement:any){
              return jsElement.hasChildElement("imePrezime")
            }
          },
          {
            caption: 'Add <pol>',
            action: Xonomy.newElementChild,
            actionParameter:'<pol></pol>',
            hideIf:function(jsElement:any){
              return jsElement.hasChildElement("pol")
            }
          },
          {
            caption: 'Add <jmbg>',
            action: Xonomy.newElementChild,
            actionParameter:'<jmbg></jmbg>',
            hideIf:function(jsElement:any){
              return jsElement.hasChildElement("jmbg")
            }
          },
          {
            caption: 'Add <brojPasosa>',
            action: Xonomy.newElementChild,
            actionParameter:'<brojPasosa></brojPasosa>',
            hideIf:function(jsElement:any){
              return jsElement.hasChildElement("brojPasosa")
            }
          },
          {
            caption: 'Add <razlog>',
            action: Xonomy.newElementChild,
            actionParameter:'<razlog></razlog>',
            hideIf:function(jsElement:any){
              return jsElement.hasChildElement("razlog")
            }
          },
          {
            caption: 'Add <mesto>',
            action: Xonomy.newElementChild,
            actionParameter:'<mesto></mesto>',
            hideIf:function(jsElement:any){
              return jsElement.hasChildElement("mesto")
            }
          },
          {
            caption: 'Add <datumRodjenja>',
            action: Xonomy.newElementChild,
            actionParameter:'<datumRodjenja></datumRodjenja>',
            hideIf:function(jsElement:any){
              return jsElement.hasChildElement("datumRodjenja")
            }
          },
          {
            caption: 'Add <potpis>',
            action: Xonomy.newElementChild,
            actionParameter:'<potpis></potpis>',
            hideIf:function(jsElement:any){
              return jsElement.hasChildElement("potpis")
            }
          }],
        attributes:{}
      },
      imePrezime:{
        displayName: "imePrezime",
        menu:[{
          caption: 'Add <ime>',
          action: Xonomy.newElementChild,
          actionParameter:'<ime></ime>',
          hideIf:function(jsElement:any){
            return jsElement.hasChildElement("ime")
          }
        },
          {
            caption: 'Add <prezime>',
            action: Xonomy.newElementChild,
            actionParameter:'<prezime></prezime>',
            hideIf:function(jsElement:any){
              return jsElement.hasChildElement("prezime")
            }
          }],

      },
      ime:{
        displayName: "ime",
        attributes: {
          asker: Xonomy.askString
        },
        asker: Xonomy.askString,
        hasText: true
      },
      prezime:{
        displayName: "prezime",
        attributes: {
          asker: Xonomy.askString
        },
        hasText: true
      },
      pol:{
        menu:[{
          caption: 'Add <zensko>',
          action: Xonomy.newElementChild,
          actionParameter:'<zensko></zensko>',
          hideIf:function(jsElement:any){
            return jsElement.hasChildElement("zensko")
          }
        },{
          caption: 'Add <musko>',
          action: Xonomy.newElementChild,
          actionParameter:'<musko></musko>',
          hideIf:function(jsElement:any){
            return jsElement.hasChildElement("musko")
          }
        }],
        displayName: "pol",

      },
      zensko:{
        displayName: "zensko",
        attributes: {
          asker: Xonomy.askString
        },
        hasText: true,
        asker: Xonomy.askPicklist,
        askerParameter: [{value: "true", caption: "da"}, {value: "false", caption: "ne"}],
      },
      musko:{
        displayName: "musko",
        attributes: {
          asker: Xonomy.askString
        },
        hasText: true,
        asker: Xonomy.askPicklist,
        askerParameter: [{value: "true", caption: "da"}, {value: "false", caption: "ne"}],
      },
      jmbg:{
        displayName: "jmbg",
        attributes: {
          asker: Xonomy.askString
        },
        hasText: true,
      },
      brojPasosa:{
        displayName: "brojPasosa",
        attributes: {
          asker: Xonomy.askString
        },
        hasText: true,
      },
      razlog:{
        displayName: "razlog",
        attributes: {
          asker: Xonomy.askString
        },
        hasText: true,
      },
      mesto:{
        displayName: "mesto",
        attributes: {
          asker: Xonomy.askString
        },
        hasText: true,
      },
      datumRodjenja:{
        displayName: "datumRodjenja",
        attributes: {
          asker: Xonomy.askString
        },
        hasText: true,
      },
      potpis:{
        displayName: "potpis",
        attributes: {
          asker: Xonomy.askString
        },
        hasText: true,
      }

    }
  }


  //===================================================================================================
  public userSPecification = {
    elements: {
      myUser: {
        menu: [{
          caption: 'Add <jmbg>',
          action: Xonomy.newElementChild,
          actionParameter: '<jmbg></jmbg>',
          hideIf: function (jsElement: any) {
            return jsElement.hasChildElement("jmbg")
          }
        }, {
          caption: 'Add <ime>',
          action: Xonomy.newElementChild,
          actionParameter: '<ime></ime>',
          hideIf: function (jsElement: any) {
            return jsElement.hasChildElement("ime")
          }
        },
          {
            caption: 'Add <prezime>',
            action: Xonomy.newElementChild,
            actionParameter: '<prezime></prezime>',
            hideIf: function (jsElement: any) {
              return jsElement.hasChildElement("prezime")
            }
          },
          {
            caption: 'Add <mail>',
            action: Xonomy.newElementChild,
            actionParameter: '<mail></mail>',
            hideIf: function (jsElement: any) {
              return jsElement.hasChildElement("mail")
            }
          },
          {
            caption: 'Add <sifra>',
            action: Xonomy.newElementChild,
            actionParameter: '<sifra></sifra>',
            hideIf: function (jsElement: any) {
              return jsElement.hasChildElement("sifra")
            }
          },
          {
            caption: 'Add <mobilni>',
            action: Xonomy.newElementChild,
            actionParameter: '<mobilni></mobilni>',
            hideIf: function (jsElement: any) {
              return jsElement.hasChildElement("fiksni")
            }
          },
          {
            caption: 'Add <sifra>',
            action: Xonomy.newElementChild,
            actionParameter: '<sifra></sifra>',
            hideIf: function (jsElement: any) {
              return jsElement.hasChildElement("sifra")
            }
          }],
        attributes: {},
      },
      jmbg: {
        displayName: "jmbg",
        attributes: {
          asker: Xonomy.askString
        },
        hasText: true

      },
      ime: {
        displayName: "ime",
        attributes: {
          asker: Xonomy.askString
        },
        hasText: true

      },
      prezime: {
        displayName: "prezime",
        attributes: {
          asker: Xonomy.askString
        },
        hasText: true

      },
      mail: {
        displayName: "email",
        attributes: {
          asker: Xonomy.askString
        },
        hasText: true

      },
      mobilni: {
        displayName: "mobilni",
        attributes: {
          asker: Xonomy.askString
        },
        hasText: true

      },
      fiksni: {
        displayName: "fiksni",
        attributes: {
          asker: Xonomy.askString
        },
        hasText: true

      },
      sifra: {
        displayName: "sifra",
        attributes: {
          asker: Xonomy.askString
        },
        hasText: true

      }
    }
  }

    //===================================================================================================
    public stanjeDozaSpecification = {
      elements:{
        myUser:{
          menu:[{
            caption: 'Add <fajzer>',
            action: Xonomy.newElementChild,
            actionParameter:'<fajzer></fajzer>',
            hideIf:function(jsElement:any){
              return jsElement.hasChildElement("fajzer")
            }
          },{
            caption: 'Add <sputnjik>',
            action: Xonomy.newElementChild,
            actionParameter:'<sputnjik></sputnjik>',
            hideIf:function(jsElement:any){
              return jsElement.hasChildElement("sputnjik")
            }
          },
            {
              caption: 'Add <sinofarm>',
              action: Xonomy.newElementChild,
              actionParameter:'<sinofarm></sinofarm>',
              hideIf:function(jsElement:any){
                return jsElement.hasChildElement("sinofarm")
              }
            },
            {
              caption: 'Add <moderna>',
              action: Xonomy.newElementChild,
              actionParameter:'<moderna></moderna>',
              hideIf:function(jsElement:any){
                return jsElement.hasChildElement("moderna")
              }
            },
            {
              caption: 'Add <astraZeneca>',
              action: Xonomy.newElementChild,
              actionParameter:'<astraZeneca></astraZeneca>',
              hideIf:function(jsElement:any){
                return jsElement.hasChildElement("astraZeneca")
              }
            }],
          attributes:{},
        },
        fajzer:{
          displayName: "fajzer",
          attributes: {
            asker: Xonomy.askString
          },
          value: "0",
          hasText: true

        },
        moderna:{
          displayName: "moderna",
          value: "0",
          attributes: {
            asker: Xonomy.askString
          },
          hasText: true

        },
        astraZeneca:{
          displayName: "astraZeneca",
          value: "0",
          attributes: {
            asker: Xonomy.askString
          },
          hasText: true

        },
        sputnjik:{
          displayName: "sputnjik",
          value: "0",
          attributes: {
            asker: Xonomy.askString
          },
          hasText: true

        },
        sinofarm:{
          displayName: "sinofarm",
          value: "0",
          attributes: {
            asker: Xonomy.askString
          },
          hasText: true

        }
      }
  }
}
