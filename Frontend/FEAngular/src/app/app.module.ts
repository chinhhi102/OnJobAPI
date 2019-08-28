//Import Modules
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
//Services
import { StudentService } from './services/student.service';
import { SubjectService } from './services/subject.service';
import { SchoolService } from './services/school.service';
//Components
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './view/header/header.component';
import { FooterComponent } from './view/footer/footer.component';
import { HomeComponent } from './view/home/home.component';
import { StudentComponent} from './view/student/student.component';
import { SchoolComponent } from './view/school/school.component';
import { MajorComponent } from './view/major/major.component';
import { SubjectComponent } from './view/subject/subject.component';
import { DetailComponent } from './view/detail/detail.component';
import { LoginComponent } from './view/login/login.component';
import { ProfileComponent } from './view/profile/profile.component';
import { SettingComponent } from './view/setting/setting.component';
import { CourseComponent } from './view/course/course.component';
import { StudentDetailsComponent } from './view/student/student-details/student-details.component';
import { CreateStudentComponent } from './view/student/create-student/create-student.component';
<<<<<<< HEAD
import { JwPaginationComponent } from 'jw-angular-pagination';

//Services
import { StudentService } from './services/student.service';
import { CreateMajorComponent } from './view/major/create-major/create-major.component';
import { MajorDetailComponent } from './view/major/major-detail/major-detail.component';
=======
import { SubjectDetailsComponent } from './view/subject/subject-details/subject-details.component';
import { CreateSubjectComponent } from './view/subject/create-subject/create-subject.component';
import { SchoolDetailsComponent } from './view/school/school-details/school-details.component';
import { CreateSchoolComponent } from './view/school/create-school/create-school.component'

>>>>>>> 87c7a516e7fcf3e4e24524ff36d1915412f5ee98

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    StudentComponent,
    SchoolComponent,
    MajorComponent,
    SubjectComponent,
    DetailComponent,
    LoginComponent,
    ProfileComponent,
    SettingComponent,
    CourseComponent,
    StudentDetailsComponent,
    CreateStudentComponent,
<<<<<<< HEAD
    CreateMajorComponent,
    MajorDetailComponent,
    JwPaginationComponent
=======
    SubjectDetailsComponent,
    CreateSubjectComponent,
    SchoolDetailsComponent,
    CreateSchoolComponent
>>>>>>> 87c7a516e7fcf3e4e24524ff36d1915412f5ee98
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ StudentService, SubjectService, SchoolService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
