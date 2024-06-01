package com.example.tanuja.BlogAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping
public class BlogAPIController {

    @Autowired
    BlogRepository blogRepository;

    @GetMapping("/")
    public Iterable<Blog> getAllBlogs(){
        return blogRepository.findAll();
    }

    @PostMapping("/add")
    public Blog addBlog(@RequestBody Blog blog){
        //Blog blog=new Blog();
        Date now=new Date(System.currentTimeMillis());
       // blog.setContent(content);
       // blog.setTitle(title);
       // blog.setTag(tags);
        blog.setPublishedat(now);
        return blogRepository.save(blog);
    }

    @GetMapping("/{id}")
    public Optional<Blog> getBlog(@PathVariable Integer id){
        return blogRepository.findById(id);
    }

    @DeleteMapping("/delete")
    public void deleteBlog(@RequestParam Integer id){
         blogRepository.deleteById(id);
    }
    @PutMapping("/update")
    public void editBlog(@RequestParam Integer id,@RequestBody String content,String title,String tags){
        Blog blog=new Blog();
        blog.setContent(content);
        blog.setTitle(title);
        blog.setTag(tags);
        blogRepository.save(blog);
    }
}
