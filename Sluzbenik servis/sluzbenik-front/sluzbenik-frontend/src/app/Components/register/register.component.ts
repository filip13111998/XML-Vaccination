import { Component, OnInit } from '@angular/core';

declare const Xonomy:any;

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    let element = document.getElementById("registerEditor");
    let specification = this.userSpecification;
    let xmlString = '<Izvestaj> </Izvestaj>';
    Xonomy.render(xmlString,element,specification);
    console.log(Xonomy);

  }

  public userSpecification = {
    elements: {
      myUser: {
        menu: [{
          caption: 'Add <fajzer>',
          action: Xonomy.newElementChild,
          actionParameter: '<fajzer></fajzer>',
          hideIf: function (jsElement: any) {
            return jsElement.hasChildElement("fajzer")
          }
        }, {
          caption: 'Add <sputnjik>',
          action: Xonomy.newElementChild,
          actionParameter: '<sputnjik></sputnjik>',
          hideIf: function (jsElement: any) {
            return jsElement.hasChildElement("sputnjik")
          }
        },
          {
            caption: 'Add <sinofarm>',
            action: Xonomy.newElementChild,
            actionParameter: '<sinofarm></sinofarm>',
            hideIf: function (jsElement: any) {
              return jsElement.hasChildElement("sinofarm")
            }
          },
          {
            caption: 'Add <moderna>',
            action: Xonomy.newElementChild,
            actionParameter: '<moderna></moderna>',
            hideIf: function (jsElement: any) {
              return jsElement.hasChildElement("moderna")
            }
          },
          {
            caption: 'Add <astraZeneca>',
            action: Xonomy.newElementChild,
            actionParameter: '<astraZeneca></astraZeneca>',
            hideIf: function (jsElement: any) {
              return jsElement.hasChildElement("astraZeneca")
            }
          }],
        attributes: {},
      },
      fajzer: {
        displayName: "fajzer",
        attributes: {
          asker: Xonomy.askString
        },
        value: "0",
        hasText: true

      },
      moderna: {
        displayName: "moderna",
        value: "0",
        attributes: {
          asker: Xonomy.askString
        },
        hasText: true

      },
      astraZeneca: {
        displayName: "astraZeneca",
        value: "0",
        attributes: {
          asker: Xonomy.askString
        },
        hasText: true

      },
      sputnjik: {
        displayName: "sputnjik",
        value: "0",
        attributes: {
          asker: Xonomy.askString
        },
        hasText: true

      },
      sinofarm: {
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
