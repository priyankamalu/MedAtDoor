import { Component, OnInit } from '@angular/core';
import { MenuService } from './Services/menu.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  implements OnInit{

  selectedFeature:string;

  constructor(private menuService:MenuService){

  }
  ngOnInit():void{
    this.menuService.featureSelectedEvent.subscribe(feature=>{
       this.selectedFeature=feature;
    });
  }
}
