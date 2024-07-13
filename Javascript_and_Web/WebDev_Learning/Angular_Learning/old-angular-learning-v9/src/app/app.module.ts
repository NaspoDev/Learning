import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";

import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { MyModuleModule } from "./my-module/my-module.module";

// Modules are defined with the @NgModule decorator. They are a way to organize your components.
// You can generate one with "ng generate module <module-name>".
@NgModule({
  // You must declare the components in your modules here.
  declarations: [AppComponent],
  imports: [BrowserModule, AppRoutingModule, MyModuleModule], // Import direct sub-modules that are used here.
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
