import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  message:string ="From Hello Component";


  getMessage():string{
  return "From getMessage() hello component";
  }

  myClicker():void{
    alert("Button Clicked");
  }
}