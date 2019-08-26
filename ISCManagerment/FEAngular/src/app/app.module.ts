//Import
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

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
//Services
import { StudentService } from './services/student.service';
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
    CourseComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ StudentService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
