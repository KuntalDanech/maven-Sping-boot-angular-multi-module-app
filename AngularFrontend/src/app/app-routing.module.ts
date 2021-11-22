import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StudentAllComponent } from './student-all/student-all.component';
import { StudentCreateComponent } from './student-create/student-create.component';
import { StudentEditeComponent } from './student-edite/student-edite.component';

const routes: Routes = [
  {path : 'all', component:StudentAllComponent},
  {path : 'add', component:StudentCreateComponent},
  {path : 'edit/:id"', component:StudentEditeComponent},
  {path : '', redirectTo:'all', pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
