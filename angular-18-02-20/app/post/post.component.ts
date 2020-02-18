import { Component, OnInit } from '@angular/core';
import { PostserviceService } from '../postservice.service';
import { PostModel} from '../post.model'
@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {
  posts : PostModel[]=[];
  constructor(private dataService:PostserviceService) { }

  ngOnInit(): void {
    this.dataService.getPosts().subscribe(data => this.posts = data);
  }

}
