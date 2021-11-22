import { Component, OnInit } from '@angular/core';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-student-all',
  templateUrl: './student-all.component.html',
  styleUrls: ['./student-all.component.css']
})
export class StudentAllComponent implements OnInit {

  students  : Student[] = [];
  message : string = '';

  // Student service and Student All component are now connected
  /**
   * For java assume below
   * 
   * @AutoWired
   * private StudentService service;
   */
  constructor(private service : StudentService) { }

  ngOnInit(): void {
    this.getAllStudents();
  }

  getAllStudents(){
    // Here we are calling n/w call and Observavle of Student[] will be retuned.
    // We are subscribing Observable memory into Student[] instance variable.
    // this instance variable can be accessed in html page via angular tags for instance *ngFor
    this.service.getAllStudent().subscribe(
      data=>{
        this.students = data;
      },
      error=>{
        console.log(error);
        this.students=[];
      }
    );
  }

  deleteStudent(id: number){
    this.service.deleteStudent(id).subscribe(
      data=>{
        this.message = data;
        this.getAllStudents();
      },
      error=>{
        console.log(error);
      }
    );
  }
}