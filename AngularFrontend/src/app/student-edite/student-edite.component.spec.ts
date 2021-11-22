import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentEditeComponent } from './student-edite.component';

describe('StudentEditeComponent', () => {
  let component: StudentEditeComponent;
  let fixture: ComponentFixture<StudentEditeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StudentEditeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentEditeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
