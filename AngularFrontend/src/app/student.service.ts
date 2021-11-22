import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {


  private baseUrl : string ="http://localhost:7070/student";

  constructor(private http : HttpClient) { }

  /**
   * 
   * @returns Observable is a memory where our response JSON output will be saved.
   */
  getAllStudent():Observable<Student[]>{
    return this.http.get<Student[]>(`${this.baseUrl}/all`)
  }

  deleteStudent(id: number):Observable<any>{
    return this.http.delete(`${this.baseUrl}/delete/${id}`,{responseType:"text"});
  }

}