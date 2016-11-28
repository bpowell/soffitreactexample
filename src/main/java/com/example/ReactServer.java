package com.example;

import jdk.nashorn.api.scripting.NashornScriptEngine;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import javax.annotation.PostConstruct;

public class ReactServer {
        private NashornScriptEngine engineHolder;

        public ReactServer() {
                try {
                        System.out.println("init...");
                        engineHolder = (NashornScriptEngine) new ScriptEngineManager().getEngineByName("nashorn");
                        engineHolder.eval(read("js/polyfill.js"));
                        engineHolder.eval(read("js/main.js"));
                } catch (Exception e) {
                        System.out.println("error!");
                }
        }

        public String render(Object... objs) {
                try {
                        Object html = engineHolder.invokeFunction("serverRender", objs);
                        return String.valueOf(html);
                } catch (Exception e) {
                        throw new RuntimeException(e);
                }
        }

        private Reader read(String path) {
                InputStream in = getClass().getClassLoader().getResourceAsStream(path);
                return new InputStreamReader(in);
        }
}
