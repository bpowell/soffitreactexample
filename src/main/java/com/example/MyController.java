package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jdk.nashorn.api.scripting.NashornScriptEngine;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.ArrayList;

@Controller
@ReactApplication
public class MyController {
        @Autowired
        ReactServer react;

        @Autowired
        Soffit soffit;

        @RequestMapping("/hello")
        public ModelAndView hello(final HttpServletRequest req, final HttpServletResponse res) {
                ModelAndView model = soffit.render(req, res, "/hello");
                List<Comment> comments = new ArrayList<>();
                comments.add(new Comment("brandon", "hello world"));
                List<Course> courses = new ArrayList<>();
                courses.add(new Course("compilers", "cse450"));

                model.addObject("data", react.render(comments, courses));
                model.addObject("comments", comments);
                return model;
        }

}
